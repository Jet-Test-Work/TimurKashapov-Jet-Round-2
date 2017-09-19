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

        if (str == null) return new char[]{};

        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; ++i) { arr[i] = str.charAt(i); }

        return arr;
    } // toCharacterArray()

    /**
     * Сколько знаков препинания (пунктуации) в массиве символов.
     *
     * @param src массив символов.
     * @return количество.
     */
    public static int punctuations(char[] src) {

        if (src == null) return 0;

        // Символы пунктуаций.
        int pCounter = 0;
        char[] punctua = {
                '.', ',',  '!',  '?', '-',
                ':', ';', '\'', '\"', '(',
                ')', };

        // Специальные символы
        int sCounter = 0;
        char[] specs  = {
                '~', '@', '#', '$', '%',
                '&', '*', '_', '=', '+',
                '[', ']', '{', '}', '>',
                '/', '<', '^', '`', };

        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < punctua.length; j++) {
                if (src[i] == punctua[j]) ++pCounter;
            } // for j
        } // for i

        return pCounter;
    } // punctuations()


    /**
     * Удаление знаков препинания.
     *
     * @param src массив символов.
     * @return массив символов.
     */
    public static char[] clean(char[] src) {

        char[] res
    } // clean()

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
