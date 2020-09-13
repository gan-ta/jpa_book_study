package practice.progress.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.criterion.Order;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderItemPractice {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private ItemPractice item;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderPractice order;

    private int orderprice;

    private int count;

}
