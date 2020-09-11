package practice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_ITEM_PRACTICE_GENERATOR",
        sequenceName = "ORDER_ITEM_PRACTICE",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_ITEM_PRACTICE_GENERATOR")
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "ITEM_ID")
    private Long itemId;

    @Column(name = "ORDER_ID")
    private Long orderId;

    private int orderPrice;
    private int count;
}
