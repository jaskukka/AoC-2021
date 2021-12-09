import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Bingo {
    public static ArrayList<String> readFile() {
        ArrayList<String> inputList = new ArrayList<String>();
        File file = new File("input.txt");
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(file);
        
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() > 0) {
                    System.out.println(line);
                    inputList.add(scanner.nextLine());
                }
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
        ArrayList<String> input = readFile();

        //System.out.println(input);
        //System.out.println(input.get(0).length());
    }
}