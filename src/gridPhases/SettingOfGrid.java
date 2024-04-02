package gridPhases;

import utility.PrintSeparator;

import java.util.Scanner;


public class SettingOfGrid {
    public static int[] initializeGrid() {
        System.out.println("\n\n--------------- INITIAL SETTINGS OF A GRID BEFORE THE DUEL ---------------");
        PrintSeparator.separator();
        System.out.println("\tFirst, choose how the playing field will look." +
                "\n\tThe standard playing field in the tic-tac-toe game looks like this - " +
                "\nit consists of 3 rows and 3 columns.\n");

        int[] numberOfRowsColumns = new int[2];
        Scanner myScanner = new Scanner(System.in);
        int userRows;
        int userColumns;

        PrintSeparator.separator();
        System.out.println("\tAll right, let's begin with the number of rows, and then the number of columns.");
        System.out.println("\tFor the gaming experience, we recommend staying within the range of 3 to 5 rows, " +
                "\nand the same goes for columns.");
        PrintSeparator.separator();
        System.out.println("\t!The number of rows and columns must be the same!");

        // initialize rows
        System.out.println();
        PrintSeparator.separator();
        System.out.println("--------------- 1. PLEASE INPUT THE NUMBER OF ROWS. ---------------");
        while (true) {
            try {
                userRows = myScanner.nextInt();
                if (userRows > 5 || userRows < 3) {
                    System.out.println("\n\tUse only numbers between 3 and 5, inclusive!");
                    System.out.println("\tTry again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\tWrite only integer number!");
                System.out.println("\tTry again.");
                myScanner.nextLine();
            }
        }

        // initialize columns
        System.out.println();
        PrintSeparator.separator();
        System.out.println("--------------- 2. PLEASE INPUT THE NUMBER OF COLUMNS. ---------------");
        while (true) {
            try {
                userColumns = myScanner.nextInt();
                if (userColumns != userRows) {
                    System.out.println("\n\tThe number of columns must match the number of rows! (" + userRows + ")");
                    System.out.println("\tTry again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\tWrite only integer number!");
                System.out.println("\tTry again.");
                myScanner.nextLine();
            }
        }

        numberOfRowsColumns[0] = userRows;
        numberOfRowsColumns[1] = userColumns;
        return numberOfRowsColumns;
    }
}
