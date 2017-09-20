import java.util.Scanner;

/**
 * Программа выполняет run-length-decoding декодирование строки.
 * (3a1b2c2d -> aaabccdd)
 *
 * @author Timur Kashapov
 * @since 0.0.1
 */
public class Unit2Task3 {

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

        Scanner scan = new Scanner(System.in);
        String  str;

        System.out.printf("\nEnter the string: ");
        //System.out.printf("\nВведите строку");
        str = scan.nextLine();

        scan.close();

        return str;
    } // getInput()

    /**
     * RLD декодирование строки.
     *
     * @param str исходная строка.
     * @return полученная строка.
     */
    public static String decode(String str) {

        if (str == "" || str == null) return "";

        int count = 0;
        StringBuilder result = new StringBuilder () ;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) count = count * 10 + c - '0' ;
            else { while (count >0) { result.append(c); --count; } }
        }
        return result.toString();
    } // decode()

    /**
     * Main.
     * @param args cmd args.
     */
    public static void main(String[] args) {

        println("\nThe program performs RLE the encoding of the string.");
        // Ввод аргументами через системную консоль.
        if (args.length > 0) println(decode(args[0]));
            // Интерактивный ввод через системную консоль.
        else println(decode(getInput()));

        println("\n");
    } // main()
} // Unit2Task3
