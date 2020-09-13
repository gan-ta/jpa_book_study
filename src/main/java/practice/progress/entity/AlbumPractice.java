package practice.progress.entity;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class AlbumPractice extends ItemPractice {

    private String artist;
    private String etc;

}
