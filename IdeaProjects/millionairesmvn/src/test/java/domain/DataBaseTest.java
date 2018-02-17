package domain;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class DataBaseTest  {
    @Test(expected = NullPointerException.class)
    public void loadTestNullPointerException() {
        DataBase.open();
        Questions q;
        q=DataBase.load(10000);

        System.out.println(q.getId());
        DataBase.close();

    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

}