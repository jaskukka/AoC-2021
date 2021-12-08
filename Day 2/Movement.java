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
        
        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < input.size(); i++) {
            String command = input.get(i).split(" ")[0];
            int amount = Integer.parseInt(input.get(i).split(" ")[1]);
            
            if (command.equals("forward")) {
                horizontal += amount;
            }
            else if (command.equals("down")) {
                vertical += amount;
            }
            else if (command.equals("up")) {
                vertical -= amount;
            }
        }

        System.out.println("horizontal: " + horizontal);
        System.out.println("depth: " + vertical);
        System.out.println(horizontal*vertical);
    }
}