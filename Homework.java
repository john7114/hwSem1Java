import java.util.Arrays;
public class Homework {

    public static void main(String[] args) {
        // проверка, лежит ли сумма двух чисел между 10 и 20 включительно
        // System.out.println(isSumBetween10And20(5, 15)); // true
        // System.out.println(isSumBetween10And20(7, 15)); // false
        // System.out.println(isSumBetween10And20(2, 6)); // false

        // проверка, является ли число положительным?
        // System.out.println(isPositive(5)); // true
        // System.out.println(isPositive(-3)); // false

        // напечатать строку столько раз, сколько указано во втором аргументе функции
        // printString("abcd", 5); // abcdabcdabcdabcdabcd

        // проверка на високосный год
        // System.out.println(isLeapYear(1700)); // false
        // System.out.println(isLeapYear(1600)); // true
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        // int x = array[2][3];

        // должен вернуть массив длины len, каждое значение которого равно initialValue
        // System.out.println(Arrays.toString(createArray(3, 12))); // [12, 12, 12]
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int sumab = a + b;
        if (10 <= sumab & sumab <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // Чтобы определить, является ли год високосным, выполните следующие действия:
        //1. Если год делится на 4 без остатка, перейдите на шаг 2. В противном случае перейдите к выполнению действия 5.
        //2. Если год делится на 100 без остатка, перейдите на шаг 3. В противном случае перейдите к выполнению действия 4.
        //3. Если год делится на 400 без остатка, перейдите на шаг 4. В противном случае перейдите к выполнению действия 5.
        //4. Год високосный (366 дней).
        //5. Год не високосный год (365 дней).
        if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
            return true;
        } else if (year%4 == 0 && year%100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;

    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
}