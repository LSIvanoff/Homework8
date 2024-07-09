import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 & Task 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int a = 0; a < one.length; a++) {
            if (a < one.length - 1) {
                System.out.print(one[a] + ", ");
            } else
                System.out.print(one[a] + "\n");

        }

        double[] two = {1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            if (i < two.length - 1) {
                System.out.print(two[i] + ", ");
            } else
                System.out.print(two[i] + "\n");

        }

        int[] three = new int[]{1, 2, 3, 4, 5};
        for (int j = 0; j < three.length; j++) {
            if (j < three.length - 1) {
                System.out.print(three[j] + ", ");
            } else
                System.out.print(three[j] + "\n");

        }

        System.out.println("Task 3");
        for (int b = one.length - 1; b >= 0; b--) {
            System.out.print(one[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int x = two.length - 1; x >= 0; x--) {
            System.out.print(two[x]);
            if (x != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int y = three.length - 1; y >= 0; y--) {
            System.out.print(three[y]);
            if (y != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Task 4");
        for (int f = 0; f < one.length; f++) {
            if (one[f] % 2 != 0) {
                one[f] += 1;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}