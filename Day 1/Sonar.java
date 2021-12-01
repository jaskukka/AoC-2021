import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.ArrayList;
import java.io.*;

public class Sonar {
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
        int increased = 0;
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) > input.get(i-1)) {
                increased++;
            }
        }
        System.out.println(increased);
    }
}