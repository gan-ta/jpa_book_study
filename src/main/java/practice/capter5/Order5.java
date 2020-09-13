package practice.capter5;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_PRACTICE5_GENERATOR",
        sequenceName = "ORDER_PRACTICE5",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order5")
public class Order5 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_PRACTICE5_GENERATOR")
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberPractice5 member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem5> orderItems = new ArrayList<OrderItem5>();


    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;


    @Enumerated(EnumType.STRING)
    private OrderStatus5 status;


    public void setMember(MemberPractice5 member){
        if(this.member != null){
            this.member.getOrders().remove(this);
        }
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItem5 orderItem){
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
