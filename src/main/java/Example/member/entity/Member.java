package Example.member.entity;





import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"}
)})
@Getter
@Setter
public class Member {

    @Id
    @Column(name = "ID")
    private String id; //아이디

    @Column(name = "NAME", nullable = false, length = 10)
    private String userName; //이름

    private Integer age; //나이


    //capter4추가 부분
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)// 자바의 날짜 타입 매핑
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob//필드의 기링 제한이 없음, CLOB, BLOB 타입을 매핑 할 수 있다.
    private String description;

}
