package practice.progress.global;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter@Setter
public class AddressPractice {

    private String city;
    private String street;
    private String zipcode;




}
