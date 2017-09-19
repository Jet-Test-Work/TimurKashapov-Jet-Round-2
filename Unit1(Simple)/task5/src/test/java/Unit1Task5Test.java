import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Unit1Task5Test {

    @Test
    public void toCharacterArray() throws Exception {

        // Тестирование преобразования строки в массив символов.
        //
        char[] testCha00 = new char[]{};
        String testStr00 = "";

        char[] testCha01 = new char[]{'s'};
        String testStr01 = "s";

        char[] testCha02 = new char[]{'s','2','1','-','=','+',};
        String testStr03 = "s21-=+";

        assertArrayEquals( testCha00, Unit1Task5.toCharacterArray(testStr00) );
        assertArrayEquals( testCha01, Unit1Task5.toCharacterArray(testStr01) );
        assertArrayEquals( testCha02, Unit1Task5.toCharacterArray(testStr03) );
    }

    @Test
    public void searchSubstring() {

    }
}