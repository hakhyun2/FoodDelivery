package fooddelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Deliverylist_table")
@Data
public class Deliverylist {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
