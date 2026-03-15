import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] weight = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(weight));
        double[] doubles = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubles));
        int[] ints = {1, 5, 8, 6, 10};
        System.out.println(Arrays.toString(ints));

        System.out.println("Задание 2");

        int[] weights = {1, 5, 6, 5};

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", " + '\n');

            }
        }
        System.out.println('\n' + "Задание 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println("");
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println("");
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println('\n' + "Задание 4");

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;

            }
        }
        System.out.print(Arrays.toString(weight));


    }
}