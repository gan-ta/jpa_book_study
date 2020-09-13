package practice.capter4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ITEM_PRACTICE4_GENERATOR",
        sequenceName = "ITEM_PRACTICE4",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_item4")
public class Item4 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ITEM_PRACTICE4_GENERATOR")
    @Column(name = "ITEM_ID")
    private Long id;


    private String name;

    private int price;

    private int stockQuentity;
}
