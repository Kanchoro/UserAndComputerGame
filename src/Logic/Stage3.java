package Logic;

import java.util.Random;
import java.util.Scanner;

public class Stage3 {
    public void stage3(){
        int predict = 0;
        int dice= 0;
        int summaOfUser = 0;

        int allSummaUser =0;

        int predictComputer = 0;
        int diceComputer= 0;
        int summaOfComputer = 0;

        int allSummaComputer=0;

        int round = 1;
        int s=0;
        String table = "";
        while (s<3) {
            int a = 1;
             predict = 0;
             dice= 0;
             summaOfUser = 0;
            for (int j = 0; j < a; j++) {

                int rollTheDice = 2;
                String numberRoll = "";
                Scanner scanner = new Scanner(System.in);
                System.out.print("Predict amount of points (2...12): ");
                int userNumber = scanner.nextInt();
                predict+=userNumber;
                System.out.println("User rolls the dices: ...");
                for (int i = 0; i < rollTheDice; i++) {
                    if (userNumber > 2 && userNumber < 12) {
                        int printDice = new Random().nextInt(6) + 1;
                        numberRoll += String.valueOf(printDice);
                        rolls(printDice);
                    }
                    else {
                        System.out.println("Predict amount of points (2...12)!!!");
                        break;
                    }
                }
                int i = Integer.parseInt(numberRoll.trim());
                int firstRoll = i / 10;
                int secondRoll = i % 10;
                int summaRolls = firstRoll + secondRoll;
                dice+=summaRolls;
                int y = userNumber;
                System.out.println("On the dice fell " + summaRolls + " points");
                int x = summaRolls;
                int summaOfFormula = x - Math.abs(x - y) * 2;
                summaOfUser += summaOfFormula;
                allSummaUser+=summaOfFormula;
                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

            }

            System.out.println("----------------------------");
            //COMPUTER!

            int b = 1;
             predictComputer = 0;
             diceComputer= 0;
             summaOfComputer = 0;

            for (int j = 0; j < b; j++) {
                int rollTheDice = 2;
                String numberRoll = "";
                int computerNumber = new Random().nextInt(1, 12) + 1;
                predictComputer+=computerNumber;
                System.out.println("Computer predicted " + computerNumber + " points.");
                System.out.println("Computer rolls the dices: ...");
                for (int i = 0; i < rollTheDice; i++) {
                    int printDice = new Random().nextInt(6) + 1;
                    numberRoll += String.valueOf(printDice);
                    rolls(printDice);
                }
                int i = Integer.parseInt(numberRoll.trim());
                int firstRoll = i / 10;
                int secondRoll = i % 10;
                int summaRolls = firstRoll + secondRoll;
                diceComputer+=summaRolls;
                int y = computerNumber;
                System.out.println("On the dice fell " + summaRolls + " points");
                int x = summaRolls;
                int summaOfFormula = x - Math.abs(x - y) * 2;
                summaOfComputer += summaOfFormula;
                allSummaComputer+=summaOfFormula;
                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

            }

            System.out.println("--------- Current score ---------");
            System.out.println("User: "+summaOfUser+" points");
            System.out.println("Computer: "+summaOfComputer+" points");
            if (summaOfUser > summaOfComputer) {
                int moreSumma = summaOfUser - summaOfComputer;
                System.out.println("User is ahead by " + moreSumma + " points!");
            } else if (summaOfUser < summaOfComputer) {
                int moreSumma = summaOfComputer - summaOfUser;
                System.out.println("Computer is ahead by " + moreSumma + " points!");
            }
            System.out.println("------------------------------------------------");
            table+=String.format("""
                    -------+-------------+--------------
                           |Predicted: % d|Predicted: % d
                     - %d -|Dice     : % d|Dice     : % d
                           |Result   : % d|result   : % d
                    """,predict,predictComputer,round,dice,diceComputer,summaOfUser,summaOfComputer);
            s++;
            round++;

        }
        System.out.println("""
                 
                 ----------- Finish  game ------------
                
                  Round |  User        | Computer
                """);
        System.out.println(table);
        System.out.printf("""
                -------+-------------+--------------
                 Total |%d           | %d
                """,allSummaUser,allSummaComputer);
        if (allSummaUser>allSummaComputer){
            int summa = allSummaUser-allSummaComputer;
            System.out.println("User win "+summa+" points more.");
            System.out.println("Congratulation!");
            System.err.println("Computer lose!!!");
        }
        else {
            int summa=allSummaComputer-allSummaUser;
            System.out.println("Computer win "+summa+" points more.");
            System.out.println("Congratulation!");
            System.err.println("User lose!!!");
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
