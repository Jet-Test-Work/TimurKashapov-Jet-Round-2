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
        if (args.length > 1){ isPalindrome(args[0]); }
        // Интерактивный ввод через системную консоль.
        else isPalindrome(getInput());

        println("\n");

    } // main

} // Unit1Task3
