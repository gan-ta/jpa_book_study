package example.capter5.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


class MemberTest {

    //엔티티 메니저 펙토리 생성
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");

    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    public void testSave() {

        //팀1 저장
        Team team1 = new Team("team1","팀1");
        em.persist(team1);

        //회원1 저장
        Member member1 = new Member("member1", "회원1");
        member1.setTeam(team1);
        em.persist(member1);

        //회원2 저장
        Member member2 = new Member("member2", "회원2");
        member2.setTeam(team1);
        em.persist(member2);

    }

}