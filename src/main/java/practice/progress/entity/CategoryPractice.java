package practice.progress.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class CategoryPractice {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
    joinColumns = @JoinColumn(name = "CATEGORY_ID"),
    inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemPractice> items = new ArrayList<ItemPractice>();

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private CategoryPractice parent;

    @OneToMany(mappedBy = "parent")
    private List<CategoryPractice> child = new ArrayList<CategoryPractice>();

    public void addChildCategory(CategoryPractice child){
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(ItemPractice item){
        items.add(item);
    }

}
