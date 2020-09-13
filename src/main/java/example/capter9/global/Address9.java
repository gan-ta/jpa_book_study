package example.capter9.global;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED) //엔티티는 기본 생성자 필수
public class Address9 {

    String street;
    String city;
    String state;

    public Address9(String city, String street, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

//    @Embedded
//    Zipcode9 zipcode;
}
