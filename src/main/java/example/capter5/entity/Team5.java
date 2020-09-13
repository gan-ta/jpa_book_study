package example.capter5.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //엔티티는 기본 생성자
@Table(name = "tbl_capter5_team")
@Entity
public class Team5 {

    @Id
    @Column(name = "TEAM_ID")
    private String id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member5> members = new ArrayList<Member5>();


    public Team5(String id, String name){
        this.id = id;
        this.name = name;
    }
}
