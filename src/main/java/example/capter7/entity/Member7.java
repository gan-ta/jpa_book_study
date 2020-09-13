package example.capter7.entity;

import example.capter7.global.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Member7 extends BaseEntity {

    private String email;

}
