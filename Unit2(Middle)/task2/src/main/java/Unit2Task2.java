import java.util.Scanner;

/**
 * Программа выполняет run-length-encoding кодирование строки.
 * (aaabccdd -> 3a1b2c2d)
 *
 * @author Timur Kashapov
 * @since 0.0.1
 */
public class Unit2Task2 {

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
     * RLE кодирование строки.
     *
     * @param str исходная строка.
     * @return полученная строка.
     */
    public static String encode(String str) {

        String ip = str;
        int len = ip.length(), i = 0, c = 0;
        char f = ip.charAt(0);

        String op = "";
        for(; i < len; ++i) {
            if(i+1<len) {
                if(ip.charAt(i) == ip.charAt(i+1)) { ++c; }
                else { op = op + Integer.toHexString(c + 1) + f; c = 0; f = ip.charAt(i + 1); }
            }
            else { op = op + Integer.toHexString(c + 1) + f; }
        }

//        println("Encoded line is: " + op);
//        println("Length of original string: "+len);
//        println("Length of encoded string: "+op.length());
//        println("Compression ratio:" +(op.length()*1.0/len));
//        println("\n");

        return op;
    } // encode()

    /**
     * Main.
     * @param args cmd args.
     */
    public static void main(String[] args) {

        println("\nThe program performs RLE the encoding of the string.");
        // Ввод аргументами через системную консоль.
        if (args.length > 0) println(encode(args[0]));
        // Интерактивный ввод через системную консоль.
        else println(encode(getInput()));

        println("\n");
    } // main()
} // Unit2Task2
