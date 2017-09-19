import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Unit1Task5Test {

    @Test
    public void toCharacterArray() throws Exception {

        // Тестирование преобразования строки в массив символов.
        //
        char[] testCha00 = new char[]{};
        String testStr00 = null;

        char[] testCha01 = new char[]{};
        String testStr01 = "";

        char[] testCha02 = new char[]{'s'};
        String testStr02 = "s";

        char[] testCha03 = new char[]{'s','2','1','-','=','+',};
        String testStr03 = "s21-=+";

        assertArrayEquals( testCha00, Unit1Task5.toCharacterArray(testStr00) );
        assertArrayEquals( testCha01, Unit1Task5.toCharacterArray(testStr01) );
        assertArrayEquals( testCha02, Unit1Task5.toCharacterArray(testStr02) );
        assertArrayEquals( testCha03, Unit1Task5.toCharacterArray(testStr03) );
    }

    @Test
    public void searchSubstring() {

        // Тестирование на вхождение подстроки в строке.
        //
        String testStr00 = "abracadabra";
        String testSub00 = "cada";
        //
        String testStr01 = "hello World my amazing friends!";
        String testSub01 = "!";
        //
        String testStr02 = "55 + 66 = 121";
        String testSub02 = "121";
        //
        assertTrue( Unit1Task5.searchSubstring(testStr00, testSub00) );
        assertTrue( Unit1Task5.searchSubstring(testStr01, testSub01) );
        assertTrue( Unit1Task5.searchSubstring(testStr02, testSub02) );


        // Тестирование на не вхождение подстроки в строке.
        //
        String testStr10 = "error";
        String testSub10 = "oro";
        //
        String testStr11 = "linux foundation";
        String testSub11 = "xfc";
        //
        assertFalse( Unit1Task5.searchSubstring(testStr10, testSub10) );
        assertFalse( Unit1Task5.searchSubstring(testStr11, testSub11) );
    }
}