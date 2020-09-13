package practice.capter4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ORDER_PRACTICE4_GENERATOR",
        sequenceName = "ORDER_PRACTICE4",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_order4")
public class Order4 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ORDER_PRACTICE4_GENERATOR")
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;


    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;


    @Enumerated(EnumType.STRING)
    private OrderStatus4 status;


}
