import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

/**
 * 1. Программа возвращает 2-й по величине элемент набора чисел.
 *
 * Решение:
 *
 *     Предполагается что входной набор чисел является набором целых чисел,
 *     набор подается на вход программе через системную консоль или посредством аргументов на исполняемый jar файл,
 *     при этом проверяются несколько условий:
 *         - если в наборе имеются нечисловые символы - то набор относится как нечисловой и не обрабатывается.
 *         - если в наборе имеются вещественные числа - то они приводятся к целочисленным.
 *         - программа не обрабатывает сверхбольшие числа.
 *
 * @author Timur Kashapov
 * @since 0.0.1
 *
 * https://github.com/Jet-Test-Work/Jet-Round-2/tree/master/Unit1(Simple)
 */
public class Unit1Task1 {

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
    private static String[] getInput() {

        Scanner  scan = new Scanner(System.in);
        String[] dist;
        String   n ;
        Integer  d = 0;

        do {
            System.out.printf("\nEnter the number of elements of a set of numbers (at least two): ");
            //System.out.printf("\nВведите количество элементов, составляющих набор чисел (не менее двух): ");
            n = scan.next();
            if ( isNumber(n) ) {
                d = Integer.parseInt(n);
                if (d < 2) println("Introduced a number of elements of a set is incorrect! Repeat, please.");
//                        ;println("Введенное количество элементов набора некорректно! Повторите. ");
            }
            else println("Incorrect input! Retype the numbers, please.");
//            println("Некорректный ввод! Повторите ввод числа.");
        } while (d < 2);

        dist = new String[d];

        do {
            System.out.printf("\nPlease enter a set of numbers: ");
//            System.out.printf("\nВведите набор чисел : ");

            int i = 0;
            while( i < dist.length ) { dist[i] = scan.next(); ++i; }

            if ( ! verifyInput(dist) ) { println("The set of integers is not verified. Re-enter, please"); }
//            println("Набор чисел не верифицирован. Повторите ввод");
            else break;

        } while ( true );

        scan.close();

        return dist;
    } // getInput()

    /**
     * Проверка входных данных на корректность.
     *
     * @param src входные данные.
     * @return подтверждение.
     */
    public static boolean verifyInput(String[] src) {

        boolean result = false;

        // Проверка входных данных на корректность.
        //
        // Набор не пустой ?
        if ( src != null ) {
            //
            if (src.length != 0) {

                // Набор состоит из более чем 2-ух элементов ?
                if (src.length >= 2) {

                    // Набор числовой ?
                    if (isArrayOfNumbers(src)) { result = true; }

                } else { println("Incoming set consists of at least two elements!"); }
//                println("Входящий набор состоит из менее двух элементов!");
            } else { println("Incoming set is empty!"); }
//            println("Входящий набор пуст!");
        } else { println("The incoming set is NULL!"); }
//        println("Входящий набор NULL!");

        return result;

    } // verifyInput()

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
     * Являются ли элементы набора натуральными числами.
     * Проверка осуществляется на положительные и отрицательные числа.
     *
     * @param src входнные данные.
     * @return подтверждение.
     */
    private static boolean isArrayOfNumbers(String[] src) {

        // Подразумеваем что набор является числовым.
        boolean ok = true;
        // Счетчик невалидных символов.
        int count  = 0;

        // Проверка на числовой тип
        //
        for (int i = 0; i < src.length; ++i) {

            // Если в строке не числовой символ - выбросить исключение.
            if ( ! isNumber(src[i]) ) {
                println( "\n" + Arrays.toString(src));
                println("The element of the set is not a valid number ---> " + src[i]);
//                println("Элемент набора является не числом ---> " + src[i]);
                ++count;
            }
        } // for i

        if (count > 0) ok = false;

        return ok;
    } // isArrayOfNumbers()

    /**
     * Равнозначность элементов набора чисел.
     *
     * @param src входные данные.
     * @return подтверждение.
     */
    private static boolean isArrayOfSameNumbers(Integer[] src) {

        boolean ok = true;

        for (int i = 1; i < src.length; ++i) { if ( ! src[i - 1].equals(src[i]) ) { ok = false; break; } } // for i

        return ok;
    } // isArrayOfSameNumbers()

    /**
     * Конвертация элементов строкового типа данных в числовой тип данных.
     *
     * @param src входные данные строкового типа.
     * @return выходные данные числово типа.
     */
    private static Integer[] toIntegers(String[] src) {
        Integer dist[] = new Integer[src.length];
        for (int i = 0; i < src.length; ++i) { dist[i] = Integer.parseInt(src[i]); } // for i
        return dist;
    } // toIntegers()

    /**
     * Получить 2-ое по величине число из набора чисел.
     *
     * @param src входные данные.
     * @return 2-ое по величине число из набора данных.
     */
    public static Integer getSecondBigNumber(Integer[] src) {

        // Первое и второе результатные максимальные значения.
        Integer fMax = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE; // first, second

        // Если набор состоит из 2-ух элементов - возвращаем меньший.
        if ( src.length == 2 && ! isArrayOfSameNumbers(src) ) { sMax = src[0] < src[1]  ? src[0] : src[1]; }
        // Если набор состоит из одного числового элемента - возвращаем его.
        else if ( src.length == 1 ) { sMax = src[0]; }
        // Если в наборе все числа одинаковые - возвращаем одно число.
        else if ( isArrayOfSameNumbers(src) ) { println("Elements of a set of numbers equivalent to each other!");sMax = src[0]; }
//            println("Элементы набора чисел равнозначны друг другу!");
        // Иначе получаем 2-ой по величине элемент из набора чисел.
        else {
            for (Integer a : src) {
                if (fMax < a) {
                    sMax = fMax;
                    fMax = a;
                } else if ((sMax < a)) { sMax = a; }
            }
        } // for i

        System.out.printf("\nThe second largest number in the set: %d\n\n", sMax);
//        System.out.printf("\nВторое по величине число в наборе: %d\n\n", sMax);

        return sMax;

    } // getSecondBigNumber()

    /**
     * Main.
     * @param args commandline arguments.
     */
    public static void main(String[] args) {

        println("\nThe program returns the 2nd largest element of a set of numbers.\n");
//        println("\nПрограмма возвращает 2-й по величине элемент набора чисел.\n");

        // Ввод аргументами через системную консоль.
        if (args.length > 1){ if ( verifyInput(args) ) getSecondBigNumber(toIntegers(args)); }
        // Интерактивный ввод через системную консоль.
        else getSecondBigNumber(toIntegers(getInput()));

    } // main()
} // Unit1Task1
