package gridPhases;

public class CreatingGrid {
    public static char[][] createGrid(int[] rowsColumns) {
        int rows = rowsColumns[0];
        int columns = rowsColumns[1];
        char[][] emptyGameGrid = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                emptyGameGrid[row][column] = '_';
            }
        }
        return emptyGameGrid;
    }
}
