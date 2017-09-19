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
     * Преобразование строки в массив символов.
     *
     * @param str строкаю
     * @return массив символов.
     */
    public static char[] toCharacterArray(String str) {

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
    private static boolean searchSubstring(String str, String subStr) {

        boolean result = false;

        char[] charsOfStr    = toCharacterArray(str);
        char[] charsOfSubStr = toCharacterArray(subStr);

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
        if (args.length > 1) searchSubstring(args[0], args[1]);
        // Интерактивный ввод через системную консоль.
        else

        println("\n");

    } // main()

} // Unit1Task1
