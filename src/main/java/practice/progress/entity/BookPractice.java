package practice.progress.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class BookPractice extends ItemPractice {

    private String author;
    private String isbn;

}
