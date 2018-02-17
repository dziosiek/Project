package domain;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class QuestionsTest  {
    Questions q = new Questions();

    @Test
    public void getPoints(){
        int points = 3;
        q.setPoints(points);
        assertEquals(q.getPoints(),points);


    }

    @Test
    public void setPoints() {
        int points = 3;
        q.setPoints(points);
        assertEquals(q.getPoints(),points);
        points+=10;
        q.setPoints(points);
        assertEquals(q.getPoints(),points);
    }

    @Test
    public void getId() {
        int id=119;
        q.setId(id);
        assertEquals(q.getId(),id);
    }

    @Test
    public void setId() {
        int id=119;
        q.setId(id);
        assertEquals(q.getId(),id);
        id+=20;
        q.setId(id);
        assertEquals(q.getId(),id);
    }

    @Test
    public void getQuestion() {
        String s = "question question";
        q.setQuestion(s);
        assertEquals(q.getQuestion(),s);

    }

    @Test
    public void setQuestion() {
        String s = "question question";
        q.setQuestion(s);
        assertEquals(q.getQuestion(),s);
        s="Question Question qqq";
        q.setQuestion(s);
        assertEquals(q.getQuestion(),s);
    }


}