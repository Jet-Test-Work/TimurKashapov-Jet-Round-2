import org.junit.Test;

import static org.junit.Assert.*;

public class Unit2Task2Test {
    @Test
    public void encode() throws Exception {

        // Тестирование RLE кодирования строки.
        //
        String testSrc00 = "aaaabbbdddffggghrrrr";
        String testExt00 = "4a3b3d2f3g1h4r";
        //
        String testSrc01 = "rereereeer";
        String testExt01 = "1r1e1r2e1r3e1r";
        //
        String testSrc02 = "0000011122211100101000";
        String testExt02 = "503132312011101130";
        //
        String testSrc03 = "!!!!@@@##$44$$$$$#.......";
        String testExt03 = "4!3@2#1$245$1#7.";
        //
        assertEquals(testExt00, Unit2Task2.encode(testSrc00));
        assertEquals(testExt01, Unit2Task2.encode(testSrc01));
        assertEquals(testExt02, Unit2Task2.encode(testSrc02));
        assertEquals(testExt03, Unit2Task2.encode(testSrc03));
    }
}