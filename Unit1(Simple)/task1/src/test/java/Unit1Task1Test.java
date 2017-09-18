import org.junit.Test;

import java.util.Arrays;
import java.util.Enumeration;

import static org.junit.Assert.assertFalse;

public class Unit1Task1Test {

    static {
        String s;
        System.setProperty("file.encoding", System.getProperty("sun.jnu.encoding"));
        for (Enumeration e = System.getProperties().propertyNames(); e.hasMoreElements();) {
            s = e.nextElement().toString();
            System.out.println( s + " = " + System.getProperty(s) );
        }

        System.out.println("*************************************************************************");
    }

    /**
     * Тестирование на корректные входящие данные.
     */
    @Test
    public void verifyInput() {

        //
        //
        String[] test0  = null;
        String[] test1  = {};
        String[] test2  = {"a"};
        String[] test3  = {"1"};

//        assertTrue(Arrays.toString(test0), Unit1Task1.verifyInput(test0));
        assertFalse(Arrays.toString(test0), Unit1Task1.verifyInput(test0));
        assertFalse(Arrays.toString(test1), Unit1Task1.verifyInput(test1));
        assertFalse(Arrays.toString(test2), Unit1Task1.verifyInput(test2));
        assertFalse(Arrays.toString(test3), Unit1Task1.verifyInput(test3));

        //
        //
        String[] test10 = {"1", "-a4"};
        String[] test11 = {"1", ".4", "0"};
        String[] test12 = {"1", "1"};
        String[] test13 = {"1", "1", "1"};
        String[] test14 = {"1", "1", "1", "1", "1"};
        String[] test15 = {"1", "1", "1", "1", "-1"};

        //
        //
        String[] test20 = {"1", "-1", "20", "50", "43"};
        String[] test21 = {"1", "-1", "2.8", "0", "-43"};
    }

    /**
     * Тестирование алгоритма получения 2-ого по величине числа из набора чисел.
     *
     * @throws Exception e
     */
    @Test
    public void getSecondBigNumber() throws Exception {

    }
}