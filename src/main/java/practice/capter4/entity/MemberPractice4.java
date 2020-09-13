package practice.capter4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "MEMBER_PRACTICE4_GENERATOR",
        sequenceName = "MEMBER_PRACTICE4",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_practice_member4")
public class MemberPractice4 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_PRACTICE4_GENERATOR")
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

}
