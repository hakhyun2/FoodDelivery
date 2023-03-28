package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class PaidOrder extends AbstractEvent {

    private Long id;
    private String name;
    private String Telno;
    private String Address;
    private String memo;
    private List<String> menu;
}
