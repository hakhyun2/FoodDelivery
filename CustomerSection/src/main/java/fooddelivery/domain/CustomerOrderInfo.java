package fooddelivery.domain;

import fooddelivery.CustomerSectionApplication;
import fooddelivery.domain.CanceledOrder;
import fooddelivery.domain.PaidOrder;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerOrderInfo_table")
@Data
public class CustomerOrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String telno;

    private String address;

    private String memo;

    @ElementCollection
    private List<String> menu;

    @PostPersist
    public void onPostPersist() {
        PaidOrder paidOrder = new PaidOrder(this);
        paidOrder.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        fooddelivery.external.OwnerOrderInfo ownerOrderInfo = new fooddelivery.external.OwnerOrderInfo();
        // mappings goes here
        CustomerSectionApplication.applicationContext
            .getBean(fooddelivery.external.OwnerOrderInfoService.class)
            .orderReject(ownerOrderInfo);

        CanceledOrder canceledOrder = new CanceledOrder(this);
        canceledOrder.publishAfterCommit();
    }

    public static CustomerOrderInfoRepository repository() {
        CustomerOrderInfoRepository customerOrderInfoRepository = CustomerSectionApplication.applicationContext.getBean(
            CustomerOrderInfoRepository.class
        );
        return customerOrderInfoRepository;
    }
}
