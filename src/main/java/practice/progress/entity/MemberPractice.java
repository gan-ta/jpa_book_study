package practice.progress.entity;

import lombok.Getter;
import lombok.Setter;
import practice.progress.global.AddressPractice;
import practice.progress.global.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class MemberPractice  extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

//    private String city;
//
//    private String street;
//
//    private String zipcode;

    @Embedded
    private AddressPractice address;

    @OneToMany(mappedBy = "member")
    private List<OrderPractice> orders = new ArrayList<OrderPractice>();

}
