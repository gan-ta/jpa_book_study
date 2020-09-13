package example.capter5.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //엔티티는 기본 생성자 필수
@Table(name = "tbl_capter5_member")
@Entity
public class Member5 {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;
    private String username;


    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team5 team;

    public void setTeam(Team5 team){
        if(this.team != null){
            this.team.getMembers().remove(this);
        }
        this.team = team;
        team.getMembers().add(this);
    }

    public Member5(String id, String username){
        this.id = id;
        this.username = username;
    }

}
