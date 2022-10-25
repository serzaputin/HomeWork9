import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее Задание 9");

        System.out.println("Задание 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Задание 2");
        int[] arr4 = {1, 2, 3};
        double[] arr5 = {1.57, 7.654, 9.986};
        char[] arr6 = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
            if (i != arr4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]);
            if (i != arr5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i]);
            if (i != arr6.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        int[] arr7 = {1, 2, 3};
        double[] arr8 = {1.57, 7.654, 9.986};
        char[] arr9 = {'a', 'b', 'c', 'd', 'e'};

        for (int i = arr7.length - 1; i >= 0; i--) {
            System.out.print(arr7[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr8.length - 1; i >= 0; i--) {
            System.out.print(arr8[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr9.length - 1; i >= 0; i--) {
            System.out.print(arr9[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        int[] arr10 = {1, 2, 3};

        for (int i = 0; i < arr7.length; i++) {
            if (arr10[i] % 2 != 0) {
                arr10[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr10));
    }
}