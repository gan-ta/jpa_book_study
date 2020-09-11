package Example.member.test;

import Example.member.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){

        //엔티티 메니저 펙토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        try {

            tx.begin();
            String id = "id1";
            Member member = new Member();
            member.setId(id);
            member.setUserName("gnsta");
            member.setAge(1);


            //등록
            em.persist(member);

            //수정
            member.setAge(2);

            //한 건 조회
            //(캐시에서 조회를 해서 가져옴)
            Member findMember = em.find(Member.class,id);
            System.out.println("findMember= " + findMember.getUserName() + " age= " + findMember.getAge());

            //목록 조회
            List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
            System.out.println("member.size= " + members.size());

            //삭제
            em.remove(member);

            tx.commit();


        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }


}
