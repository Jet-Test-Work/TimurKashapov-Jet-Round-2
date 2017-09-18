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
     * Разложить число на простые множители.
     *
     * @param src исходное число.
     * @return набор простых множителей.
     */
    private static Integer[] decompositeTheNumber(Integer src) {
        return new Integer[0];
    } // decompositeTheNumber()

    /**
     * Получить набор простых множителей.
     *
     * @param src исходный набор простых множителей.
     * @return исходный набор простых множителей.
     */
    public static Integer[] getSimpleMultipliers(String src) {

        return new Integer[0];
    } // getSimpleMultipliers()

    /** */
    public static void main(String[] args) {

        println("The program performs the decomposition of numbers in a set of simple multipliers.");

        // Ввод аргументами через системную консоль.
        if (args.length > 1){ if (0 < 1){ /* TO-DO */ }
        // Интерактивный ввод через системную консоль.
        else { /* TO-DO */ }

        println("\n");
    } // main()

} // Unit1Task2
