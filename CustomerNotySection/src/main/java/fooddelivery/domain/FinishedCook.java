package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FinishedCook extends AbstractEvent {

    private Long id;
}
