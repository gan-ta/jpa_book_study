package example.capter5.entity;

import example.capter4.entity.Member;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


class MemberTest {

    //엔티티 메니저 펙토리 생성
    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");


    @Test
    public void testSave() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            //팀1 저장
            Team5 team1 = new Team5("team1","팀1");
            em.persist(team1);

            //회원1 저장
            Member5 member1 = new Member5("member1", "회원1");
            member1.setTeam(team1);
            em.persist(member1);

            //회원2 저장
            Member5 member2 = new Member5("member2", "회원2");
            member2.setTeam(team1);
            em.persist(member2);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    @Test
    public void queryLoginJoin(){

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            String jpql = "select m from Member5 m join m.team t where t.name =: teamName";

            List<Member5> resultList = em.createQuery(jpql,Member5.class)
                    .setParameter("teamName", "팀1")
                    .getResultList();

            for(Member5 member : resultList){
                System.out.println("[query] member.username=" + member.getUsername());
            }
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }


    @Test
    public void updateRelation(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            //팀1 저장
            Team5 team1 = new Team5("team1", "팀1");
            em.persist(team1);

            //회원1 저장
            Member5 member1 = new Member5("member1", "회원1");
            member1.setTeam(team1);
            em.persist(member1);

            //회원2 저장
            Member5 member2 = new Member5("member2", "회원2");
            member2.setTeam(team1);
            em.persist(member2);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }


        try {
            tx.begin();

            Team5 team2 = new Team5("team2", "팀2");
            em.persist(team2);

            Member5 member = em.find(Member5.class, "member1");
            member.setTeam(team2);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

    }

    @Test
    public void deleteRelation(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            //팀1 저장
            Team5 team1 = new Team5("team1", "팀1");
            em.persist(team1);

            //회원1 저장
            Member5 member1 = new Member5("member1", "회원1");
            member1.setTeam(team1);
            em.persist(member1);

            //회원2 저장
            Member5 member2 = new Member5("member2", "회원2");
            member2.setTeam(team1);
            em.persist(member2);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }


        try {
            tx.begin();

            Member5 member1 = em.find(Member5.class, "member1");
            member1.setTeam(null);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

    }

    @Test
    public void biDirection(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            //팀1 저장
            Team5 team1 = new Team5("team1", "팀1");
            em.persist(team1);

            //회원1 저장
            Member5 member1 = new Member5("member1", "회원1");
            member1.setTeam(team1);
            em.persist(member1);

            //회원2 저장
            Member5 member2 = new Member5("member2", "회원2");
            member2.setTeam(team1);
            em.persist(member2);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }


        try {
            tx.begin();

            Team5 team  = em.find(Team5.class, "team1");
            List<Member5> members = team.getMembers();

            for(Member5 member : members){
                System.out.println("member.username = " + member.getUsername());
            }

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

    }
}