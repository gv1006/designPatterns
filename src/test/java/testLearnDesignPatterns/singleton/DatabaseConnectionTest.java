package testLearnDesignPatterns.singleton;

import static org.junit.Assert.assertTrue;

import learnDesignPatterns.singleton.ConnectionPool;
import org.junit.Test;

public class DatabaseConnectionTest {

    @Test
    public void test() {

        ConnectionPool pool = ConnectionPool.getInstance();
        ConnectionPool pool2 = ConnectionPool.getInstance();

        assertTrue("If a new instance is created, it should be the same as the older one", pool == pool2);
    }
}
