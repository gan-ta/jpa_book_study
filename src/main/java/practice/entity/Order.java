package practice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_PRACTICE_GENERATOR",
        sequenceName = "ORDER_PRACTICE",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_PRACTICE_GENERATOR")
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;


    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;


    @Enumerated(EnumType.STRING)
    private OrderStatus status;


}
