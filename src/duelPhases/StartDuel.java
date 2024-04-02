package duelPhases;

import utility.PrintSeparator;
import gridPhases.PlottingGrid;

import java.util.Scanner;


public class StartDuel {
    public static char[][] playingTheGame(char[][] emptyGrid, char[] usersSymbols) {
        // create current grid from empty grid --->
        char[][] currentGrid = new char[emptyGrid.length][emptyGrid[0].length];
        for (int i = 0; i < emptyGrid.length; i++) {
            for (int j = 0; j < emptyGrid[i].length; j++) {
                currentGrid[i][j] = emptyGrid[i][j];
            }
        }

        // display of the empty playing field - grid
        PlottingGrid.displayingGrid(emptyGrid);
        // players symbols
        char firstPlayersSymbol = usersSymbols[0];
        char secondPlayersSymbol = usersSymbols[1];

        // the number of options to input/insert symbols
        int number_of_options = currentGrid.length * currentGrid[0].length;

        Scanner myScanner = new Scanner(System.in);
        int firstUsersRowPosition = 0;
        int firstUsersColumnPosition = 0;
        int secondUsersRowPosition = 0;
        int secondUsersColumnPosition = 0;

        System.out.println("\n------------------------- PLAY THE GAME -------------------------");
        PrintSeparator.separator();
        while (number_of_options > 0) {

            // --------------------------- First player chooses a position
            System.out.print("------------ Player number ONE chooses a position for their '"
                    + firstPlayersSymbol + "' symbol --->");
            while (true) {
                // First player row position
                if (firstUsersRowPosition == 0) {
                    System.out.println("\n--- (Player One) Please select a ROW position number:");
                    try {
                        firstUsersRowPosition = myScanner.nextInt();
                        if (firstUsersRowPosition < 1 || firstUsersRowPosition > currentGrid.length) {
                            System.out.println("\tRow is out of range! Try again.");
                            firstUsersRowPosition = 0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("\tWrite only integer number! Try again.");
                        myScanner.nextLine();
                        continue;
                    }
                }
                // First player column position
                if (firstUsersColumnPosition == 0) {
                    System.out.println("\n--- (Player One) Please select a COLUMN position number:");
                    try {
                        firstUsersColumnPosition = myScanner.nextInt();
                        if (firstUsersColumnPosition < 1 || firstUsersColumnPosition > currentGrid[0].length) {
                            System.out.println("\tColumn is out of range! Try again.");
                            firstUsersColumnPosition = 0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("\tWrite only integer number! Try again.");
                        myScanner.nextLine();
                        continue;
                    }
                }
                // Are the First player's row and column not empty?
                if (firstUsersRowPosition != 0 && firstUsersColumnPosition != 0) {
                    if (currentGrid[firstUsersRowPosition - 1][firstUsersColumnPosition - 1] == firstPlayersSymbol) {
                        System.out.println("\t! Try another position, your symbol is already in this one. !");
                        firstUsersRowPosition = 0;
                        firstUsersColumnPosition = 0;
                    } else if (currentGrid[firstUsersRowPosition - 1][firstUsersColumnPosition - 1] == secondPlayersSymbol) {
                        System.out.println("\t! Try another position, your opponent's symbol is already in this one. !");
                        firstUsersRowPosition = 0;
                        firstUsersColumnPosition = 0;
                    } else {
                        currentGrid[firstUsersRowPosition - 1][firstUsersColumnPosition - 1] = firstPlayersSymbol;
                        firstUsersRowPosition = 0;
                        firstUsersColumnPosition = 0;
                        break;
                    }
                }
            }

            // display of the current playing field - grid
            PlottingGrid.displayingGrid(currentGrid);
            // decrease of symbol input/inserts options.
            number_of_options--;
            if (number_of_options == 0) {
                break;
            }

            // --------------------------- Second player chooses a position
            System.out.print("\n------------ Player number TWO chooses a position for their '"
                    + secondPlayersSymbol + "' symbol --->");
            while (true) {
                // Second player row position
                if (secondUsersRowPosition == 0) {
                    System.out.println("\n--- (Player Two) Please select a ROW position number:");
                    try {
                        secondUsersRowPosition = myScanner.nextInt();
                        if (secondUsersRowPosition < 1 || secondUsersRowPosition > currentGrid.length) {
                            System.out.println("\tRow is out of range! Try again.");
                            secondUsersRowPosition = 0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("\tWrite only integer number! Try again.");
                        myScanner.nextLine();
                        continue;
                    }
                }
                // Second player column position
                if (secondUsersColumnPosition == 0) {
                    System.out.println("\n--- (Player Two) Please select a COLUMN position number:");
                    try {
                        secondUsersColumnPosition = myScanner.nextInt();
                        if (secondUsersColumnPosition < 1 || secondUsersColumnPosition > currentGrid[0].length) {
                            System.out.println("\tColumn is out of range! Try again.");
                            secondUsersColumnPosition = 0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("\tWrite only integer number! Try again.");
                        myScanner.nextLine();
                        continue;
                    }
                }
                // Are the Second player's row and column not empty?
                if (secondUsersRowPosition != 0 && secondUsersColumnPosition != 0) {
                    if (currentGrid[secondUsersRowPosition - 1][secondUsersColumnPosition - 1] == secondPlayersSymbol) {
                        System.out.println("\t! Try another position, your symbol is already in this one. !");
                        System.out.println("Try another.");
                        secondUsersRowPosition = 0;
                        secondUsersColumnPosition = 0;
                    } else if (currentGrid[secondUsersRowPosition - 1][secondUsersColumnPosition - 1] == firstPlayersSymbol) {
                        System.out.println("\t! Try another position, your opponent's symbol is already in this one. !");
                        secondUsersRowPosition = 0;
                        secondUsersColumnPosition = 0;
                    } else {
                        currentGrid[secondUsersRowPosition - 1][secondUsersColumnPosition - 1] = secondPlayersSymbol;
                        secondUsersRowPosition = 0;
                        secondUsersColumnPosition = 0;
                        break;
                    }
                }
            }

            // decrease of symbol input/inserts options.
            number_of_options--;
            // display of the current playing field - grid
            PlottingGrid.displayingGrid(currentGrid);
            System.out.println();
        }

        return currentGrid;
    }
}
