package example.capter10.entity;

import com.mysema.query.jpa.impl.JPAQuery;
import example.capter10.dto.Member10DTO;
import example.capter4.entity.Member;
import example.capter4.entity.QMember;
import example.capter5.entity.Member5;
import example.capter5.entity.Team5;
import example.capter9.entity.Member9;
import example.capter9.global.Address9;
import org.hibernate.Criteria;
import  example.capter10.entity.QMember10;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import javax.persistence.criteria.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Member10Test {
    //엔티티 메니저 펙토리 생성
    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");



    @Test
    public void testCriteria() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            //팀 생성
            Team10 team1 = new Team10();
            team1.setName("Team1");

            //회원1 저장
            Member10 member1 = new Member10();
            member1.setUsername("User1");
            member1.setAge(10);
            member1.setTeam(team1);
            team1.getMembers().add(member1);


            //회원2 저장
            Member10 member2 = new Member10();
            member2.setUsername("User2");
            member2.setAge(20);
            member2.setTeam(team1);
            team1.getMembers().add(member2);

            em.persist(team1);

            tx.commit();


            CriteriaBuilder cb = em.getCriteriaBuilder();


            //================================================================
            CriteriaQuery<Member10> cq = cb.createQuery(Member10.class);

            Root<Member10> m = cq.from(Member10.class);
            cq.select(m);

            TypedQuery<Member10> query = em.createQuery(cq);
            List<Member10> members = query.getResultList();

            //==================================================================

            //검색 조건 정의
            Predicate usernameEqual = cb.equal(m.get("username"), "User1");

            //정렬 조건 정의
            javax.persistence.criteria.Order ageDesc = cb.desc(m.get("age"));

            //쿼리 생성
            cq.select(m).where(usernameEqual).orderBy(ageDesc);

            List<Member10> resultList1 = em.createQuery(cq).getResultList();

            Predicate ageGt = cb.greaterThan(m.<Integer>get("age"),10);

            cq.select(m);
            cq.where(ageGt);
            cq.orderBy(cb.desc(m.get("age")));

            List<Member10> resultList2 = em.createQuery(cq).getResultList();


            //==========================================================
            // 조회 대상을 여러건 지정

            //1, object 객체로 받기
            CriteriaQuery<Object[]> cq3 = cb.createQuery(Object[].class);
            Root<Member10> m3 = cq3.from(Member10.class);
            cq3.multiselect(m.get("username"), m.get("age")).distinct(true);

            TypedQuery<Object[]> query3 = em.createQuery(cq3);
            List<Object[]> resultList3 = query3.getResultList();

            //2, dto 객체로 받기
            CriteriaQuery<Member10DTO> cq4 = cb.createQuery(Member10DTO.class);
            Root<Member10> m4 = cq4.from(Member10.class);

            cq4.select(cb.construct(Member10DTO.class,m4.get("username"),m4.get("age")));

            TypedQuery<Member10DTO> query4 = em.createQuery(cq4);
            List<Member10DTO> resultList = query4.getResultList();

            //====================================================================
            //튜플
            CriteriaBuilder cb5 = em.getCriteriaBuilder();

            CriteriaQuery<Tuple> cq5 = cb5.createTupleQuery();

            Root<Member10> m5 = cq5.from(Member10.class);

            cq5.multiselect(
                m5.get("username").alias("username"),
                    m5.get("age").alias("age")

            );

            TypedQuery<Tuple> query5 = em.createQuery(cq5);
            List<Tuple> resultList5 = query5.getResultList();

            //======================================================
            //서브쿼리 부분
            CriteriaBuilder cb6 = em.getCriteriaBuilder();
            CriteriaQuery<Member10> mainQuery6 = cb6.createQuery(Member10.class);

            Subquery<Double> subQuery = mainQuery6.subquery(Double.class);

            Root<Member10> m6 = subQuery.from(Member10.class);
            subQuery.select(cb.avg(m6.<Integer>get("age")));

            Root<Member10> m6_1 = mainQuery6.from(Member10.class);
            mainQuery6.select(m6_1)
                    .where(cb.ge(m.<Integer>get("age"),subQuery));




        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
    }

    @Test
    public void testJPQL() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            //팀 생성
            Team10 team1 = new Team10();
            team1.setName("Team1");

            //회원1 저장
            Member10 member1 = new Member10();
            member1.setUsername("User1");
            member1.setAge(10);
            member1.setTeam(team1);
            team1.getMembers().add(member1);


            //회원2 저장
            Member10 member2 = new Member10();
            member2.setUsername("User2");
            member2.setAge(20);
            member2.setTeam(team1);
            team1.getMembers().add(member2);

            em.persist(team1);

            tx.commit();

            //TypeQuery 사용
            TypedQuery<Member10> tqquery = em.createQuery("SELECT m FROM member10 m",Member10.class);
            List<Member10> tqresultList = tqquery.getResultList();
            for(Member10 member: tqresultList){
                System.out.println("member = " + member);
            }

            //Query사용
            Query qquery = em.createQuery("SELECT m.username, m.age from member10 m");
            List<Member10> qresultList = qquery.getResultList();

            for(Object o : qresultList){
                Object[] result = (Object[]) o;

                System.out.println("username = " + result[0]);
                System.out.println("age = " + result[1]);

            }

            //파라미터 바인딩
            String usernameParam = "User1";

            TypedQuery<Member10> query = em.createQuery("SELECT m FROM member10 m where m.username = :username",Member10.class);
            query.setParameter("username",usernameParam);
            List<Member10> resultList = query.getResultList();

            for(Member10 member: resultList){
                System.out.println("member = " + member);
            }


            //페치 조인 사용
            String jpql = "select m from member10 m join fetch m.team";

            List<Member10> members = em.createQuery(jpql,Member10.class)
                    .getResultList();

            for(Member10 member: members){
                System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
            }


            //엔티티를 파라미터로 직접 받는 코드
            //기본키를 사용하게 됨
            String qlString1 = "select m from member10 m where m = :member";
            List<Member10> resultList1 = em.createQuery(qlString1)
                    .setParameter("member",member1)
                    .getResultList();

            for(Member10 member: resultList1){
                System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
            }

            //외래키 대신 엔티티를 직접 사용하는 코드
            Team10 team = em.find(Team10.class,1L);

            String qlString2 = "select m from member10 m where m.team = :team";
            List<Member10> resultList2 = em.createQuery(qlString2)
                    .setParameter("team",team1)
                    .getResultList();

            for(Member10 member: resultList2){
                System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
            }

            //Named쿼리 사용
            List<Member10> resultList3 = em.createNamedQuery("member10.findByUsername",Member10.class)
                    .setParameter("username", "User1")
                    .getResultList();

            for(Member10 member: resultList3){
                System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
            }


        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    @Test
    public void testQueryDSL() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            //팀 생성
            Team10 team1 = new Team10();
            team1.setName("Team1");

            //회원1 저장
            Member10 member1 = new Member10();
            member1.setUsername("User1");
            member1.setAge(10);
            member1.setTeam(team1);
            team1.getMembers().add(member1);


            //회원2 저장
            Member10 member2 = new Member10();
            member2.setUsername("User2");
            member2.setAge(20);
            member2.setTeam(team1);
            team1.getMembers().add(member2);

            em.persist(team1);

            tx.commit();

            JPAQuery query = new JPAQuery(em);
            QMember10 qMember = new QMember10("m");

            List<com.mysema.query.Tuple> member10s =query.from(qMember).list();



        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

}