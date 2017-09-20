import org.junit.Test;

import static org.junit.Assert.*;

public class Unit2Task3Test {
    @Test
    public void decode() throws Exception {

        // Тестрирование RLD декодирования строки.
        //
        String testSrc00 = "1r10t1o";
        String testExt00 = "rtttttttttto";
        //
        String testSrc01 = "19o1p3i";
        String testExt01 = "ooooooooooooooooooopiii";
        //
        String testSrc02 = "8u7y6t5r4e";
        String testExt02 = "uuuuuuuuyyyyyyyttttttrrrrreeee";
        //
        assertEquals(testExt00, Unit2Task3.decode(testSrc00));
        assertEquals(testExt01, Unit2Task3.decode(testSrc01));
        assertEquals(testExt02, Unit2Task3.decode(testSrc02));
    }
}