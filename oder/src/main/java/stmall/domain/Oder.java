package stmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stmall.OderApplication;

@Entity
@Table(name = "Oder_table")
@Data
//<<< DDD / Aggregate Root
public class Oder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userid;

    private String productName;

    private Long productId;

    public static OderRepository repository() {
        OderRepository oderRepository = OderApplication.applicationContext.getBean(
            OderRepository.class
        );
        return oderRepository;
    }

    public void order() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
