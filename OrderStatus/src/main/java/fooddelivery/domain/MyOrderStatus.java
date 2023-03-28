package fooddelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MyOrderStatus_table")
@Data
public class MyOrderStatus {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
