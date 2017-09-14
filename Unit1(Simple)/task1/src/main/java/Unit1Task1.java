
/**
 * 1. Программа возвращает 2-й по величине элемент набора чисел.
 *
 *
 *
 * @author Timur Kashapov
 * @since 0.0.1
 */
public class Unit1Task1 {

    /** */
    public static void main(String... args) {

        if ( args != null ) { getPrevBigElem(args); }
        else { throw new RuntimeException("Входящий массив пуст"); }

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
     * Получить число, 2-й по величине элемент в наборе чисел.
     *
     */
    private static int getPrevBigElem(String... args) {

        // Проверка массива на типы входящих данных

        // на "НЕ ЧИСЛО"
        if ( isArrayOfNumbers(args) ) {

            // на Float
            if ( isArrayOfFloats(args) ) {

                // TO-DO
            } else {

                // на Integer
                isArrayOfIntegers();
            }
        } else { throw new RuntimeException("Элементы набора являются не числами"); }

        return Integer.parseInt(sort(args)[args.length - 1]);
    } // getPrevBigElem()

    /**
     *
     */
    private static void swap(int a, int b) {

        int tmp = a;
        a = b;
        b = tmp;
    } // swap()

} // Unit1Task1
