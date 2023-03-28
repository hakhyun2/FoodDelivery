package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RejectedOrder extends AbstractEvent {

    private Long id;

    public RejectedOrder(OwnerOrderInfo aggregate) {
        super(aggregate);
    }

    public RejectedOrder() {
        super();
    }
}
