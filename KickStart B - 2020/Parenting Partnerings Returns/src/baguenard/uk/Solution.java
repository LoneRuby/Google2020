package baguenard.uk;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maxCases = Integer.valueOf(scanner.nextLine());
        int currentCase = 0;
        while (maxCases != currentCase) {
            int posx = 1;
            int posy = 1;
            String process = scanner.nextLine();
            boolean isRegular = false;
            String out = process;
            while (!isRegular) {
                isRegular = true;
                if(out.contains("(")) {
                    Integer begin = out.indexOf('(');
                    boolean endFound = false;
                    int chara = begin;
                    int openPar = 1;
                    while (!endFound) {
                        if(out.charAt(chara) == '(') {
                            openPar++;
                        } else if (out.charAt(chara) == ')') {
                            openPar--;
                        }
                        if(out.charAt(chara) == ')' && openPar == 1) {
                            endFound = true;
                        } else {
                            chara++;
                        }
                    }
                    String SID = process.substring(begin + 1, chara);
                    String processMod = process.replace(SID, " ") ;
                    processMod = processMod.replace('(', ' ');
                    processMod = processMod.replace(')', ' ');
                    Scanner multi = new Scanner(processMod);
                    Integer mult = multi.nextInt();
                    multi.close();
                    out = SID;
                    for (Integer i = 1; i < mult; i++) {
                        out = out + SID;
                    }
                }
                if(out.contains("(")) {
                    isRegular = false;
                }
            }
            System.out.println(out);
            System.out.println("Case #" + (currentCase + 1) + ": " + posx);
            currentCase++;
        }
    }
}
