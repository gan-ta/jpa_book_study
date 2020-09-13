package example.capter7.entity;

import javax.persistence.*;

@Entity
public class Child7 {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId")
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent7 parent;

    private String name;
}
