package Example.member.test;

import Example.member.entity.SequenceBoard;
import Example.member.entity.TableBoard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExamIdentity {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-book");

    public static void main(String[] args){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        SequenceBoard sequenceBoard = new SequenceBoard();
        TableBoard tableBoard = new TableBoard();

        try{
            tx.begin();
            em.persist(sequenceBoard);
            em.persist(tableBoard);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }

    }
}
