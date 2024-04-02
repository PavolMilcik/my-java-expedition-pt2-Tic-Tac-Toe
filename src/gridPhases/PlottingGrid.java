package gridPhases;

import utility.PrintSeparator;


public class PlottingGrid {
    public static void displayingGrid(char[][] grid) {
        System.out.println("\n--------------------- THE GAME FIELD - GRID ---------------------");
        PrintSeparator.separator();

        // print numbers for columns over the grid
        for (int i = 1; i <= grid[0].length; i++) {
            if (i == 1) {
                System.out.print("  " + i);
            } else if (i == grid[0].length) {
                System.out.println(" " + i);
            } else {
                System.out.print(" " + i);
            }
        }

        // print grid
        int numberOfRow = 1;
        for (char[] row : grid) {
            System.out.print(numberOfRow + " ");
            for (char column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
            numberOfRow++;
        }
    }
}
