package Example.member.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@TableGenerator(
        name = "BOARD_SEQ_GENERATOR",
        table = "MY_SEQUENCE",
        pkColumnValue = "BOARD_SEQ", allocationSize = 1
)
@Getter
@Setter
public class TableBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
    generator = "BOARD_SEQ_GENERATOR")
    private Long id;

}
