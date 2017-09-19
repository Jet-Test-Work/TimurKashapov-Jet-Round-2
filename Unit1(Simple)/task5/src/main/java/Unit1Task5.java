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
     * Возвращает подтверждение, если символ является символом пунктуации.
     *
     * @param ch символ.
     * @return подстверждение.
     */
    public static boolean isPunctuation(char ch) {

        char[] punctua = {' ', '.', ',',  '!',  '?', '-', ':', ';', '\'', '\"', '(', ')' };

        for (int i = 0; i < punctua.length; ++i) { if (ch == punctua[i]) return true; } // for i

        return false;
    } // isPunctuation()

    /**
     *  Возвращает подстверждение, если сивол является спец. символом.
     *
     * @param ch исходный символ.
     * @return подтверждение.
     */
    public static boolean isSpecs(char ch) {

        char[] specs  = {
                '~', '@', '#', '$', '%', '&', '*', '_', '=', '+',
                '[', ']', '{', '}', '>', '/', '<', '^', '`', };

        for (int i = 0; i < specs.length; ++i) { if (ch == specs[i]) return true; } // for i

        return false;
    } // isSpecs()

    /**
     * Подтверждение является ли символ числом.
     *
     * @param ch исходный сисвол.
     * @return подтверждение.
     */
    private static boolean isNumber(char ch) { return ch >= '0' && ch <= '9'; } // isNumber()

    /**
     * Сколько знаков препинания (пунктуации) в массиве символов.
     *
     * @param src массив символов.
     * @return количество.
     */
    public static int punctuations(char[] src) {

        if (src == null) return 0;

        // Счетчик символов пунктуаций.
        int pCounter = 0;
        int pLen     = 12;

        for (int i = 0; i < src.length; ++i) { if ( isPunctuation(src[i]) ) ++pCounter; } // for i

        return pCounter;
    } // punctuations()

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
