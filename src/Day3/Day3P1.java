package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day3P1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Day3/input.txt"));
            String string  = null;
            String firstHalf = null;
            String secondHalf = null;
            int priority = 0;
            int totalPriority = 0;
            while (scanner.hasNextLine()) {
                string  = scanner.nextLine();
                firstHalf = string.substring(0, string.length()/2);
                secondHalf = string.substring(string.length()/2, string.length());
                for(char letter : firstHalf.toCharArray()) {
                    if(secondHalf.indexOf(letter) != -1) {
                        priority = (int) letter;
                        break;
                    }
                }
                if(priority < 97) {
                    priority -= 38;
                }else priority -= 96;
                totalPriority += priority;
            }
            System.out.println("TOTAL = " +totalPriority);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
