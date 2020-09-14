package example.capter10.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "member10")
//@NamedQueries({
//        @NamedQuery(
//            name = "member10.findByUsername",
//            query = "select m from member10 m where m.username = :username"),
//        @NamedQuery(
//            name = "member10.count",
//            query= "select count(m) from member10 m"
//        )
//})
public class Member10 {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "name")
    private String username;


    @Column(name = "age")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team10 team;

}
