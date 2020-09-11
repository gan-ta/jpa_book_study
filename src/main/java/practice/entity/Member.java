package practice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "MEMBER_PRACTICE_GENERATOR",
        sequenceName = "MEMBER_PRACTICE",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_practice_member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_PRACTICE_GENERATOR")
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

}
