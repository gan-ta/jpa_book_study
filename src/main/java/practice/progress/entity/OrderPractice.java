package practice.progress.entity;

import example.capter7.global.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderPractice extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberPractice member;

    public void addMember(MemberPractice member){
        if(this.member != null){
            member.getOrders().remove(this);
        }
        this.member = member;
        member.getOrders().add(this);
    }

}
