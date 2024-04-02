package symbolsPhases;

import utility.PrintSeparator;

import java.util.Scanner;


public class PlayersSymbols {
    public static char[] settingPlayersSymbols() {
        Scanner myScanner = new Scanner(System.in);
        String firstUsersSymbol;
        String secondUsersSymbol;

        System.out.println("\n\n----------------------- SETTING PLAYER SYMBOLS -----------------------");
        PrintSeparator.separator();

        // setting a first player symbol
        System.out.println("----------------- SETTING A PLAYING SYMBOL FOR THE FIRST PLAYER. ----------------------");
        System.out.println("\tPlease enter only one character or symbol from the keyboard, " +
                "\nand it will be assigned as your playing symbol.");
        while (true) {
            firstUsersSymbol = myScanner.nextLine();
            if (firstUsersSymbol.length() != 1) {
                System.out.println("\n\tPlease enter only one character or symbol!");
                System.out.println("\tTry again.");
            } else {
                break;
            }
        }

        // setting a second player symbol
        System.out.println();
        PrintSeparator.separator();
        System.out.println("----------------- SETTING A PLAYING SYMBOL FOR THE SECOND PLAYER. ---------------------");
        System.out.println("\tPlease enter only one character or symbol from the keyboard, " +
                "\nand it will be assigned as your playing symbol.");
        while (true) {
            secondUsersSymbol = myScanner.nextLine();
            if (firstUsersSymbol.equals(secondUsersSymbol)) {
                System.out.println("\n\t! Please enter a different character or symbol than the first player entered. !");
                System.out.println("\tTry again.");
            } else if (secondUsersSymbol.length() != 1) {
                System.out.println("\n\tPlease enter only one character or symbol!");
                System.out.println("\tTry again.");
            } else {
                break;
            }
        }

        System.out.println();
        PrintSeparator.separator();
        System.out.println("Alright, so we have the playing symbols of the players.");
        System.out.println("\tFirst player's playing symbol: " + firstUsersSymbol);
        System.out.println("\tSecond player's playing symbol: " + secondUsersSymbol + "\n");

        char firstSymbol = firstUsersSymbol.charAt(0);
        char secondSymbol = secondUsersSymbol.charAt(0);
        return new char[]{firstSymbol, secondSymbol};
    }
}
