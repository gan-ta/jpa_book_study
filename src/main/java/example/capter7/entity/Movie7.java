package example.capter7.entity;

import example.capter7.global.Item7;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Movie7 extends Item7 {

    private String director;
    private String actor;
}
