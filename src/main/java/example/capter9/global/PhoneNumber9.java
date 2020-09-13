package example.capter9.global;

import example.capter9.entity.PhoneServiceProvider9;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
public class PhoneNumber9 {
    String areaCode;
    String localNumber;

    @ManyToOne
    PhoneServiceProvider9 provider;
}
