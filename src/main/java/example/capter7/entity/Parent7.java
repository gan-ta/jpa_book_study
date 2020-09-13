package example.capter7.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parent7 {

//    @EmbeddedId
//    private ParentId id;

    @Id
    @Column(name = "PARENT_ID")
    private String id;


    private String name;
}
