package practice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ITEM_PRACTICE_GENERATOR",
        sequenceName = "ITEM_PRACTICE",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ITEM_PRACTICE_GENERATOR")
    @Column(name = "ITEM_ID")
    private Long id;


    private String name;

    private int price;

    private int stockQuentity;
}
