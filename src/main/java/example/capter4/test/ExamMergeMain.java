package example.capter4.test;

import example.capter4.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExamMergeMain {
    //엔티티 메니저 펙토리 생성
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");

    public static void main(String[] args) {

        Member member = createMember("memberA", "회원1");

        member.setUserName("회원명변경");

        mergeMember(member);

        emf.close();

    }

    static Member createMember(String id, String userName){
        EntityManager em1 = emf.createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        Member member = new Member();

        //영속성 컨텍스트 1시작
        try {
            tx1.begin();
            member.setId(id);
            member.setUserName(userName);

            em1.persist(member);
            tx1.commit();

            //같은 영속성 컨텍스트에서도 detach 하였다가 merge를 하면 다른 객체가 캐시에 저장되어 있는지 확인
            em1.detach(member);
            Member mergeMember = em1.merge(member);
            System.out.println("em1 contains member = " + em1.contains(member));
            System.out.println("em1 contains mergeMember = " + em1.contains(mergeMember));

            member = mergeMember;
        }catch (Exception e){
            tx1.rollback();
        }finally {
            em1.close();
        }

        em1.close();//영속성 컨텍스트1 종료
                    //member 엔티티는 준여옥 상태가 된다

        return member;
    }

    static Member mergeMember(Member member){
        //영속성 컨텍스트 2시작
        EntityManager em2 = emf.createEntityManager();
        EntityTransaction tx2 = em2.getTransaction();

        try {
            tx2.begin();
//        Member mergeMember = em2.merge(member);
            //mergeMember와 member는 다른 객체이기 때문에 아래와 같은 코드로 사용
            member = em2.merge(member);

            tx2.commit();

            //준영속 상태
            System.out.println("member = " + member.getUserName());

            //영속상태
//        System.out.println("mergeMember = " + mergeMember.getUserName());

            System.out.println("em2 contains member = " + em2.contains(member));
//        System.out.println("em2 contains mergeMember = " + em2.contains(mergeMember));
        }catch (Exception e){
            tx2.rollback();
        }finally {
            em2.close();
        }
        return member;
    }

}
