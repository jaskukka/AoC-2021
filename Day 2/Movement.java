import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Movement {
    public static ArrayList<String> readFile() {
        ArrayList<String> inputList = new ArrayList<String>();
        File file = new File("input.txt");
        Scanner scanner = null;
        
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
        ArrayList<String> input = readFile();
        System.out.println(input);
    }
}