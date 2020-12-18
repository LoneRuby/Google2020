package baguenard.uk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maxCases = Integer.valueOf(scanner.nextLine());
        int currentCase = 0;
        while (maxCases != currentCase) {
            Integer peakCount = 0;
            Integer inputSize = Integer.valueOf(scanner.nextLine());
            String line = scanner.nextLine();
            String[] processLine = line.split("\\s+");
            for (int i = 0; i < inputSize; i++) {
                if (i == 0) {

                } else if (i == (inputSize - 1)) {

                } else {
                    Integer previousInt = Integer.valueOf(processLine[(i - 1)]);
                    Integer currentInt = Integer.valueOf(processLine[i]);
                    Integer nextInt = Integer.valueOf(processLine[(i + 1)]);
                    if ((previousInt < currentInt) && (currentInt > nextInt)) {
                        peakCount++;
                    }
                }
            }
            System.out.println("Case #" + (currentCase + 1) + ": " + peakCount);
            currentCase++;
        }
    }
}
