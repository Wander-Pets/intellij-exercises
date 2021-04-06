package school;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingArrays {
    public static void main(String[] args) {
        int values1 [] = new int[5];
        int values2 [] = new int[5];

        int i = 0;
        int j = 0;

        Scanner scan = new Scanner(System.in);

        while (i < values1.length) {
            System.out.print("Input value " + (i+1) + ": ");
            values1[i] = scan.nextInt();

            i++;
        }

        System.out.println(); //new line

        while (j < values2.length) {
            System.out.print("Input another value " + (i+1) + ": ");
            values2[j] = scan.nextInt();
            i++;
        }
        scan.close();

        boolean result = true;

        for (int x=0; x <= values1.length; j++) {
            if (Arrays.equals(values1, values2)) {
                result = true;
            }
            else {
                result = false;
            }
        }

        if (result == true) {
            System.out.println("Its the same!");
        }
        else {
            System.out.println("Not the same!");
        }

    }
}
