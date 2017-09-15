
/**
 * 1. Программа возвращает 2-й по величине элемент набора чисел.
 *
 *
 *
 * Решение:
 *
 *     Решение задачи производится итерациями.
 *
 *     Предполагается что входной набор чисел является набором целых или вещественных чисел,
 *     набор подается на вход программе через системную консоль и при этом проверяются несколько условий:
 *         - если в наборе имеется нечисловые символы - то набор относится как нечисловой и не обрабатывается.
 *         - если в наборе имеется хотя бы одно вещественное число - то весь набор чисел приводится
 *           к вещественным числам и обрабатывается как набор вещественных чисел.
 *         - программа не обрабатывает сверхбольшие числа.
 *
 *     Алгоритм:
 *         - Берутся два элемента с разных концов числового набора и, поочерёдно сравнивая с другими элементами
 *           заменяются если другой элемент являтся большим по величине, далее двигаются на встречу друг другу.
 *         - Элемент, взятый с начала набора, именуется как left.
 *         - Элемент, взятый с конца набора, именуется как right.
 *         - При достижении точки "встречи" двух элементов, они сравниваются между собой -
 *           меньший элемент есть число 2-ое по величине из набора чисел.
 *
 * @author Timur Kashapov
 * @since 0.0.1
 *
 * https://github.com/Jet-Test-Work/Jet-Round-2/tree/master/Unit1(Simple)
 */
public class Unit1Task1 {

    /**
     *
     * @param args commandline arguments.
     */
    public static void main(String... args) {

        // Проверка входных данных
        //
        // Пустой ?
        if ( args != null ) {

            // "НЕ ЧИСЛО" ?
            if ( isArrayOfNumbers(args) ) {

                // Float ?
                if ( isArrayOfFloats(args) ) {

                    getPrevBigElemOfFloats(args);

                } else { getPrevBigElemOfInt(args); }
            } else { throw new RuntimeException("Элементы набора являются не числами"); }
        } else { throw new RuntimeException("Входящий массив пуст"); }
    } // main()

    /**
     * Являются ли элементы массива числами.
     *
     * @param args commandline arguments
     * @return boolean
     */
    private static boolean isArrayOfNumbers(String... args) {

        boolean result = false;

        if (args == null);
        
        return result;
    } // isArrayOfNumbers()

    /**
     * Являются ли элементы массива целыми числами.
     *
     * @param args commandline arguments
     * @return boolean
     */
    private static boolean isArrayOfIntegers(String... args) {

        return false;
    } // isArrayOfIntegers()

    /**
     * Являются ли элементы массива вещественными числами.
     *
     * @param args commandline arguments
     * @return boolean
     */
    private static boolean isArrayOfFloats(String... args) {

        return false;

    } // isArrayOfFloats()

    /**
     *
     * @param args commandline arguments.
     */
    private static void getPrevBigElemOfFloats(String... args) {

    } // getPrevBigElemOfFloats()

    /**
     * Получить число, 2-й по величине элемент в наборе чисел.
     *
     */
    private static int getPrevBigElemOfInt(String... args) {

        // Массив для преобразования исходного набора в целочисленный.
        //
        int[] custom = new int[args.length];
        for (int i = 0; i < args.length; i++) { custom[i] = Integer.parseInt(args[i]); }

        // Переменные алгоритма.
        //
        int
                k = 0,
                j = custom.length - 1,
                i = 0,
                left = custom[0],
                right = custom[custom.length - 1],
                end = custom.length;

        // Являются ли два крайних элемента равным друг другу.
        // и не являются ли все числа в наборе одинаковыми.
        //
        while ( left == right ) {
            left = custom[++i];
            if ( --end < 0 ) throw new RuntimeException("В наборе все числа одинаковые") ;
        } // while

        // Алгоритм.
        //
        while ( ++k < --j ) {
            if ( left  < custom[k] ) { int tmp = left;  left  = custom[k]; custom[k] = tmp; }
            if ( right < custom[j] ) { int tmp = right; right = custom[j]; custom[j] = tmp; }
        } // while

        // Возврат 2-ого по величине числа из набора чисел.
        //
        return left < right ? left : right ;
    } // getPrevBigElemOfInt()

} // Unit1Task1
