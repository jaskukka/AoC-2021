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
        String[] splitInput;

        for (int i = 0; i < input.size(); i++) {
            splitInput = input.get(i).split(" ");
            if (splitInput[0].equals("forward")) {
                horizontal += Integer.parseInt(splitInput[1]);
            }
            else if (splitInput[0].equals("down")) {
                vertical += Integer.parseInt(splitInput[1]);
            }
            else if (splitInput[0].equals("up")) {
                vertical -= Integer.parseInt(splitInput[1]);
            }
        }

        System.out.println("horizontal: " + horizontal);
        System.out.println("depth: " + vertical);
        System.out.println(horizontal*vertical);
    }
}