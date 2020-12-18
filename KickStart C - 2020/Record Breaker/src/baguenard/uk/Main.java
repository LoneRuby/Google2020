package baguenard.uk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maxCases = Integer.valueOf(scanner.nextLine());
        int currentCase = 0;
        while (maxCases != currentCase) {
            Integer days = Integer.valueOf(scanner.nextLine());
            int currentDay = 0;
            Integer prevVis = 0;
            Integer visRec = 0;
            Integer record = 0;
            Boolean recPrev = false;
            String line = scanner.nextLine();
            String[] processLine = line.split("\\s+");
            while (days > currentDay) {
                Integer curVis = Integer.valueOf(processLine[currentDay]);
                if(currentDay == (days - 1) && curVis > visRec || curVis < prevVis && recPrev) {
                    if(curVis < prevVis && recPrev) System.out.println(prevVis);
                    else System.out.println(curVis);
                    record++;
                }
                recPrev = false;
                if(curVis > visRec) {
                    visRec = curVis;
                    recPrev = true;
                }
                prevVis = curVis;
                currentDay++;
            }
            System.out.println("Case #" + (currentCase + 1) + ": " + record);
            currentCase++;
        }
    }
}
