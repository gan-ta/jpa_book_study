package practice.capter4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_ITEM_PRACTICE4_GENERATOR",
        sequenceName = "ORDER_ITEM_PRACTICE4",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order_item4")
public class OrderItem4 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_ITEM_PRACTICE4_GENERATOR")
    @Column(name = "ITEM_ORDER_ID")
    private Long id;

    @Column(name = "ITEM_ID")
    private Long itemId;

    @Column(name = "ORDER_ID")
    private Long orderId;

    private int orderPrice;
    private int count;
}
