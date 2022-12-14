package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {


    public static void main(String[] args) {
      EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");
        // 엔티티매니저팩토리 실행시 한번 만들어놈

        EntityManager em = emf.createEntityManager();
    // 실행
        EntityTransaction tx =  em.getTransaction();
        tx.begin();


        try {

           Member member = new Member();
           member.setName("member1");


           em.persist(member);

           Team team = new Team();
           team.setName("teamA");
           team.getMembers().add(member);

           em.persist(team);



            tx.commit();
        }catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
