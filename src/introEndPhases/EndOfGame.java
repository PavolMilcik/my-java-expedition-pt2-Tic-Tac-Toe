package introEndPhases;

import utility.PrintSeparator;

public class EndOfGame {
    public static void endOfTheGame(char[] usersSymbols) {
        // players symbols
        char firstPlayersSymbol = usersSymbols[0];
        char secondPlayersSymbol = usersSymbols[1];

        System.out.println("\n\n----------------------- END THE GAME -----------------------");
        PrintSeparator.separator();
        System.out.println("Thank you for the game and battle of wits, \nthe First player with symbol '"
                + firstPlayersSymbol + "' and the Second player with symbol '" + secondPlayersSymbol + "'.");
        System.out.println("Hopefully, we'll see each other again sometime.\nHave a great day.\n\n");
    }
}
