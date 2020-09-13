package practice.capter5;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_ITEM_PRACTICE5_GENERATOR",
        sequenceName = "ORDER_ITEM_PRACTICE5",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order_item5")
public class OrderItem5 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_ITEM_PRACTICE5_GENERATOR")
    @Column(name = "ITEM_ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item5 item;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order5 order;

    private int orderPrice;
    private int count;
}
