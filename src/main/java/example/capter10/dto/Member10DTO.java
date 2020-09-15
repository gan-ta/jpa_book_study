package example.capter10.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Member10DTO {

    private String name;

    private int age;

    public Member10DTO(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
