package example.capter7.entity;

import example.capter7.global.Item7;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album7 extends Item7 {

    private String artist;
}
