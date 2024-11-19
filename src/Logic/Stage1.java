package Logic;

import java.util.Random;
import java.util.Scanner;

public class Stage1 {
    public static void kubik() {
        int rollTheDice = 2;
        while (true) {
           String numberRoll="";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Predict amount of points (2...12): ");
            int userNumber = scanner.nextInt();
            System.out.println("User rolls the dices: ...");
            for (int i = 0; i < rollTheDice; i++) {
                int printDice = new Random().nextInt(6) + 1;
                numberRoll += String.valueOf(printDice);
                if (userNumber > 2 && userNumber < 12) {
                    switch (printDice) {
                        case 1 -> {
                            System.out.println("""
                                    -----------
                                    |         |
                                    |    #    |
                                    |         |
                                    -----------
                                    """);
                        }
                        case 2 -> {
                            System.out.println("""
                                    -----------
                                    | #       |
                                    |         |
                                    |        #|
                                    -----------
                                    """);
                        }
                        case 3 -> {
                            System.out.println("""
                                    -----------
                                    |    #    |
                                    |         |
                                    | #     # |
                                    -----------
                                    """);
                        }
                        case 4 -> {
                            System.out.println("""
                                    -----------
                                    | #     # |
                                    |         |
                                    | #     # |
                                    -----------
                                    """);
                        }
                        case 5 -> {
                            System.out.println("""
                                    -----------
                                    | #     # |
                                    |    #    |
                                    | #     # |
                                    -----------
                                    """);
                        }
                        case 6 -> {
                            System.out.println("""
                                    -----------
                                    | #     # |
                                    | #     # |
                                    | #     # |
                                    -----------
                                    """);
                        }

                    }

                }
                else {
                    System.out.println("Predict amount of points (2...12)!!!");
                }
            }
            int i = Integer.parseInt(numberRoll.trim());
            int firstRoll = i / 10;
            int secondRoll = i % 10;
            int summaRolls = firstRoll + secondRoll;
            System.out.println("On the dice fell " + summaRolls + " points");
            int summaOfFormula = summaRolls - Math.abs(summaRolls - userNumber) * 2;
            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + userNumber + ")" + "*2: " + summaOfFormula);

            if (summaOfFormula>0){
                System.out.println("Your win!");
            }
            else {
                System.err.println("Your lose!");
                break;
            }

        }

    }
}
