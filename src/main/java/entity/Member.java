package entity;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id; //아이디

    @Column(name = "NAME")
    private String userName; //이름


    private Integer age; //나이
}
