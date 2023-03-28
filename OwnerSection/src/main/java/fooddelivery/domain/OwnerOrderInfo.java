package fooddelivery.domain;

import fooddelivery.OwnerSectionApplication;
import fooddelivery.domain.ApprovedOrder;
import fooddelivery.domain.RejectedOrder;
import fooddelivery.domain.StrartedCook;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OwnerOrderInfo_table")
@Data
public class OwnerOrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        RejectedOrder rejectedOrder = new RejectedOrder(this);
        rejectedOrder.publishAfterCommit();

        ApprovedOrder approvedOrder = new ApprovedOrder(this);
        approvedOrder.publishAfterCommit();

        StrartedCook strartedCook = new StrartedCook(this);
        strartedCook.publishAfterCommit();
    }

    public static OwnerOrderInfoRepository repository() {
        OwnerOrderInfoRepository ownerOrderInfoRepository = OwnerSectionApplication.applicationContext.getBean(
            OwnerOrderInfoRepository.class
        );
        return ownerOrderInfoRepository;
    }

    public static void loadOrder(PaidOrder paidOrder) {
        /** Example 1:  new item 
        OwnerOrderInfo ownerOrderInfo = new OwnerOrderInfo();
        repository().save(ownerOrderInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(paidOrder.get???()).ifPresent(ownerOrderInfo->{
            
            ownerOrderInfo // do something
            repository().save(ownerOrderInfo);


         });
        */

    }
}
