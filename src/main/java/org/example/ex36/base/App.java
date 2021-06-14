package org.example.ex36.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        StatsCalculator sc = new StatsCalculator();
        String[] data = makeList();
        genNumListOut(data);
        System.out.printf("The average is %.1f\n" +
                "The minimum is %.0f\n" +
                "The maximum is %.0f\n" +
                "The standard deviation is %.2f\n", sc.average(data), sc.min(data), sc.max(data), sc.std(data));
    }

    private static void genNumListOut(String[] data) {
        System.out.print("Numbers: ");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.printf("%s, ", data[i]);
        }
        System.out.printf("%s\n", data[data.length - 1]);
        System.out.print("\n");
    }

    private static String[] makeList() {
        List<String> numList = new ArrayList<>();
        String num;
        while(true) {
            num = numPrompt();
            if(num.equals("done")) {
                break;
            }
            if (!num.equals("") || isNumber(num)) {
                numList.add(num);
            }
        }
        String[] numArray = new String[numList.size()];
        return numList.toArray(numArray);
    }

    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String numPrompt() {
        System.out.print("Enter a number: ");
        return in.nextLine();
    }
}
