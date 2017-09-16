import java.util.Arrays;

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
 *         - если в наборе имеются нечисловые символы - то набор относится как нечисловой и не обрабатывается.
 *         - если в наборе имеются вещественные числа - то они приводятся к целочисленным.
 *         - программа не обрабатывает сверхбольшие числа.
 *
 *     Алгоритмы:
 *         - Алгоритм разбиения.
 *         - Алгоритм быстрой сортировки.
 *
 * @author Timur Kashapov
 * @since 0.0.1
 *
 * https://github.com/Jet-Test-Work/Jet-Round-2/tree/master/Unit1(Simple)
 */
public class Unit1Task1 {

    /**
     * Являются ли элементы массива натуральными числами.
     *
     * @param args commandline arguments
     * @return boolean
     */
    private static boolean isArrayOfNumbers(String[] args) throws RuntimeException {

        boolean result = true;
        // Проверяемый символ
        char ch;
        // По элементам набора
        for (int i = 0; i < args.length; ++i) {
            // По символам элемента
            for (int j = 0; j < args[i].length(); ++j) {
                // Если
                // длина элемента больше одного символа,
                // проверяется первый символ,
                // следующие за первым символом - цифры
                // - то этот символ интерпретируем как числовой знак и пропускаем итерацию.
                if ( args[i].length() > 1 && j == 0 && args[i].charAt(j + 1) >= '0' && args[i].charAt(j + 1) <= '9') continue;
                // иначе проверяем символ на цифру.
                else {
                    ch    = args[i].charAt(j);
                    if ( ! (ch >= '0' && ch <= '9') ) {
                        result = false;
                        throw new RuntimeException("Элементы набора являются не числами");
                    }
                }
            }
        }
        return result;
    } // isArrayOfNumbers()

    /**
     * Вычислить 2-ой во величине элемент набора чисел.
     *
     *
     * @return integer;
     */
    private static int calcPrevBigElemOfInt(String[] args) {

        int[] custom = new int[args.length];
        System.out.println(Arrays.toString(args));

        for (int i = 0; i < args.length; i++) { custom[i] = Integer.parseInt(args[i]); } // for i
        System.out.println(Arrays.toString(custom));

        int left, right;


        return 1;
    } // calcPrevBigElemOfInt(

    /**
     * Получить число, 2-й по величине элемент в наборе чисел.
     *
     */
    public static int getPrevBigElemOfInt(String[] args) throws RuntimeException {

        int result = 0;

        // Проверка входных данных
        //
        // Набор не пустой ?
        if ( args != null ) {
            // Набор числовой ?
            if ( isArrayOfNumbers(args) ) {
                // Набор соостоит из более чем 2-ух элементов ?
                if (args.length > 2) { result = calcPrevBigElemOfInt(args); }
                // Если набор состоит из 2-ух элементов - возвращаем меньший.
                else if ( args.length == 2 ) {
                    int a = Integer.parseInt(args[0]);
                    int b = Integer.parseInt(args[1]);
                    result = a < b  ? a : b ;
                }
                else { throw new RuntimeException("Входящий набор состоит из одного элемента"); }
            }
        } else { throw new RuntimeException("Входящий набор пуст"); }

        return result;
    } // getPrevBigElemOfInt()

    /**
     *
     * @param args commandline arguments.
     */
    public static void main(String[] args) {

        getPrevBigElemOfInt(args);

    } // main()
} // Unit1Task1
