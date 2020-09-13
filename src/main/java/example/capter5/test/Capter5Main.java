package example.capter5.test;

import example.capter5.entity.Member5;
import example.capter5.entity.Team5;

public class Capter5Main {

    public static void main(String[] args) {
        Member5 member1 = new Member5("member1", "회원1");
        Member5 member2 = new Member5("member2", "회원2");

        Team5 team1 = new Team5("team1", "팀1");

        member1.setTeam(team1);
        member2.setTeam(team1);

        Team5 findTeam = member1.getTeam();

    }
}
