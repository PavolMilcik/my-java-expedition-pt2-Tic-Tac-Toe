package duelPhases;

import utility.PrintSeparator;


public class ResultOfDuel {
    public static void duelResult(char[][] afterDuelGrid, char[] usersSymbols) {
        System.out.println("\n\n----------------------- THE DUEL/GAME RESULT -----------------------");
        PrintSeparator.separator();

        // players symbols
        char firstPlayersSymbol = usersSymbols[0];
        char secondPlayersSymbol = usersSymbols[1];
        // counting players symbols in row or column
        int countFirstPlayersSymbol = 0;
        int countSecondPlayersSymbol = 0;

        // the number of all wins of each player
        int firstPlayersAllWins = 0;
        int secondPlayersAllWins = 0;

        // the number of specific type of wins of each player
        int firstPlayersRowWins = 0;
        int firstPlayersColumnWins = 0;
        int firstPlayersDiagonalWins = 0;
        int secondPlayersRowWins = 0;
        int secondPlayersColumnWins = 0;
        int secondPlayersDiagonalWins = 0;

        // ----- row wins
        for (char[] row : afterDuelGrid) {
            for (char symbol : row) {
                if (symbol == firstPlayersSymbol) {
                    countFirstPlayersSymbol++;
                } else if (symbol == secondPlayersSymbol) {
                    countSecondPlayersSymbol++;
                }
            }
            if (countFirstPlayersSymbol == afterDuelGrid[0].length) {
                firstPlayersAllWins++;
                firstPlayersRowWins++;
            }
            if (countSecondPlayersSymbol == afterDuelGrid[0].length) {
                secondPlayersAllWins++;
                secondPlayersRowWins++;
            }
            countFirstPlayersSymbol = 0;
            countSecondPlayersSymbol = 0;
        }

        // ----- column wins
        for (int column = 0; column < afterDuelGrid.length; column++) {
            for (int row = 0; row < afterDuelGrid.length; row++) {
                if (afterDuelGrid[row][column] == firstPlayersSymbol) {
                    countFirstPlayersSymbol++;
                } else if (afterDuelGrid[row][column] == secondPlayersSymbol) {
                    countSecondPlayersSymbol++;
                }
            }
            if (countFirstPlayersSymbol == afterDuelGrid.length) {
                firstPlayersAllWins++;
                firstPlayersColumnWins++;
            }
            if (countSecondPlayersSymbol == afterDuelGrid.length) {
                secondPlayersAllWins++;
                secondPlayersColumnWins++;
            }
            countFirstPlayersSymbol = 0;
            countSecondPlayersSymbol = 0;
        }

        // ----- diagonal 'left to right' wins
        for (int row = 0; row < afterDuelGrid.length; row++) {
            int column = row;
            if (afterDuelGrid[row][column] == firstPlayersSymbol) {
                countFirstPlayersSymbol++;
            } else if (afterDuelGrid[row][column] == secondPlayersSymbol) {
                countSecondPlayersSymbol++;
            }
        }
        if (countFirstPlayersSymbol == afterDuelGrid.length) {
            firstPlayersAllWins++;
            firstPlayersDiagonalWins++;
        }
        if (countSecondPlayersSymbol == afterDuelGrid.length) {
            secondPlayersAllWins++;
            secondPlayersDiagonalWins++;
        }
        countFirstPlayersSymbol = 0;
        countSecondPlayersSymbol = 0;

        // ----- diagonal 'right to left' wins
        for (int row = 0; row < afterDuelGrid.length; row++) {
            int column = afterDuelGrid.length - 1 - row;
            if (afterDuelGrid[row][column] == firstPlayersSymbol) {
                countFirstPlayersSymbol++;
            } else if (afterDuelGrid[row][column] == secondPlayersSymbol) {
                countSecondPlayersSymbol++;
            }
        }
        if (countFirstPlayersSymbol == afterDuelGrid.length) {
            firstPlayersAllWins++;
            firstPlayersDiagonalWins++;
        }
        if (countSecondPlayersSymbol == afterDuelGrid.length) {
            secondPlayersAllWins++;
            secondPlayersDiagonalWins++;
        }
        countFirstPlayersSymbol = 0;
        countSecondPlayersSymbol = 0;

        // --------------------- displaying who is a winner --------------------------
        System.out.println("The winner of the duel between the First player with symbol '" + firstPlayersSymbol +
                "' \nand the Second player with symbol '" + secondPlayersSymbol + "' is as follows --->");
        PrintSeparator.separator();

        System.out.println("The triumphant champion of the super exciting brain game known as tic-tac-toe is:\n");
        if (firstPlayersAllWins > secondPlayersAllWins) {
            System.out.println("First player with symbol '" + firstPlayersSymbol + "'");
        } else if (firstPlayersAllWins < secondPlayersAllWins) {
            System.out.println("Second player with symbol '" + secondPlayersSymbol + "'");
        } else {
            System.out.println("There was a draw in the game between the First player with symbol '"
                    + firstPlayersSymbol + "' \nand the Second player with symbol '" + secondPlayersSymbol + "'");
        }

        // ----- displaying some statistics about the first player's game
        System.out.println();
        PrintSeparator.separator();
        System.out.println("First player's wins with symbol '" + firstPlayersSymbol + "': " + firstPlayersAllWins);
        if (firstPlayersAllWins > 0) {
            if (firstPlayersRowWins > 0) {
                System.out.println("Winning rows of the first player: " + firstPlayersRowWins);
            }
            if (firstPlayersColumnWins > 0) {
                System.out.println("Winning columns of the first player: " + firstPlayersColumnWins);
            }
            if (firstPlayersDiagonalWins > 0) {
                System.out.println("Winning diagonals of the first player: " + firstPlayersDiagonalWins);
            }
        }

        // ----- displaying some statistics about the second player's game
        System.out.println("\nSecond player's wins with symbol '" + secondPlayersSymbol + "': " + secondPlayersAllWins);
        if (secondPlayersAllWins > 0) {
            if (secondPlayersRowWins > 0) {
                System.out.println("Winning rows of the second player: " + secondPlayersRowWins);
            }
            if (secondPlayersColumnWins > 0) {
                System.out.println("Winning columns of the second player: " + secondPlayersColumnWins);
            }
            if (secondPlayersDiagonalWins > 0) {
                System.out.println("Winning diagonals of the second player: " + secondPlayersDiagonalWins);
            }
        }
    }
}
