package domain;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;

/**
* @author Adam Wlosek
*DataBase class
*/


public class DataBase {
    static EntityManagerFactory entityManagerFactory;
    static EntityManager entityManager;
    /**
    *Function open connect between mySQL database and Java using entityManager
*/
    public static void open(){
        entityManagerFactory = Persistence.createEntityManagerFactory("MyDataBase");
        entityManager = entityManagerFactory.createEntityManager();
    }
     /**
    *Function close connect between mySQL database and Java using entityManager
*/
    public static void close(){
        entityManager.close();
        entityManagerFactory.close();
    }
     /**
    *Function create a record in database
    * @param question content of question
    * @param a first answer
    * @param b second answer
    * @param c third answer
    * @param d fourth answer
    * @param correct correct answer
    * @param points points to get
*/
    public static void fill(String question,String a, String b, String c, String d, String correct,int points){
//        open();
        Questions q = new Questions();
        q.setQuestion(question);
        q.setAnswerA(a);
        q.setAnswerB(b);
        q.setAnswerC(c);
        q.setAnswerD(d);
        q.setCorrectAnswer(correct);
        q.setPoints(points);
        entityManager.getTransaction().begin();
        entityManager.persist(q);
        entityManager.getTransaction().commit();
//        close();

    }
    /**
    *Function load a question
    * @return return Question object, if it throws exeption return null
    * @exception NullPointerException if question.id doesn't exist
*/
    public static Questions load(int id){

        try {
            Questions q = entityManager.find(Questions.class, id);
            return q;
        }catch (NullPointerException e){
            System.out.println(e);

            return null;
        }


    }
    /**
    *Function delete a question
    * @return return true if question has deleted, return false if it's thrown a exception
    * @exception IllegalArgumentException if question doesn't exist
    * @exception IllegalStateException if transaction hasn't commited
*/
    public static boolean delete(int id){

        try{
//            open();
            Questions q= entityManager.find(Questions.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(q);
            entityManager.getTransaction().commit();
//            close();

            return true;

        }
        catch (IllegalArgumentException e){
            System.out.println(e);
//            close();
            return false;
        }
        catch(IllegalStateException e){
            System.out.println(e);
            entityManager.getTransaction().commit();

            return false;

        }



    }

}
