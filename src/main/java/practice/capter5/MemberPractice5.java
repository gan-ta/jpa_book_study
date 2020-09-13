package practice.capter5;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "MEMBER_PRACTICE5_GENERATOR",
        sequenceName = "MEMBER_PRACTICE5",
        initialValue = 1,
        allocationSize = 50
)
@Table(name = "tbl_practice_member5")
public class MemberPractice5 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_PRACTICE5_GENERATOR")
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order5> orders = new ArrayList<Order5>();

}
