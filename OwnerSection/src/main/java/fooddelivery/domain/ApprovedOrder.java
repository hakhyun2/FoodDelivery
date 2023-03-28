package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ApprovedOrder extends AbstractEvent {

    private Long id;

    public ApprovedOrder(OwnerOrderInfo aggregate) {
        super(aggregate);
    }

    public ApprovedOrder() {
        super();
    }
}
