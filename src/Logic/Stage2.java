package Logic;

import java.util.Random;
import java.util.Scanner;

public class Stage2 {
    public  void computerAndUserGame() {
            int a = 1;
            int summaOfUser = 0;
            for (int j = 0; j < a; j++) {

                int rollTheDice = 2;
                String numberRoll = "";
                Scanner scanner = new Scanner(System.in);
                System.out.print("Predict amount of points (2...12): ");
                int userNumber = scanner.nextInt();
                System.out.println("User rolls the dices: ...");
                for (int i = 0; i < rollTheDice; i++) {
                    if (userNumber > 2 && userNumber < 12) {
                        int printDice = new Random().nextInt(6) + 1;
                        numberRoll += String.valueOf(printDice);
                        rolls(printDice);
                    }
                }
                int i = Integer.parseInt(numberRoll.trim());
                int firstRoll = i / 10;
                int secondRoll = i % 10;
                int summaRolls = firstRoll + secondRoll;
                int y = userNumber;
                System.out.println("On the dice fell " + summaRolls + " points");
                int x = summaRolls;
                int summaOfFormula = x - Math.abs(x - y) * 2;
                summaOfUser += summaOfFormula;
                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
            }

            System.out.println("----------------------------");
            //COMPUTER!

            int b = 1;
            int summaOfComputer = 0;
            for (int j = 0; j < b; j++) {
                int rollTheDice = 2;
                String numberRoll = "";
                int computerNumber = new Random().nextInt(1, 12) + 1;
                System.out.println("Computer predicted " + computerNumber + " points.");
                System.out.println("User rolls the dices: ...");
                for (int i = 0; i < rollTheDice; i++) {
                    int printDice = new Random().nextInt(6) + 1;
                    numberRoll += String.valueOf(printDice);
                        rolls(printDice);
                }
                int i = Integer.parseInt(numberRoll.trim());
                int firstRoll = i / 10;
                int secondRoll = i % 10;
                int summaRolls = firstRoll + secondRoll;
                int y = computerNumber;
                System.out.println("On the dice fell " + summaRolls + " points");
                int x = summaRolls;
                int summaOfFormula = x - Math.abs(x - y) * 2;
                summaOfComputer += summaOfFormula;
                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
            }



            if (summaOfUser > summaOfComputer) {
                int moreSumma = summaOfUser - summaOfComputer;
                System.out.println("User win " + moreSumma + " points more.");
                System.out.println("Congratulations!");
            } else if (summaOfUser < summaOfComputer) {
                int moreSumma = summaOfComputer - summaOfUser;
                System.out.println("Computer win " + moreSumma + " points more.");
                System.out.println("Congratulations!");

            }

    }

   public void rolls(int printDice){
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

}