package entity;





import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
@Getter
@Setter
public class Member {

    @Id
    @Column(name = "ID")
    private String id; //아이디

    @Column(name = "NAME")
    private String userName; //이름

    private Integer age; //나이
}
