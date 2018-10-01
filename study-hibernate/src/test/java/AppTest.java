/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import com.alibaba.fastjson.JSON;
import com.sweetop.studyhb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    private static SessionFactory factory;

    @BeforeClass
    public static void init() {
            factory=new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void testList() {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        List<User> users = session.createQuery("FROM User where id = 1").list();
        System.out.println(JSON.toJSONString(users));
        tx.commit();
        session.close();
    }
}
