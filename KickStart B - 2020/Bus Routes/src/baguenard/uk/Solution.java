import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maxCases = Integer.valueOf(scanner.nextLine());
        int currentCase = 0;
        while(maxCases != currentCase) {
            String lineOne = scanner.nextLine();
            String[] processLineOne = lineOne.split("\\s+");
            Integer n = Integer.valueOf(processLineOne[0]);
            Long d = Long.valueOf(processLineOne[1]);
            String lineTwo = scanner.nextLine();
            String[] processLineTwo = lineTwo.split("\\s+");
            Long closestDay = d;
            for (Integer i = n - 1; i >= 0; i--) {
                Long currentRuntime = Long.valueOf(processLineTwo[i]);
                Long nearestRuntime = currentRuntime;
                Boolean gotNearestRuntime = false;
                while (!gotNearestRuntime) {
                    nearestRuntime = nearestRuntime + currentRuntime;
                    if (nearestRuntime > closestDay) {
                        nearestRuntime = nearestRuntime - currentRuntime;
                        gotNearestRuntime = true;
                    }
                }
                closestDay = nearestRuntime;
            }
            System.out.println("Case #" + (currentCase + 1) + ": " + closestDay);
            currentCase++;
        }
    }
}
