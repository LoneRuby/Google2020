import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Submission {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("test.txt");
        Scanner scanner = new Scanner(reader);
        Integer maxCases = Integer.valueOf(scanner.nextLine());
        int currentCase = 0;
        while(maxCases != currentCase) {
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();
            String[] flv = firstLine.split("\\s+");
            String[] slv = secondLine.split("\\s+");
            Integer houseNumber = Integer.valueOf(flv[0]);
            Integer budget = Integer.valueOf(flv[1]);
            ArrayList houses = new ArrayList<Integer>(houseNumber);
            for (String value : slv) {
                houses.add(Integer.valueOf(value));
            }
            Collections.sort(houses);
            int houseBought = 0;
            Boolean possible = true;
            while (possible) {
                possible = false;
                if(houseBought == houses.size()) {
                    break;
                }
                if(budget >= (int) houses.get(houseBought)) {
                    budget = budget - (int) houses.get(houseBought);
                    houseBought = houseBought + 1;
                    possible = true;
                }
            }
            System.out.println("Case #" + (currentCase + 1) +": " + houseBought);
            currentCase = currentCase + 1;
        }
    }
}
