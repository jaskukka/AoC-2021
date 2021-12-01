import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Template {
    public static ArrayList<Integer> readFile() {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        File file = new File("input.txt");
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(file);
        
            while (scanner.hasNextInt()) {
                inputList.add(scanner.nextInt());
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
        ArrayList<Integer> input = readFile();
    }
}