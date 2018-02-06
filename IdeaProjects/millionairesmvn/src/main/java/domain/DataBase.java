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

public class DataBase {
    static EntityManagerFactory entityManagerFactory;
    static EntityManager entityManager;
    public static void open(){
        entityManagerFactory = Persistence.createEntityManagerFactory("MyDataBase");
        entityManager = entityManagerFactory.createEntityManager();
    }
    public static void close(){
        entityManager.close();
        entityManagerFactory.close();
    }
    public static void fill(String question,String a, String b, String c, String d, String correct,int points){
        open();
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
        close();

    }
    public static Questions load(int id){
        open();
        Questions q = entityManager.find(Questions.class,id);
        close();
        return q;
    }
    public static boolean delete(int id){

        try{
            open();
            Questions q= entityManager.find(Questions.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(q);
            entityManager.getTransaction().commit();
            close();

            return true;

        }
        catch (IllegalArgumentException e){
            close();
            return false;
        }

    }
    public static void count(){

    }

}
