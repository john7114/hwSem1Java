import java.util.Arrays;
public class HomeworkContinued {
    public static void main(String[] args) {
        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        // int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // System.out.println(Arrays.toString(replaceItem(arr1))); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        /**
         * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         *    пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        // int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // System.out.println(Arrays.toString(lessThan6MultiplyBy2(arr2))); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        /** 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         *  (можно только одну из диагоналей, если обе сложно).
         *  Определить элементы одной из диагоналей можно по следующему принципу:
         *  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         *  Также заполнить элементы побочной диагонали
         */
        // int [][] squareArray = new int[5][5];
        // fillTheDiagonalsWithThe1(squareArray); // [1, 0, 0, 0, 1]
                                               // [0, 1, 0, 1, 0]
                                               // [0, 0, 1, 0, 0]
                                               // [0, 1, 0, 1, 0]
                                               // [1, 0, 0, 0, 1]
    }

    private static int[] replaceItem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] lessThan6MultiplyBy2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i]*2;
            }
        }
        return array;
    }

    static void fillTheDiagonalsWithThe1(int[][] matrix) {
        int columns = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][columns] = 1;
            columns--;
        }
        for (int[] i: matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
