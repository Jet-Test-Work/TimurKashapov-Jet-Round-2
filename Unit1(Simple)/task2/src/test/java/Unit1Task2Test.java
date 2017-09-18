import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Unit1Task2Test {

    @Test
    public void isNumber() {

        // Тестирование на некорректные входные данные.
        //
        String test0 = null;
        String test1 = " ";
        String test2 = "sdf";
        String test3 = "-1df";
        String test4 = "";

        assertFalse( "---> " + test0, Unit1Task2.isNumber(test0) );
        assertFalse( "---> " + test1, Unit1Task2.isNumber(test1) );
        assertFalse( "---> " + test2, Unit1Task2.isNumber(test2) );
        assertFalse( "---> " + test3, Unit1Task2.isNumber(test3) );
        assertFalse( "---> " + test4, Unit1Task2.isNumber(test4) );

        // Тестирование на корректные входные данные.
        //
        String test30 = "50";
        String test31 = "56487";
        String test32 = "98897";
        String test33 = "5555";
        String test34 = "122";

        assertTrue( "---> " + test30, Unit1Task2.isNumber(test30) );
        assertTrue( "---> " + test31, Unit1Task2.isNumber(test31) );
        assertTrue( "---> " + test32, Unit1Task2.isNumber(test32) );
        assertTrue( "---> " + test33, Unit1Task2.isNumber(test33) );
        assertTrue( "---> " + test34, Unit1Task2.isNumber(test34) );
    }

    @Test
    public void isPrime() {

        // Тестирование на определение простого числа.
        //
        Long test20 = -1L;
        Long test21 =  0L;
        Long test22 =  2L;
        Long test23 =  113L;
        Long test24 =  5L;

        assertFalse( "---> " + test20.toString(), Unit1Task2.isPrime(test20) );
        assertFalse( "---> " + test21.toString(), Unit1Task2.isPrime(test21) );

        assertTrue ( "---> " + test22.toString(), Unit1Task2.isPrime(test22) );
        assertTrue ( "---> " + test23.toString(), Unit1Task2.isPrime(test23) );
        assertTrue ( "---> " + test24.toString(), Unit1Task2.isPrime(test24) );
    }
}