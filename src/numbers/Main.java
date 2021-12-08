package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] array;
        Scanner scanner = new Scanner(System.in);
        String s;

        System.out.println("Welcome to Amazing Numbers!\n");
        instructions();

        while (true) {

            System.out.println("\nEnter a request:");
            s = scanner.nextLine().toUpperCase(Locale.ROOT);
            array = s.split(" ");

            if (s.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }

            if (s.equals("")) {
                instructions();
            }

            if (inputCheck(array)) {
                if (array.length == 1) {
                    OneInput.handleOneInput(array);
                } else if (array.length == 2) {
                    TwoInputs.handleTwoInputs(array);
                } else if (array.length >= 3) {
                    PropertyInputs.handleWithPropertyInputs(array);
                }
            }
        }
    }

    protected static void instructions() {
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- two natural numbers and properties to search for;\n" +
                "- a property preceded by minus must not be present in numbers;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
    }

    protected static boolean inputCheck(String[] array) {
        String[] properties = {"EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SQUARE", "SUNNY"
                , "JUMPING", "HAPPY", "SAD", "-EVEN", "-ODD", "-BUZZ", "-DUCK", "-PALINDROMIC", "-GAPFUL", "-SPY"
                , "-SQUARE", "-SUNNY", "-JUMPING", "-HAPPY", "-SAD"};
        ArrayList<String> fails = new ArrayList<>();
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = true;
        if (array.length >= 1) {
            try {
                long l = Long.parseLong(array[0]);
                if (l < 0) {
                    b1 = false;
                }
            } catch (Exception e) {
                b1 = false;
            }
        }
        if (array.length >= 2) {
            try {
                long l = Long.parseLong(array[1]);
                if (l <= 0) {
                    b2 = false;
                }
            } catch (Exception e) {
                b2 = false;
            }

        }
        for (int i = 2; i < array.length; i++) {
            if (!(Arrays.asList(properties).contains(array[i]))) {
                fails.add(array[i]);
                b3 = false;
            }
        }
        if (Arrays.asList(array).contains("EVEN") && Arrays.asList(array).contains("ODD")
                || Arrays.asList(array).contains("SUNNY") && Arrays.asList(array).contains("SQUARE")
                || Arrays.asList(array).contains("DUCK") && Arrays.asList(array).contains("SPY")
                || Arrays.asList(array).contains("HAPPY") && Arrays.asList(array).contains("SAD")
                || Arrays.asList(array).contains("-EVEN") && Arrays.asList(array).contains("-ODD")
                || Arrays.asList(array).contains("-SUNNY") && Arrays.asList(array).contains("-SQUARE")
                || Arrays.asList(array).contains("-DUCK") && Arrays.asList(array).contains("-SPY")
                || Arrays.asList(array).contains("-HAPPY") && Arrays.asList(array).contains("-SAD")
                || Arrays.asList(array).contains("EVEN") && Arrays.asList(array).contains("-EVEN")
                || Arrays.asList(array).contains("ODD") && Arrays.asList(array).contains("-ODD")
                || Arrays.asList(array).contains("SUNNY") && Arrays.asList(array).contains("-SUNNY")
                || Arrays.asList(array).contains("BUZZ") && Arrays.asList(array).contains("-BUZZ")
                || Arrays.asList(array).contains("DUCK") && Arrays.asList(array).contains("-DUCK")
                || Arrays.asList(array).contains("PALINDROMIC") && Arrays.asList(array).contains("-PALIMDROMIC")
                || Arrays.asList(array).contains("GAPFUL") && Arrays.asList(array).contains("-GAPFUL")
                || Arrays.asList(array).contains("SPY") && Arrays.asList(array).contains("-SPY")
                || Arrays.asList(array).contains("SQUARE") && Arrays.asList(array).contains("-SQUARE")
                || Arrays.asList(array).contains("JUMPING") && Arrays.asList(array).contains("-JUMPING")) {
            b5 = false;
        }
        if (!b1) {
            System.out.println("The first parameter should be a natural number or zero.");
        }
        if (!b2) {
            System.out.println("The second parameter should be a natural number.");
        }
        if (fails.size() == 1) {
            System.out.println("The property " + fails + " is wrong.\n" +
                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING" +
                    ", HAPPY, SAD]");
        } else if (fails.size() >= 2) {
            System.out.println("The properties " + fails + " are wrong.\n" +
                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING" +
                    ", HAPPY, SAD]");
        } else if (!b5) {
            System.out.println("The request contains mutually exclusive properties: ["
                    + array[2] + ", " + array[3] + "]\n" +
                    "There are no numbers with these properties.");
        }
        return b1 && b2 && b3 && b4 && b5;
    }
}