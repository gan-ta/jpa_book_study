package example.capter5.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //엔티티는 기본 생성자 필수
@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;
    private String username;


    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Member(String id, String username){
        this.id = id;
        this.username = username;
    }

}
