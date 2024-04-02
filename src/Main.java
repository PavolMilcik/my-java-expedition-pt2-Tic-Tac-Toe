import introEndPhases.Intro;
import gridPhases.SettingOfGrid;
import gridPhases.CreatingGrid;
import gridPhases.PlottingGrid;
import symbolsPhases.PlayersSymbols;
import duelPhases.StartDuel;
import duelPhases.ResultOfDuel;
import introEndPhases.EndOfGame;


public class Main {
    public static void main(String[] args) {
        // ------------------------ GAME PHASES -------------------------

        // Intro phase --->
        Intro.introOfTheGame();

        // Initialize Grid phase --->
        int[] userRowsColumns = SettingOfGrid.initializeGrid();

        // Creating the raw game grid phase --->
        char[][] emptyGameGrid = CreatingGrid.createGrid(userRowsColumns);

        // Plotting the game grid phase --->
        PlottingGrid.displayingGrid(emptyGameGrid);

        // Setting first and second players symbols phase --->
        char[] playersSymbols = PlayersSymbols.settingPlayersSymbols();

        // Start and play duel/game phase --->
        char[][] afterGameGrid = StartDuel.playingTheGame(emptyGameGrid, playersSymbols);

        // Check and display who won the duel, or if it's a draw. After duel/game phase --->
        ResultOfDuel.duelResult(afterGameGrid, playersSymbols);

        // End of the game phase --->
        EndOfGame.endOfTheGame(playersSymbols);
    }
}
