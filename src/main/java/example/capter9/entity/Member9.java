package example.capter9.entity;

import example.capter9.global.Address9;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Entity
public class Member9 {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Embedded
    Address9 homeAddress;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(
//                    name = "city",
//                    column=@Column(name = "COMPANY_CITY")
//            ),
//            @AttributeOverride(
//                    name = "street",
//                    column=@Column(name = "COMPANY_STREET")
//            ),
//            @AttributeOverride(
//                    name = "state",
//                    column=@Column(name = "COMPANY_STATE")
//            ),
//            @AttributeOverride(
//                    name = "zipcode",
//                    column=@Column(name = "COMPANY_ZIPCODE")
//            )
//
//    })
//    Address9 companyAddress;

    @ElementCollection
    @CollectionTable(
            name = "FAVORITE_FOODS",
            joinColumns = @JoinColumn(name = "MEMBER_ID"))
    @Column(name = "FOOD_NAME")
    private Set<String> favoriteFoods = new HashSet<String>();

    @ElementCollection
    @CollectionTable(name = "ADDRESS",
    joinColumns = @JoinColumn(name = "MEMBER_ID"))
    private List<Address9> addressHistory = new ArrayList<Address9>();

}
