package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CanceledOrder extends AbstractEvent {

    private Long id;
    private String name;
    private String telno;
    private String address;
    private String memo;
    private List<String> menu;

    public CanceledOrder(CustomerOrderInfo aggregate) {
        super(aggregate);
    }

    public CanceledOrder() {
        super();
    }
}
