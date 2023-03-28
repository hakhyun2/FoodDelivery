package fooddelivery.domain;

import fooddelivery.DeliverySectionApplication;
import fooddelivery.domain.FinishedDelivery;
import fooddelivery.domain.PickedDelivery;
import fooddelivery.domain.RegisteredDelivery;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryInfo_table")
@Data
public class DeliveryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        PickedDelivery pickedDelivery = new PickedDelivery(this);
        pickedDelivery.publishAfterCommit();

        RegisteredDelivery registeredDelivery = new RegisteredDelivery(this);
        registeredDelivery.publishAfterCommit();

        FinishedDelivery finishedDelivery = new FinishedDelivery(this);
        finishedDelivery.publishAfterCommit();
    }

    public static DeliveryInfoRepository repository() {
        DeliveryInfoRepository deliveryInfoRepository = DeliverySectionApplication.applicationContext.getBean(
            DeliveryInfoRepository.class
        );
        return deliveryInfoRepository;
    }
}
