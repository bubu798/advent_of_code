import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2P1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Day2/input.txt"));
            Integer score = 0;
            Integer totalScore = 0;

            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(" ");
                //System.out.println(scanner.nextLine());
                if(str[0].equals("A")) {
                   // System.out.println("adversar piatra");
                    //System.out.println(str[0]);
                    if(str[1].equals("X")) {
                        score = 4;
//                        System.out.println("eu piatra");
//                        System.out.println(str[1]);
//                        System.out.println(score);
                    }else if(str[1].equals("Y")) {
                        score = 8;
                    } else score = 3;
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
                        score = 7;
                    }else if(str[1].equals("Y")) {
                        score = 2;
                    } else score = 6;
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
