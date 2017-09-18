import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа выполняет разложение числа на набор простых множителей.
 *
 * @author Timur Kashapov.
 * @since 0.0.1
 */
public class Unit1Task2 {

    /**
     * Упрощённая запись System.out.println();
     *
     * @param str строка для вывода.
     */
    private static void println(String str) {
        System.out.println(str);
    } // println()

    /**
     * Получить набор чисел.
     *
     * @return набор чисел.
     */
    private static String getInput() {

        Scanner scan = new Scanner(System.in);
        String  str;

        do {
            System.out.printf("\nEnter the number you want to decompose into Prime factors: ");
            //System.out.printf("\nВведите число, которое необходимо разложить на простые множители: ");
            str = scan.next();
            if ( isNumber(str) ) { break; }
            else println("Incorrect input! Retype the number, please.");
//            println("Некорректный ввод! Повторите ввод числа.");
        } while (true);

        scan.close();

        return str;
    } // getInput()

    /**
     * Проверка строки на число.
     *
     * @param str исходная строка.
     * @return подтверждение.
     */
    private static boolean isNumber(String str) {

        boolean ok = true;

        char ch;
        int  len = str.length();

        // По символам элемента
        for (int i = 0; i < str.length(); ++i) {

            // Текущий символ строки.
            ch = str.charAt(i);
            // Если
            // 1. длина строки больше одного символа И
            // 2. проверяется первый символ И
            // 3. следующие за первым символом - цифра (0 <= ch <= 9)
            // - то этот символ интерпретируем как числовой знак и пропускаем итерацию.
            if (len > 1  && i == 0 && ch == '-' && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9') continue;
                // иначе проверяем символ на символ цифры.
            else { if ( ! (ch >= '0' && ch <= '9') ) { ok = false; break; } }
        }
        return ok;

    } // isNumber()

    /**
     * Преобразование строкового типа в в целое число.
     *
     * @param str исходная строка.
     * @return целое число.
     */
    private static Long toInteger(String str) {

        Long numb = null;

        try { numb = Long.parseLong(str); } catch (NumberFormatException e) { e.printStackTrace(); }

        return numb;
    } // toInteger()

    /**
     * Разложить число на простые множители.
     *
     * @param numb исходное число.
     * @return набор простых множителей.
     */
    private static Long[] decomposeTheNumber(Long numb) {

        //
        //
        //
        //
        println("DONE!");

        return new Long[0];
    } // decomposeTheNumber()

    /**
     * Получить набор простых множителей.
     *
     * @param str исходный набор простых множителей.
     * @return исходный набор простых множителей.
     */
    public static Long[] getPrimes(String str) { return decomposeTheNumber(toInteger(str)); } // getPrimes()

    /** */
    public static void main(String[] args) {

        println("\nThe program performs the decomposition of numbers in a set of simple multipliers.");

        // Ввод аргументами через системную консоль.
        if (args.length > 0) {
            if ( isNumber(args[0])) { Arrays.toString(getPrimes(args[0])); }
            else println("Incorrect input!");
        }
        // Интерактивный ввод через системную консоль.
        else { Arrays.toString(getPrimes(getInput())); }

        println("\n");
    } // main()
}// Unit1Task2

