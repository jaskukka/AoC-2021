import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class AdvancedSonar {
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
        System.out.println("input size: " + input.size());
        int increased = 0;
        int firstWindow;
        int secondWindow;

        for (int i = 2; i < input.size()-1; i++) {
            firstWindow = input.get(i-2) + input.get(i-1) + input.get(i);
            secondWindow = input.get(i-1) + input.get(i) + input.get(i+1);
            System.out.println("first: " + firstWindow + ", second: " + secondWindow);
            if (secondWindow > firstWindow) {
                increased++;
            }
        }
        System.out.println(increased);
    }
}