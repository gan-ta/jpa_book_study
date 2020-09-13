package practice.progress.entity;

import lombok.Getter;
import lombok.Setter;
import practice.progress.global.AddressPractice;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DeliveryPractice {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderPractice order;

//    private String city;
//
//    private String street;
//
//    private String zipcode;

    @Embedded
    private AddressPractice address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;


}
