import org.junit.Test;

import java.util.Arrays;
import java.util.Enumeration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class Unit1Task1Test {

    static {
        String s;
        System.setProperty("file.encoding", "UTF-8");
        for (Enumeration e = System.getProperties().propertyNames(); e.hasMoreElements();) {
            s = e.nextElement().toString();
            System.out.println( s + " = " + System.getProperty(s) );
        }

        System.out.println("\n*************************************************************************\n\n");
    }

    /**
     * Тестирование на корректные входящие данные.
     */
    @Test
    public void verifyInput() {

        // Тестирование на некорректный ввод.
        //
        String[] test0  = null;
        String[] test1  = {};
        String[] test2  = {"a"};
        String[] test3  = {"1"};
        //
        assertFalse(Arrays.toString(test0), Unit1Task1.verifyInput(test0));
        assertFalse(Arrays.toString(test1), Unit1Task1.verifyInput(test1));
        assertFalse(Arrays.toString(test2), Unit1Task1.verifyInput(test2));
        assertFalse(Arrays.toString(test3), Unit1Task1.verifyInput(test3));

        // Тестирование на нечисловые символы.
        //
        String[] test10 = {"1", "-a4"};
        String[] test11 = {"1", ".4", "0", "2.8", "5"};
        String[] test12 = {"1", "-4", "4+", "2-", "-5"};
        //
        assertFalse(Arrays.toString(test10), Unit1Task1.verifyInput(test10));
        assertFalse(Arrays.toString(test11), Unit1Task1.verifyInput(test11));
        assertFalse(Arrays.toString(test12), Unit1Task1.verifyInput(test12));

        // Тестирование на эквивалентность элементов.
        //
        String[] test20 = {"1", "1"};
        String[] test21 = {"1", "1", "1"};
        String[] test22 = {"1", "1", "1", "1", "1"};
        String[] test23 = {"1", "1", "1", "1", "-1"};
        //
        assertTrue(Arrays.toString(test20), Unit1Task1.verifyInput(test20));
        assertTrue(Arrays.toString(test21), Unit1Task1.verifyInput(test21));
        assertTrue(Arrays.toString(test22), Unit1Task1.verifyInput(test22));
        assertTrue(Arrays.toString(test23), Unit1Task1.verifyInput(test23));

        // Тестирование на корректные числовые данные
        //
        String[] test30 = {"1", "-1", "20", "50", "43"};
        String[] test31 = {"81", "-19", "20", "56", "4"};
        String[] test32 = {"111", "1", "20", "650", "4399"};
        //
        assertTrue(Arrays.toString(test30), Unit1Task1.verifyInput(test30));
        assertTrue(Arrays.toString(test31), Unit1Task1.verifyInput(test31));
        assertTrue(Arrays.toString(test32), Unit1Task1.verifyInput(test32));
    }

    /**
     * Тестирование алгоритма получения 2-ого по величине числа из набора чисел.
     *
     * @throws Exception e
     */
    @Test
    public void getSecondBigNumber() throws Exception {

        // Тестирование на некорректное получение требуемого числа.
        //
        Integer[] test0 = {10, 20, 20, 10, 5};
        //
        assertEquals( Integer.valueOf(10) ,Unit1Task1.getSecondBigNumber(test0));

        // Тестирование на корректное получение требуемого числа.
        //
        Integer[] test10 = {20, 50, 66, 2, 1, 5};
        Integer[] test11 = {0, 0, 6, 2, 0, 5};
        Integer[] test12 = {-10, -50, 6, 2, 51, 95};
        //
        assertEquals( Integer.valueOf(50) ,Unit1Task1.getSecondBigNumber(test10));
        assertEquals( Integer.valueOf(5) ,Unit1Task1.getSecondBigNumber(test11));
        assertEquals( Integer.valueOf(51) ,Unit1Task1.getSecondBigNumber(test12));


    }
}