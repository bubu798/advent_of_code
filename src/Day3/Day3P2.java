package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3P2 {
    public static void main(String[] args) {
        // Read the input from a file
        File inputFile = new File("src/Day3/input.txt");
        try (Scanner scanner = new Scanner(inputFile)) {
            // Sum of common item type priorities
            int sum = 0;

            // Iterate through each group of three rucksacks
            while (scanner.hasNextLine()) {
                String rucksack1 = scanner.nextLine();
                String rucksack2 = scanner.nextLine();
                String rucksack3 = scanner.nextLine();

                // Iterate through each character in the rucksacks
                for (int i = 0; i < rucksack1.length(); i++) {
                    char c = rucksack1.charAt(i);

                    // Check if the character is present in all rucksacks
                    if (rucksack1.indexOf(c) >= 0 && rucksack2.indexOf(c) >= 0 && rucksack3.indexOf(c) >= 0) {
                        // If the character is present in all rucksacks, convert it to a priority
                        // and add it to the sum of common item type priorities
                        int priority = getItemPriority(c);
                        sum += priority;
                        break;
                    }
                }
            }

            // Print the sum of common item type priorities
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Converts an item type character to its corresponding priority
    private static int getItemPriority(char c) {
        if (Character.isLowerCase(c)) {
            // Lowercase item types a through z have priorities 1 through 26
            return (int) c - 'a' + 1;
        } else {
            // Uppercase item types A through Z have priorities 27 through 52
            return (int) c - 'A' + 27;
        }
    }
}