package Logic;

import java.util.Random;
import java.util.Scanner;

public class Stage4 {
    public void stage4() {
        int predict = 0;
        int dice = 0;
        int summaOfUser = 0;

        int allSummaUser = 0;

        int predictComputer = 0;
        int diceComputer = 0;
        int summaOfComputer = 0;

        int allSummaComputer = 0;

        int secondRoll1 = 0;

        int penalty = 0;
        int summaPenalty = 0;

        int penaltyComputer = 0;
        int penaltySummaOfComputer = 0;

        int round = 1;
        int s = 0;
        String table = "";
        while (s < 3) {
            int a = 1;
            penalty = 0;
            predict = 0;
            dice = 0;
            summaOfUser = 0;
            for (int j = 0; j < a; j++) {

                int rollTheDice = 2;
                String numberRoll = "";
                Scanner scanner = new Scanner(System.in);
                System.out.print("Predict amount of points (2...12): ");
                int userNumber = scanner.nextInt();
                if (userNumber > 2 && userNumber < 12) {
                    predict += userNumber;
                    System.out.print("Do you want to cheat? (Y/N): ");
                    String symbol = new Scanner(System.in).nextLine();
                    if (s == 0) {
                        if (symbol.equalsIgnoreCase("Y")) {
                            int tur1 = new Random().nextInt(2) + 1;
                            if (tur1 == 1) {
                                System.out.println("Successfully cheated!");
                                System.out.println("User rolls the dices: ...");
                                for (int i = 0; i < rollTheDice; i++) {
                                    if (i == 0) {
                                        int printDice = new Random().nextInt(userNumber / 2) + 1;
                                        secondRoll1 += printDice;
                                        numberRoll += String.valueOf(printDice);
                                        rolls(printDice);
                                    } else {
                                        int secondRoll2 = userNumber - secondRoll1;
                                        numberRoll += String.valueOf(secondRoll2);
                                        rolls(secondRoll2);
                                    }
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                            } else {
                                System.out.println("Invalid cheat!!!");
                                System.out.println("User rolls the dices: ...");
                                penalty += 10;
                                summaPenalty += 10;
                                for (int i = 0; i < rollTheDice; i++) {
                                    int printDice = new Random().nextInt(6) + 1;
                                    numberRoll += String.valueOf(printDice);
                                    rolls(printDice);
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                            }

                        } else {
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
                            dice += summaRolls;
                            int y = userNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfUser += summaOfFormula;
                            allSummaUser += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                        }
                    } else if (s == 1) {
                        if (symbol.equalsIgnoreCase("Y")) {
                            int tur1 = new Random().nextInt(4) + 1;
                            if (tur1 == 1) {
                                System.out.println("Successfully cheated!");
                                System.out.println("User rolls the dices: ...");
                                for (int i = 0; i < rollTheDice; i++) {
                                    if (i == 0) {
                                        int printDice = new Random().nextInt(userNumber / 2) + 1;
                                        secondRoll1 += printDice;
                                        numberRoll += String.valueOf(printDice);
                                        rolls(printDice);
                                    } else {
                                        int secondRoll2 = userNumber - secondRoll1;
                                        numberRoll += String.valueOf(secondRoll2);
                                        rolls(secondRoll2);
                                    }
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                            } else {
                                System.out.println("Invalid cheat!!!");
                                System.out.println("User rolls the dices: ...");
                                penalty += 10;
                                summaPenalty += 10;
                                for (int i = 0; i < rollTheDice; i++) {
                                    int printDice = new Random().nextInt(6) + 1;
                                    numberRoll += String.valueOf(printDice);
                                    rolls(printDice);
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                            }

                        } else {
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
                            dice += summaRolls;
                            int y = userNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfUser += summaOfFormula;
                            allSummaUser += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                        }
                    } else if (s == 2) {
                        if (symbol.equalsIgnoreCase("Y")) {
                            int tur1 = new Random().nextInt(6) + 1;
                            if (tur1 == 1) {
                                System.out.println("Successfully cheated!");
                                System.out.println("User rolls the dices: ...");
                                for (int i = 0; i < rollTheDice; i++) {
                                    if (i == 0) {
                                        int printDice = new Random().nextInt(userNumber / 2) + 1;
                                        secondRoll1 += printDice;
                                        numberRoll += String.valueOf(printDice);
                                        rolls(printDice);
                                    } else {
                                        int secondRoll2 = userNumber - secondRoll1;
                                        numberRoll += String.valueOf(secondRoll2);
                                        rolls(secondRoll2);
                                    }
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                            } else {
                                System.out.println("Invalid cheat!!!");
                                System.out.println("User rolls the dices: ...");
                                penalty += 10;
                                summaPenalty += 10;
                                for (int i = 0; i < rollTheDice; i++) {
                                    int printDice = new Random().nextInt(6) + 1;
                                    numberRoll += String.valueOf(printDice);
                                    rolls(printDice);
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = userNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfUser += summaOfFormula;
                                allSummaUser += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                            }

                        } else {
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
                            dice += summaRolls;
                            int y = userNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfUser += summaOfFormula;
                            allSummaUser += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                        }
                    }
                } else {
                    System.out.println("Write the points (2...12)!!!");
                    return;
                }


            }

            System.out.println("""
                    ----------------------------
                    =====  COMPUTER!  =====
                    
                    """);


            //COMPUTER!

            int secondNumber = 0;
            int b = 1;
            predictComputer = 0;
            diceComputer = 0;
            summaOfComputer = 0;
            penaltyComputer = 0;

            for (int j = 0; j < b; j++) {
                String yeas = "";
                String no = "";
                int rollTheDice = 2;
                String numberRoll = "";
                int computerNumber = new Random().nextInt(1, 12) + 1;
                predictComputer += computerNumber;
                System.out.println("Computer predicted " + computerNumber + " points.");
                System.out.println("Do you want cheat?(Y/N)");
                int symbol = new Random().nextInt(2) + 1;
                if (symbol == 1) {
                    yeas += symbol;
                } else {
                    no += symbol;
                }
                if (s == 0) {
                    if (yeas.equalsIgnoreCase("1")) {
                        System.out.println("Y");
                        int cheat = new Random().nextInt(2) + 1;
                        if (cheat == 1) {
                            System.out.println("Successfully cheated!");
                            System.out.println("Computer rolls the dices: ...");
                            for (int i = 0; i < rollTheDice; i++) {
                                if (i == 0) {
                                    int printDice = new Random().nextInt(computerNumber / 2) + 1;
                                    secondNumber += printDice;
                                    numberRoll += String.valueOf(printDice);
                                    rolls(printDice);
                                } else {
                                    int secondRoll = computerNumber - secondNumber;
                                    numberRoll += String.valueOf(secondRoll);
                                    rolls(secondRoll);

                                }
                            }
                            int i = Integer.parseInt(numberRoll.trim());
                            int firstRoll = i / 10;
                            int secondRoll = i % 10;
                            int summaRolls = firstRoll + secondRoll;
                            diceComputer += summaRolls;
                            int y = computerNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfComputer += summaOfFormula;
                            allSummaComputer += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                        } else {
                            System.out.println("Invalid cheat!!!");
                            System.out.println("User rolls the dices: ...");
                            penaltyComputer += 10;
                            penaltySummaOfComputer += 10;
                            for (int i = 0; i < rollTheDice; i++) {
                                int printDice = new Random().nextInt(6) + 1;
                                numberRoll += String.valueOf(printDice);
                                rolls(printDice);
                            }
                            int i = Integer.parseInt(numberRoll.trim());
                            int firstRoll = i / 10;
                            int secondRoll = i % 10;
                            int summaRolls = firstRoll + secondRoll;
                            dice += summaRolls;
                            int y = computerNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfComputer += summaOfFormula;
                            allSummaComputer += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                        }
                    } else {
                        System.out.println("N");
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
                        diceComputer += summaRolls;
                        int y = computerNumber;
                        System.out.println("On the dice fell " + summaRolls + " points");
                        int x = summaRolls;
                        int summaOfFormula = x - Math.abs(x - y) * 2;
                        summaOfComputer += summaOfFormula;
                        allSummaComputer += summaOfFormula;
                        System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                    }
                } else if (s == 1 || s == 2) {
                    if (summaOfUser > summaOfComputer) {
                        int moreSummaU = summaOfUser - summaOfComputer;
                        if (moreSummaU > 5) {
                            if (moreSummaU > 15) {
                                if (yeas.equalsIgnoreCase("1")) {
                                    System.out.println("Y");
                                    int cheat = new Random().nextInt(5) + 1;
                                    if (cheat == 1 || cheat == 2 || cheat == 3) {
                                        System.out.println("Computer successfully cheated!");
                                        System.out.println("Computer rolls the dices: ...");
                                        for (int i = 0; i < rollTheDice; i++) {
                                            if (i == 0) {
                                                int printDice = new Random().nextInt(computerNumber / 2) + 1;
                                                secondNumber += printDice;
                                                numberRoll += String.valueOf(printDice);
                                                rolls(printDice);
                                            } else {
                                                int secondRoll = computerNumber - secondNumber;
                                                numberRoll += String.valueOf(secondRoll);
                                                rolls(secondRoll);

                                            }
                                        }
                                        int i = Integer.parseInt(numberRoll.trim());
                                        int firstRoll = i / 10;
                                        int secondRoll = i % 10;
                                        int summaRolls = firstRoll + secondRoll;
                                        diceComputer += summaRolls;
                                        int y = computerNumber;
                                        System.out.println("On the dice fell " + summaRolls + " points");
                                        int x = summaRolls;
                                        int summaOfFormula = x - Math.abs(x - y) * 2;
                                        summaOfComputer += summaOfFormula;
                                        allSummaComputer += summaOfFormula;
                                        System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                                    } else {
                                        System.out.println("Invalid cheat!!!");
                                        System.out.println("User rolls the dices: ...");
                                        penaltyComputer += 10;
                                        penaltySummaOfComputer += 10;
                                        for (int i = 0; i < rollTheDice; i++) {
                                            int printDice = new Random().nextInt(6) + 1;
                                            numberRoll += String.valueOf(printDice);
                                            rolls(printDice);
                                        }
                                        int i = Integer.parseInt(numberRoll.trim());
                                        int firstRoll = i / 10;
                                        int secondRoll = i % 10;
                                        int summaRolls = firstRoll + secondRoll;
                                        dice += summaRolls;
                                        int y = computerNumber;
                                        System.out.println("On the dice fell " + summaRolls + " points");
                                        int x = summaRolls;
                                        int summaOfFormula = x - Math.abs(x - y) * 2;
                                        summaOfComputer += summaOfFormula;
                                        allSummaComputer += summaOfFormula;
                                        System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                                    }
                                } else {
                                    System.out.println("N");
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
                                    diceComputer += summaRolls;
                                    int y = computerNumber;
                                    System.out.println("On the dice fell " + summaRolls + " points");
                                    int x = summaRolls;
                                    int summaOfFormula = x - Math.abs(x - y) * 2;
                                    summaOfComputer += summaOfFormula;
                                    allSummaComputer += summaOfFormula;
                                    System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                                }
                            } else {
                                if (yeas.equalsIgnoreCase("1")) {
                                    System.out.println("Y");
                                    int cheat = new Random().nextInt(5) + 1;
                                    if (cheat == 1 || cheat == 2) {
                                        System.out.println("Computer successfully cheated!");
                                        System.out.println("Computer rolls the dices: ...");
                                        for (int i = 0; i < rollTheDice; i++) {
                                            if (i == 0) {
                                                int printDice = new Random().nextInt(computerNumber / 2) + 1;
                                                secondNumber += printDice;
                                                numberRoll += String.valueOf(printDice);
                                                rolls(printDice);
                                            } else {
                                                int secondRoll = computerNumber - secondNumber;
                                                numberRoll += String.valueOf(secondRoll);
                                                rolls(secondRoll);

                                            }
                                        }
                                        int i = Integer.parseInt(numberRoll.trim());
                                        int firstRoll = i / 10;
                                        int secondRoll = i % 10;
                                        int summaRolls = firstRoll + secondRoll;
                                        diceComputer += summaRolls;
                                        int y = computerNumber;
                                        System.out.println("On the dice fell " + summaRolls + " points");
                                        int x = summaRolls;
                                        int summaOfFormula = x - Math.abs(x - y) * 2;
                                        summaOfComputer += summaOfFormula;
                                        allSummaComputer += summaOfFormula;
                                        System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                                    } else {
                                        System.out.println("Invalid cheat!!!");
                                        System.out.println("User rolls the dices: ...");
                                        penaltyComputer += 10;
                                        penaltySummaOfComputer += 10;
                                        for (int i = 0; i < rollTheDice; i++) {
                                            int printDice = new Random().nextInt(6) + 1;
                                            numberRoll += String.valueOf(printDice);
                                            rolls(printDice);
                                        }
                                        int i = Integer.parseInt(numberRoll.trim());
                                        int firstRoll = i / 10;
                                        int secondRoll = i % 10;
                                        int summaRolls = firstRoll + secondRoll;
                                        dice += summaRolls;
                                        int y = computerNumber;
                                        System.out.println("On the dice fell " + summaRolls + " points");
                                        int x = summaRolls;
                                        int summaOfFormula = x - Math.abs(x - y) * 2;
                                        summaOfComputer += summaOfFormula;
                                        allSummaComputer += summaOfFormula;
                                        System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                                    }
                                } else {
                                    System.out.println("N");
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
                                    diceComputer += summaRolls;
                                    int y = computerNumber;
                                    System.out.println("On the dice fell " + summaRolls + " points");
                                    int x = summaRolls;
                                    int summaOfFormula = x - Math.abs(x - y) * 2;
                                    summaOfComputer += summaOfFormula;
                                    allSummaComputer += summaOfFormula;
                                    System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                                }
                            }
                        } else {
                            if (yeas.equalsIgnoreCase("1")) {
                                System.out.println("Y");
                                int cheat = new Random().nextInt(5) + 1;
                                if (cheat == 1) {
                                    System.out.println("Computer successfully cheated!");
                                    System.out.println("Computer rolls the dices: ...");
                                    for (int i = 0; i < rollTheDice; i++) {
                                        if (i == 0) {
                                            int printDice = new Random().nextInt(computerNumber / 2) + 1;
                                            secondNumber += printDice;
                                            numberRoll += String.valueOf(printDice);
                                            rolls(printDice);
                                        } else {
                                            int secondRoll = computerNumber - secondNumber;
                                            numberRoll += String.valueOf(secondRoll);
                                            rolls(secondRoll);

                                        }
                                    }
                                    int i = Integer.parseInt(numberRoll.trim());
                                    int firstRoll = i / 10;
                                    int secondRoll = i % 10;
                                    int summaRolls = firstRoll + secondRoll;
                                    diceComputer += summaRolls;
                                    int y = computerNumber;
                                    System.out.println("On the dice fell " + summaRolls + " points");
                                    int x = summaRolls;
                                    int summaOfFormula = x - Math.abs(x - y) * 2;
                                    summaOfComputer += summaOfFormula;
                                    allSummaComputer += summaOfFormula;
                                    System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                                } else {
                                    System.out.println("Invalid cheat!!!");
                                    System.out.println("User rolls the dices: ...");
                                    penaltyComputer += 10;
                                    penaltySummaOfComputer += 10;
                                    for (int i = 0; i < rollTheDice; i++) {
                                        int printDice = new Random().nextInt(6) + 1;
                                        numberRoll += String.valueOf(printDice);
                                        rolls(printDice);
                                    }
                                    int i = Integer.parseInt(numberRoll.trim());
                                    int firstRoll = i / 10;
                                    int secondRoll = i % 10;
                                    int summaRolls = firstRoll + secondRoll;
                                    dice += summaRolls;
                                    int y = computerNumber;
                                    System.out.println("On the dice fell " + summaRolls + " points");
                                    int x = summaRolls;
                                    int summaOfFormula = x - Math.abs(x - y) * 2;
                                    summaOfComputer += summaOfFormula;
                                    allSummaComputer += summaOfFormula;
                                    System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                                }
                            } else {
                                System.out.println("N");
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
                                diceComputer += summaRolls;
                                int y = computerNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfComputer += summaOfFormula;
                                allSummaComputer += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                            }
                        }
                    } else if (summaOfUser < summaOfComputer) {
                        if (yeas.equalsIgnoreCase("1")) {
                            System.out.println("Y");
                            int cheat = new Random().nextInt(5) + 1;
                            if (cheat == 1 || cheat == 2 || cheat == 3) {
                                System.out.println("Computer successfully cheated!");
                                System.out.println("Computer rolls the dices: ...");
                                for (int i = 0; i < rollTheDice; i++) {
                                    if (i == 0) {
                                        int printDice = new Random().nextInt(computerNumber / 2) + 1;
                                        secondNumber += printDice;
                                        numberRoll += String.valueOf(printDice);
                                        rolls(printDice);
                                    } else {
                                        int secondRoll = computerNumber - secondNumber;
                                        numberRoll += String.valueOf(secondRoll);
                                        rolls(secondRoll);

                                    }
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                diceComputer += summaRolls;
                                int y = computerNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfComputer += summaOfFormula;
                                allSummaComputer += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);
                            } else {
                                System.out.println("Invalid cheat!!!");
                                System.out.println("User rolls the dices: ...");
                                penaltyComputer += 10;
                                penaltySummaOfComputer += 10;
                                for (int i = 0; i < rollTheDice; i++) {
                                    int printDice = new Random().nextInt(6) + 1;
                                    numberRoll += String.valueOf(printDice);
                                    rolls(printDice);
                                }
                                int i = Integer.parseInt(numberRoll.trim());
                                int firstRoll = i / 10;
                                int secondRoll = i % 10;
                                int summaRolls = firstRoll + secondRoll;
                                dice += summaRolls;
                                int y = computerNumber;
                                System.out.println("On the dice fell " + summaRolls + " points");
                                int x = summaRolls;
                                int summaOfFormula = x - Math.abs(x - y) * 2;
                                summaOfComputer += summaOfFormula;
                                allSummaComputer += summaOfFormula;
                                System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                            }
                        } else {
                            System.out.println("N");
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
                            diceComputer += summaRolls;
                            int y = computerNumber;
                            System.out.println("On the dice fell " + summaRolls + " points");
                            int x = summaRolls;
                            int summaOfFormula = x - Math.abs(x - y) * 2;
                            summaOfComputer += summaOfFormula;
                            allSummaComputer += summaOfFormula;
                            System.out.println("Result is " + summaRolls + "-abs(" + summaRolls + "-" + y + ")" + "*2: " + summaOfFormula);

                        }
                    }
                }
            }

            System.out.println("--------- Current score ---------");
            System.out.println("User: " + summaOfUser + " points");
            System.out.println("Computer: " + summaOfComputer + " points");
            if (summaOfUser > summaOfComputer) {
                int moreSumma = summaOfUser - summaOfComputer;
                System.out.println("User is ahead by " + moreSumma + " points!");
            } else if (summaOfUser < summaOfComputer) {
                int moreSumma = summaOfComputer - summaOfUser;
                System.out.println("Computer is ahead by " + moreSumma + " points!");
            }
            System.out.println("------------------------------------------------");
            table += String.format("""
                    -------+-------------+--------------
                           |Predicted: % d|Predicted: % d
                      - %d -|Dice     : % d|Dice     : % d
                           |Result   : % d|Result   : % d
                           |Penalty  : % d|Penalty  : % d
                    """, predict, predictComputer, round, dice, diceComputer, summaOfUser, summaOfComputer, penalty, penaltyComputer);
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
                 Total  |%d          | %d
                 Penalty| %d          | %d
                """, allSummaUser, allSummaComputer, summaPenalty, penaltySummaOfComputer);
        int allSumma=allSummaUser-summaPenalty;
        int allSummaComputer2=allSummaComputer-penaltySummaOfComputer;
        System.out.println(allSummaUser+"-"+summaPenalty+"="+allSumma);
        System.out.println(allSummaComputer+"-"+penaltySummaOfComputer+"="+allSummaComputer2);
        if (allSumma > allSummaComputer2) {
            int summa = allSumma - allSummaComputer2;
            System.out.println("User win " + summa + " points more.");
            System.out.println("Congratulation!");
            System.err.println("Computer lose!!!");
        } else {
            int summa = allSummaComputer2 - allSumma;
            System.out.println("Computer win " + summa + " points more.");
            System.out.println("Congratulation!");
            System.err.println("User lose!!!");
        }
    }

    public void rolls(int printDice) {
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

