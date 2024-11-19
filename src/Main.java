import Logic.BonusStage;
import Logic.Stage3;
import Logic.Stage4;

import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.ClassInfo.clear;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---     Start game     ---");
        do {
            clearConsole();
            System.out.println("Do you want to play one more time (Y/N): ");
            String oneMore = new Scanner(System.in).nextLine();
            if (!oneMore.equals("y") && !oneMore.equals("n")) {
                System.out.println("Write the symbols (Y/N)!!!");
                System.out.println("Do you play one more time (Y/N): ");
                oneMore = new Scanner(System.in).nextLine();
            }
            if (oneMore.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.println("Reboot the game!!\n");
            }
        } while (true);

    }

    private static void clearConsole() {
        BonusStage bonusStage = new BonusStage();
        bonusStage.bonusStage();
    }

}