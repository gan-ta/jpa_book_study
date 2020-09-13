package practice.capter5;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ITEM_PRACTICE5_GENERATOR",
        sequenceName = "ITEM_PRACTICE5",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_item5")
public class Item5 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ITEM_PRACTICE5_GENERATOR")
    @Column(name = "ITEM_ID")
    private Long id;


    private String name;

    private int price;

    private int stockQuentity;
}
