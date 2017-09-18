import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа выполняет разложение числа на набор простых множителей (Факторизация).
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
        System.out.println("\n" + str);
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
    protected static boolean isNumber(String str) {

        boolean ok = true;

        if (str != null) {
            if (str.length() > 0) {
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
            } else { ok = false; }
        } else { ok = false; }

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
     * Является ли число простым.
     *
     * @return подтверждение.
     */
    protected static boolean isPrime(Long n) {

        boolean result = false;

        if ( n != null) {

            if ( n < 2L ) { return false; }
            else if ( n == 2L ) { return true; }
            else if( n % 2L == 0L ) { return false; }

            // пробный делитель
            int d = 3;

            // Алгоритм поиска простого числа.
            // n делим по модулю на пробный делитель.
            //
            while( d*d <= n ) { if (n % d == 0) { return false; } d += 2; } result = true;
        } else { result = false; }

        return result;
    } // isPrime()

    /**
     * Разложить число на простые множители.
     *
     * @param n исходное число.
     * @return набор простых множителей.
     */
    private static Long[] decomposeTheNumber(Long n) {

        ArrayList<Long> temp = new ArrayList<>();
        int counter = 0;

        // n - число для факторизации.
        // d - делитель
        // a - первый множитель
        // b - второй множитель
        Long a = n, b, d = 2L;

        // Если исходное число не простое - раскладываем на множители
        if ( ! isPrime(n) ) {
            for(int i = 0; d <= n; ++i) {
                if (a % d == 0L) {
                    a /= d; b = d; // Сохраняем частное от деления и записываем частное в делимое.
                    temp.add(b); ++counter; // записываем в массив и повышаем счетчик на 1
                }
                else { --i; if (d == 2L) { ++d; } else { d += 2L; } } }
        }
        // Иначе возвращаем исходное.
        else { temp.add(n) ; }

        Long[] result = new Long[temp.size()];

        for (int i = 0; i < result.length; i++) { result[i] = temp.get(i); } // for i

        return result;
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
            if ( isNumber(args[0])) { println(Arrays.toString(getPrimes(args[0]))); }
            else println("Incorrect input!");
        }
        // Интерактивный ввод через системную консоль.
        else { println(Arrays.toString(getPrimes(getInput()))); }

        println("\n");
    } // main()
}// Unit1Task2

