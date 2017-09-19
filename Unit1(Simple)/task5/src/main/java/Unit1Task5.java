import java.util.Scanner;

/**
 * Программа выполняет поиск подстроки в строке.
 *
 * @author Timur Kashapov
 * @since 0.0.1
 */
public class Unit1Task5 {

    /**
     * Упрощённая запись System.out.println();
     *
     * @param str строка для вывода.
     */
    private static void println(String str) { System.out.println("\n" + str); } // println()

    /**
     * Получить строку.
     *
     * @return строка.
     */
    private static void getInput() {

        System.out.printf("\nEnter the string: ");
        //System.out.printf("\nВведите строку: ");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.printf("\nEnter the substring: ");
        //System.out.printf("\nВведите подстроку: ");
        String sub = scan.nextLine();

        scan.close();

        if (searchSubstring(str, sub)) println("Yes");
        else println("No");

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
     * Поиск подстроки в строке.
     *
     * @param str строка.
     * @param subStr подстрока.
     * @return подтвержение.
     */
    public static boolean searchSubstring(String str, String subStr) {

        boolean result       = false;
        char[] charsOfStr    = toCharacterArray(str);
        char[] charsOfSubStr = toCharacterArray(subStr);
        int strLen           = charsOfStr.length;
        int subLen           = charsOfSubStr.length;
        int counter          = 0;

        for (int i = 0; i <= strLen - subLen; ++i) {
            for (int j = 0; j < subLen; ++j) {

                if ( charsOfStr[i + j] == charsOfSubStr[j] ) { ++counter; }
                if (counter == subLen) { result = true; break; }

            } // for j
            counter = 0;
        } // for i

        return result;
    } // searchSubstring()

    /**
     * Main.
     * @param args cmd args
     */
    public static void main(String[] args) {

        println("The program searches for the substring within the string");
//        println("Программа выполняет поиск подстроки в строке.");

        // Ввод аргументами через системную консоль.
        if (args.length > 1)  if (searchSubstring(args[0], args[1])) { println("Yes");} else { println("No");}
        // Интерактивный ввод через системную консоль.
        else getInput();

        println("\n");

    } // main()
} // Unit1Task1
