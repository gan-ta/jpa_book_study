package practice.progress.entity;

import example.capter7.global.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class OrderPractice extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private MemberPractice member;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private DeliveryPractice delivery;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItemPractice> orderItemList = new ArrayList<OrderItemPractice>();

    public void addMember(MemberPractice member){
        if(this.member != null){
            member.getOrders().remove(this);
        }
        this.member = member;
        member.getOrders().add(this);
    }

}
