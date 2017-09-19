import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
    public void punctuations() {

        // Тестирование на количество знаков препинания в массив символов.
        //
        char[] test00 = null;
        char[] test01 = {'s'};
        char[] test02 = {'s', '.', '$', '%', '2', '2', '@', '3', '$', '!', '!', '`', '\'', '\"'};
        char[] test03 = {'.', ',',  '!',  '?', '-', ':', ';', '\'', '\"', '(', ')', };

        assertEquals( 0, Unit1Task5.punctuations(test00));
        assertEquals( 0, Unit1Task5.punctuations(test01));
        assertEquals( 10, Unit1Task5.punctuations(test02));
        assertEquals( 11, Unit1Task5.punctuations(test03));
    }

    @Test
    public void searchSubstring() {

    }
}