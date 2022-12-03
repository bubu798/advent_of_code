import java.io.*;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/1st problem/input.txt"));
            String line = null;
            Integer result = 0;
            Integer max = 0;
            Integer max2 = 0;
            Integer max3 = 0;
            while (scanner.hasNextLine()) {
                if(!(line = scanner.nextLine()).isEmpty()) {
                    result += Integer.parseInt(line);
                }
                else result = 0;
                if(result > max) {
                    max3 = max2;
                    max2 = max;
                    max = result;
                }else if(result > max2){
                    max3 = max2;
                    max2 = result;
                }
                else if(result > max3) {
                    max3 = result;
                }
                //System.out.println(max);
            }
            result  = max + max2 + max3;
            System.out.println(result);
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}