package practice.progress.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class MoviePractice extends ItemPractice {

    private String director;
    private String actor;

}
