package beginner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArraysAndFiles {
    public static void main(String[] args) throws IOException {

        int [] values = new int[11];

        int i = 0;

        File file = new File("Values.txt");

        if (file.exists()){
            Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext() && i < values.length) {
                values[i] = inputFile.nextInt();
                i++;
            }

            inputFile.close();

            for (int value : values) {
                System.out.println(value);
            }
        }
    }
}
