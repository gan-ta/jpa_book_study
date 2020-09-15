package example.capter10.test;

import com.mysema.query.SearchResults;
import com.mysema.query.Tuple;
import com.mysema.query.jpa.impl.JPADeleteClause;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.jpa.impl.JPAUpdateClause;
import com.mysema.query.types.Projections;
import example.capter10.dto.Member10DTO;
import example.capter10.entity.Member10;
import example.capter10.entity.QMember10;
import example.capter10.entity.Team10;
import example.capter4.entity.QMember;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


public class QueryDSLMain {

    public static void main(String[] args){
        //엔티티 메니저 펙토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");

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

            //회원3 저장
            Member10 member3 = new Member10();
            member3.setUsername("User3");
            member3.setAge(20);
            member3.setTeam(team1);
            team1.getMembers().add(member3);

            //회원4 저장
            Member10 member4 = new Member10();
            member4.setUsername("User4");
            member4.setAge(20);
            member4.setTeam(team1);
            team1.getMembers().add(member4);

            //회원5 저장
            Member10 member5 = new Member10();
            member5.setUsername("User5");
            member5.setAge(20);
            member5.setTeam(team1);
            team1.getMembers().add(member5);

            //회원4 저장
            Member10 member6= new Member10();
            member6.setUsername("User6");
            member6.setAge(20);
            member6.setTeam(team1);
            team1.getMembers().add(member6);

            em.persist(team1);

            tx.commit();


        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }

        //QueryDSL 로직 부분
        JPAQuery query = new JPAQuery(em);
        QMember10 qMember1 = new QMember10("m1");
        // 생성되는 JPQL 별칭
        List<Member10> memberList = query.from(qMember1)
                .where(qMember1.username.eq("User1").and(qMember1.age.gt(15)))
                .orderBy(qMember1.username.desc())
                .list(qMember1);

        for(Member10 member: memberList){
            System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
        }


        //QueryDSL 페이징 처리
        query = new JPAQuery(em);
        QMember10 qMember2 = new QMember10("m2");
        SearchResults<Member10> result = query.from(qMember2)
                .where(qMember2.age.gt(0))
                .offset(0).limit(3)
                .listResults(qMember2);

        long total = result.getTotal();
        long limit = result.getLimit();
        long offset = result.getOffset();
        List<Member10> results = result.getResults();

        System.out.println("total = " + total + " limit = " + limit + " offset = " + offset);
        for(Member10 member: results){
            System.out.println("username = " + member.getUsername() + "," + "teamname = " + member.getTeam().getName());
        }

        //QueryDSL 프로젝션 반환
        query = new JPAQuery(em);
        QMember10 member10 = QMember10.member10;

        List<Tuple> resultProjection = query.from(member10).list(member10.username,member10.age,member10.id);

        System.out.println(resultProjection.size());
        for(Tuple tuple: resultProjection){
            System.out.println("name = " + tuple.get(member10.username));
            System.out.println("age = " + tuple.get(member10.age));
        }


        //프로퍼티 접근
        query = new JPAQuery(em);
        member10 = QMember10.member10;

        List<Member10DTO> resultProperty = query.from(member10).list(
          Projections.bean(Member10DTO.class, member10.username.as("name"), member10.age)
        );
        for(Member10DTO member: resultProperty){
            System.out.println("name = " + member.getName());
            System.out.println("age = " + member.getAge());
        }

        //필드 직접 접근
        query = new JPAQuery(em);
        member10 = QMember10.member10;

        List<Member10DTO> resultDirect = query.from(member10).list(
                Projections.fields(Member10DTO.class, member10.username.as("name"), member10.age)
        );
        for(Member10DTO member: resultDirect){
            System.out.println("name = " + member.getName());
            System.out.println("age = " + member.getAge());
        }

        //생성자 사용
        query = new JPAQuery(em);
        member10 = QMember10.member10;

        List<Member10DTO> resultConstruct = query.from(member10).list(
                Projections.fields(Member10DTO.class, member10.username.as("name"), member10.age)
        );
        for(Member10DTO member: resultConstruct){
            System.out.println("name = " + member.getName());
            System.out.println("age = " + member.getAge());
        }

        //수정 배치 쿼리
        tx.begin(); //트렌젝션 필요
        member10 = QMember10.member10;
        JPAUpdateClause updateClause = new JPAUpdateClause(em,member10);

        long count = updateClause.where(member10.username.eq("User1"))
                .set(member10.age, member10.age.add(30))
                .execute();
        tx.commit();

        //삭제 배치 쿼리
        tx.begin(); //트렌젝션 필요
        member10 = QMember10.member10;
        JPADeleteClause deleteClause = new JPADeleteClause(em,member10);

        count = deleteClause.where(member10.username.eq("User2")).execute();
        tx.commit();






        em.close();
        emf.close();

    }

}
