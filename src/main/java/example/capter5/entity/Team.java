package example.capter5.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //엔티티는 기본 생성자 필수
@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;
    private String name;


    public Team(String id, String name){
        this.id = id;
        this.name = name;
    }
}
