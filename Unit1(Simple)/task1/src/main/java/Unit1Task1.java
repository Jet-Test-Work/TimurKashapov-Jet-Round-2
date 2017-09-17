import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Программа возвращает 2-й по величине элемент набора чисел.
 *
 * Решение:
 *
 *     Предполагается что входной набор чисел является набором целых чисел,
 *     набор подается на вход программе через системную консоль и посредством аргументов на исполняемый jar файл,
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
     * Получить набор чисел.
     *
     * @return набор чисел.
     */
    private static String[] getInput() {

        System.out.printf("\nПрограмма возвращает 2-й по величине элемент набора чисел.\n");

        Scanner  scan = new Scanner(System.in);
        String[] dist;
        Integer  n = 0;

        do {
            System.out.printf("\nКаково количество элементов ? : ");
            n = scan.nextInt();
            if (n < 2) System.out.printf("\nКоличество элементов должно быть более одного! Повторите.");
        } while (n < 2);

        System.out.printf("Количество элементов: [%d]\n",n);

        dist = new String[n];

        do {
            System.out.printf("\nВведите набор чисел : ");
            int i = 0;
            while( i < dist.length ) {
                dist[i] = scan.next(); ++i;
                if ( dist.length > n || dist.length < n ) {
                    System.out.println("\nВвод набора чисел произведен не корректно! Повторите.");
                    break;
                }
            }
        } while ( dist.length > n || dist.length < n);

        if ( ! verifyInput(dist) ) { throw new RuntimeException("Набор чисел не верифицирован"); }

        scan.close();

        return dist;

    } // getInput()

    /**
     * Проверка вхоных данных на корректность.
     *
     * @param src входные данные.
     * @return подтверждение.
     */
    private static boolean verifyInput(String[] src) {

        boolean result = false;

        // Проверка входных данных на корректность.
        //
        // Набор не пустой ?
        if ( src[0] != null ) {

            // Набор состоит из более чем 2-ух элементов ?
            if (src.length >= 2) {

                // Набор числовой ?
                if (isArrayOfNumbers(src)) { result = true; }

            } else { throw new RuntimeException("Входящий набор состоит из одного элемента."); }
        } else { throw new RuntimeException("Входящий набор пуст."); }

        return result;

    } // verifyInput()

    /**
     * Являются ли элементы набора натуральными числами.
     * Проверка на положительные и отрицательные числа.
     *
     * @param args входнные данные.
     * @return подтверждение.
     */
    private static boolean isArrayOfNumbers(String[] args) throws RuntimeException {

        // Подразумеваем что набор является числовым.
        boolean result = true;
        // Проверяемый символ
        char ch;

        // Проверка на числовой тип
        //
        for (int i = 0; i < args.length; ++i) {
            // По символам элемента
            for (int j = 0; j < args[i].length(); ++j) {
                // Если
                // длина элемента больше одного символа,
                // проверяется первый символ,
                // следующие за первым символом - цифры
                // - то этот символ интерпретируем как числовой знак и пропускаем итерацию.
                if (args[i].length() > 1 &&
                        j == 0 &&
                        args[i].charAt(j)     == '-' &&
                        args[i].charAt(j + 1) >= '0' &&
                        args[i].charAt(j + 1) <= '9') continue;
                // иначе проверяем символ на цифру.
                else {
                    ch = args[i].charAt(j);
                    if ( ! (ch >= '0' && ch <= '9') ) {
                        result = false;
                        System.err.println(Arrays.toString(args));
                        throw new RuntimeException("Элементы набора являются не числами ---> " + ch);
                    }
                }
            }
        }
        return result;
    } // isArrayOfNumbers()

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
        if ( src.length == 2 ) { sMax = src[0] < src[1]  ? src[0] : src[1]; }
        // Если набор состоит из одного числового элемента - возвращаем его.
        else if ( src.length == 1 ) { sMax = src[0]; }
        // Если в наборе все числа одинаковые - возвращаем одно число.
        else if ( isArrayOfSameNumbers(src) ) { sMax = src[0]; }
        // Иначе получаем 2-ой по величине элемент из набора чисел.
        else {
            for (Integer a : src) {
                if (fMax < a) {
                    sMax = fMax;
                    fMax = a;
                } else if ((sMax < a)) { sMax = a; }
            }
        } // for i

        System.out.println(sMax);

        return sMax;

    } // getSecondBigNumber()

    /**
     * Равнозначность элементов набора чисел.
     *
     * @param src входные данные.
     * @return подтверждение.
     */
    private static boolean isArrayOfSameNumbers(Integer[] src) {

        boolean result = false;

        for (int i = 1; i < src.length; i++) { if (src[i - 1].equals(src[i])) result = true; } // for i
        
        return result;
    } // isArrayOfSameNumbers()

    /**
     * Main.
     * @param args commandline arguments.
     */
    public static void main(String[] args) {

        if (args.length > 1){ if ( verifyInput(args) ) getSecondBigNumber(toIntegers(args)); }
        else getSecondBigNumber(toIntegers(getInput()));

    } // main()
} // Unit1Task1
