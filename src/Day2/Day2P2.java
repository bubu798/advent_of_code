import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2P2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Day2/input.txt"));
            Integer score = 0;
            Integer totalScore = 0;

            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(" ");
                if(str[0].equals("A")) {
                    if(str[1].equals("X")) {
                        score = 3;
                    }else if(str[1].equals("Y")) {
                        score = 4;
                    } else score = 8;
                }
                else if(str[0].equals("B")) {
                    if(str[1].equals("X")) {
                        score = 1;
                    }else if(str[1].equals("Y")) {
                        score = 5;
                    } else score = 9;
                }
                else if(str[0].equals("C")) {
                    if(str[1].equals("X")) {
                        score = 2;
                    }else if(str[1].equals("Y")) {
                        score = 6;
                    } else score = 7;
                }
                totalScore += score;
                score = 0;
            }
            System.out.println(totalScore);

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
