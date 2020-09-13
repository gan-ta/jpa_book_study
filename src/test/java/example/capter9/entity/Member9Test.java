package example.capter9.entity;

import example.capter5.entity.Member5;
import example.capter5.entity.Team5;
import example.capter9.global.Address9;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

class Member9Test {

    //엔티티 메니저 펙토리 생성
    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");


    @Test
    public void testSave() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();

            Member9 member = new Member9();

            member.setHomeAddress(new Address9("통영", "몽돌해수욕장","660-123"));

            member.getFavoriteFoods().add("a");
            member.getFavoriteFoods().add("b");
            member.getFavoriteFoods().add("c");

            member.getAddressHistory().add(new Address9("서울","강남", "123-123"));
            member.getAddressHistory().add(new Address9("서울","강북", "000-000"));

            em.persist(member);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

}