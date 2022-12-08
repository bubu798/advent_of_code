package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Day4P1 {
    public static void main(String[] args) {
        File inputFile = new File("src/Day4/input.txt");
        try {
            // Create a Scanner for the file
            Scanner input = new Scanner(inputFile);
            String[] elfs = null;
            String[] range1 = null;
            String[] range2 =  null;
            int count = 0;

            // Read data from a file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                elfs = line.split(",");
                range1 = elfs[0].split("-");
                range2 = elfs[1].split("-");
                if((Integer.parseInt(range1[0]) <= Integer.parseInt(range2[0]) && Integer.parseInt(range1[1]) >= Integer.parseInt(range2[1])) ||
                        (Integer.parseInt(range2[0]) <= Integer.parseInt(range1[0]) && Integer.parseInt(range2[1]) >= Integer.parseInt(range1[1]))) {
                    count++;
                }
            }
            System.out.println(count);
            // Close the file
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
