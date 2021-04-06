package school;

import java.util.Scanner;
import java.util.Arrays;

public class ComparingStringArrays {
    public static void main(String[] args) {
        String [] names1 = new String[5];
        String [] names2 = new String[5];

        int i = 0;
        int j = 0;

        Scanner scan = new Scanner(System.in);
        while (i < names1.length) {
            System.out.print("Input name " + (i+1) + ": ");
            names1[i] = scan.nextLine();

            i++;
        }

        while (j < names1.length) {
            System.out.print("Input another name " + (j+1) + ": ");
            names2[j] = scan.nextLine();

            j++;
        }

        boolean result = true;

        for (int x = 0; x < names1.length && x < names2.length; x++) {
            if (Arrays.equals(names1, names2)) {
                result = true;
            }
            else {
                result = false;
            }
        }

        if (result == true) {
            System.out.println("The Same!");
        }
        else {
            System.out.println("Not the Same!");
        }

    }
}
