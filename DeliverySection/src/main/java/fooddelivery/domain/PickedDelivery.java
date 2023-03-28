package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PickedDelivery extends AbstractEvent {

    private Long id;

    public PickedDelivery(DeliveryInfo aggregate) {
        super(aggregate);
    }

    public PickedDelivery() {
        super();
    }
}
