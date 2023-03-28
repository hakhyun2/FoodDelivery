package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StrartedCook extends AbstractEvent {

    private Long id;

    public StrartedCook(OwnerOrderInfo aggregate) {
        super(aggregate);
    }

    public StrartedCook() {
        super();
    }
}
