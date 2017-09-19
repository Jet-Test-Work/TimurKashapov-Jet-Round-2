import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Unit1Task3Test {

    @Test
    public void toCharacterArray() throws Exception {

        // Тестирование преобразования строки в массив символов.
        //
        char[] testCha00 = new char[]{};
        String testStr00 = null;
        //
        char[] testCha01 = new char[]{};
        String testStr01 = "";
        //
        char[] testCha02 = new char[]{'s'};
        String testStr02 = "s";
        //
        char[] testCha03 = new char[]{'s','2','1','-','=','+',};
        String testStr03 = "s21-=+";
        //
        assertArrayEquals( testCha00, Unit1Task3.toCharacterArray(testStr00) );
        assertArrayEquals( testCha01, Unit1Task3.toCharacterArray(testStr01) );
        assertArrayEquals( testCha02, Unit1Task3.toCharacterArray(testStr02) );
        assertArrayEquals( testCha03, Unit1Task3.toCharacterArray(testStr03) );
    }

    @Test
    public void clearSpaces() {

        // Тестирование на удаление пробелов в строке.
        //
        char[] testAct00 = {'g', 'o', 'o', 'g', 'l', 'e', ' ', 'a', ' ', 'b', 'i', 'g'};
        char[] testExt00 = {'g', 'o', 'o', 'g', 'l', 'e', 'a', 'b', 'i', 'g'};
        //
        char[] testAct01 = {'g', ' ', ' ', ' ', ' ' , 'e', ' ', 'e', ' ', ' ', ' ', 'k'};
        char[] testExt01 = {'g', 'e', 'e', 'k'};
        //
        assertArrayEquals(testExt00, Unit1Task3.clearSpaces(testAct00));
        assertArrayEquals(testExt01, Unit1Task3.clearSpaces(testAct01));
    }

    @Test
    public void isPalindrome() throws Exception {

        // Тестирование некорректной строки для палиндрома.
        //
        String test0 = "";
        String test1 = " ";
        String test2 = "asdd";
        String test3 = "dfdfdddddd";
        String test4 = "d f d , , ,fdd dddd";
        String test5 = "d ,- ---";


        // Тестирование корректной строки.
        //
        String test20 = "ssssssssss";
        String test21 = "milklim";
        String test22 = "peacecaep";
        String test23 = "Hello world ! dlrow olleH";
        String test24 = ".";
        String test25 = "...";
        String test26 = "..,.";
        String test30 = "Я иду с мечем судия";
    }

    @Test
    public void clear() {

        // Тестирование на удаление символов пробела, пунктуации, спец. символов.
        //
        char[] testAct00 = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char[] testExt00 = new char[]{'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        char[] testAct01 = new char[]{'N', '0', '-', 'E', 'r', 'r', 'o', 'r', 's', '.', '.', '.'};
        char[] testExt01 = new char[]{'N', '0', 'E', 'r', 'r', 'o', 'r', 's'};
        char[] testAct02 = new char[]{'+', '1', '-', '!', '.', '/', '\'', '\"', 'o'};
        char[] testExt02 = new char[]{'1', 'o',};
        //
        assertArrayEquals( testExt00, Unit1Task3.clear(testAct00) );
        assertArrayEquals( testExt01, Unit1Task3.clear(testAct01) );
        assertArrayEquals( testExt02, Unit1Task3.clear(testAct02) );
    }
}