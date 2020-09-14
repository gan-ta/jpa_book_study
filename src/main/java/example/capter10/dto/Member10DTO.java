package example.capter10.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member10DTO {

    private String username;

    private int age;

    public Member10DTO(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
