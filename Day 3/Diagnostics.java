import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;

public class Diagnostics {
    public static LinkedList<String> readFile() {
        File file = new File("input.txt");
        Scanner scanner = null;
        LinkedList<String> inputList = new LinkedList<String>();
        
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                inputList.add(scanner.nextLine());
            }
        }
        catch (Exception e) {
            if (scanner != null) {
                scanner.close();
            }
        }
        scanner.close();
        return inputList;
    }

    public static void main(String[] args) {
        LinkedList<String> input = readFile();

        String gamma = "";
        String epsilon = "";

        for (int i = 0; i < input.get(0).length(); i++) {
            int zeroes = 0;
            int ones = 0;
            for (int n = 0; n < input.size(); n++) {
                if (input.get(n).charAt(i) == '0') {
                    zeroes++;
                }
                else {
                    ones++;
                }
            }

            if (zeroes < ones) {
                gamma += "1";
                epsilon += "0";
            }
            else {
                gamma += "0";
                epsilon += "1";
            }
        }

        System.out.println(gamma);
        System.out.println(epsilon);
        int gammaInt = Integer.parseInt(gamma,2);
        int epsilonInt = Integer.parseInt(epsilon,2);
        System.out.println("power consumption = " + gammaInt*epsilonInt);

    }
}