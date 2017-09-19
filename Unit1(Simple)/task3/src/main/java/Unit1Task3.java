import java.util.Scanner;

/**
 * Программа выполняет проверку строки на то, что она является полиндромом.
 *
 * @author Timur Kashapov
 * @since 0.0.1
 */
public class Unit1Task3 {

    /**
     * Упрощённая запись System.out.println();
     *
     * @param str строка для вывода.
     */
    private static void println(String str) { System.out.println(str); } // println()

    /**
     * Получить строку.
     *
     * @return строка.
     */
    private static String getInput() {

        System.out.printf("\nEnter a string to check whether he palindrome: ");
        //System.out.printf("\nВведите строку для проверки - является ли он полиндромом: ");

        Scanner  scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        return str;
    } // getInput()

    /**
     * Преобразование строки в массив символов.
     *
     * @param str строкаю
     * @return массив символов.
     */
    public static char[] toCharacterArray(String str) {

        if (str == null) return new char[]{};

        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; ++i) { arr[i] = str.charAt(i); }

        return arr;
    } // toCharacterArray()

    /**
     *  Возвращает подстверждение, если сивол является спец. символом.
     *
     * @param ch исходный символ.
     * @return подтверждение.
     */
    public static boolean isSpecs(char ch) {

        char[] specs  = {
                '~', '@', '#', '$', '%', '&', '*', '_', '=', '+',
                '[', ']', '{', '}', '>', '/', '<', '^', '`', '\\'};

        for (int i = 0; i < specs.length; ++i) { if (ch == specs[i]) return true; } // for i

        return false;
    } // isSpecs()

    /**
     * Возвращает подтверждение, если символ является символом пунктуации.
     *
     * @param ch символ.
     * @return подстверждение.
     */
    public static boolean isPunctuation(char ch) {

        // '\u0027' = '\''
        // '\u0022' - '\"'
        char[] punctua = {' ', '.', ',',  '!',  '?', '-', ':', ';', '\'', '\"', '(', ')' };

        for (int i = 0; i < punctua.length; ++i) { if (ch == punctua[i]) return true; } // for i

        return false;
    } // isPunctuation()

    /**
     * Сколько знаков препинания (пунктуации) в массиве символов.
     *
     * @param src массив символов.
     * @return количество.
     */
    public static int punctuationsOf(char[] src) {

        if (src == null) return 0;

        // Счетчик символов пунктуаций.
        int pCounter = 0;
        int pLen     = 12;

        for (int i = 0; i < src.length; ++i) { if ( isPunctuation(src[i]) ) ++pCounter; } // for i

        return pCounter;
    } // punctuationsOf()

    /**
     * Возвращает количество символов пробела в массиве символов.
     *
     * @param src исходный массив.
     * @return количество пробеллов.
     */
    private static int spacesOf(char[] src) {

        // Счетчик символов пробела.
        int pCounter = 0;

        for (int i = 0; i < src.length; ++i) { if ( (src[i] == ' ') ) ++pCounter; } // for i

        return pCounter;

    } // spacesOf()

    /**
     * Удаление символов пробела из массива символов.
     *
     * @param src исходный массив.
     * @return массив символов без символов пробела.
     */
    public static char[] clearSpaces(char[] src) {

        char[] arr = new char[src.length - spacesOf(src)];
        int k = 0;

        for (int i = 0; i < src.length; ++i) { if ( ! (src[i] == ' ') ) arr[k++] = src[i]; } // for i

        return arr;
    } // clearSpaces()

    /**
     * Удаление знаков препинания.
     *
     * @param src массив символов.
     * @return массив символов.
     */
    public static char[] clear(char[] src) {

        char[] clean = new char[ src.length - punctuationsOf(src) ];
        int k = 0;

        for (int i = 0; i < src.length; ++i) {
            if ( ! isPunctuation(src[i]) && ! isSpecs(src[i]) ) clean[k++] = src[i];
        } // for i

        return clean;
    } // clear()

    /**
     * Является ли строка полиндромом.
     *
     * @param arg исходдные строка
     * @return подстверждение.
     */
    public static boolean isPalindrome(String arg) {

        boolean result = false;

        return result;
    } // isPalindrome()

    /**
     * Main.
     * @param args command line args.
     */
    public static void main(String[] args) {

        println("The program performs validation of a string that it is palindrome");
//        println("Программа выполняет проверку строки на то, что она является полиндромом.");

        // Ввод аргументами через системную консоль.
        if (args.length > 1) { if ( isPalindrome(args[0])) println("Yes"); else println("No"); }
        // Интерактивный ввод через системную консоль.
        else { if (isPalindrome(getInput())) println("Yes"); else println("No"); }

        println("\n");

    } // main

} // Unit1Task3
