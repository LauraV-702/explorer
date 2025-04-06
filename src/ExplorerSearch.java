import java.util.ArrayList;
import java.util.List;

public class ExplorerSearch {

    /**
     * Returns how much land area an explorer can reach on a rectangular island.
     * 
     * The island is represented by a rectangular int[][] that contains
     * ONLY the following nunbers:
     * 
     * '0': represents the starting location of the explorer
     * '1': represents a field the explorer can walk through
     * '2': represents a body of water the explorer cannot cross
     * '3': represents a mountain the explorer cannot cross
     * 
     * The explorer can move one square at a time: up, down, left, or right.
     * They CANNOT move diagonally.
     * They CANNOT move off the edge of the island.
     * They CANNOT move onto a a body of water or mountain.
     * 
     * This method should return the total number of spaces the explorer is able
     * to reach from their starting location. It should include the starting
     * location of the explorer.
     * 
     * For example
     * 
     * @param island the locations on the island
     * @return the number of spaces the explorer can reach
     */
    public static int reachableArea(int[][] island) {
        // Implement your method here!
        // Please also make more test cases
        // I STRONGLY RECOMMEND testing some helpers you might make too
        return -1;
        /*
         initialize an int array
            make a variable, and pass in island, call the explorer method here
         initialize a 2D array to store the rows and columns
            *note this is like the hashset for graphs, store the VISITED space here
         thenn return the reachableAreaHelper here, pass in  island, startingPosition, visited
         */
    }

     public static int reachableAreaHelper(int[][]island, int[] current, boolean[][] visited) {
        int row = current[0];
        int col = current[1];

        //check if current is out of bounds
        if (row < 0 || row >= island.length || 
            col < 0 || col >= island[0].length) { return 0; }

        //check if current is blocked by water or mountains
        if (island[row][col] == 2 || island[row][col] == 3) { return 0; }

        visited[row][col] = true;

        int area = 1;

        return area;
     }

     public static int[] explorerLocation(int[][] island) {
        for (int r = 0; r < island.length; r++) {
            for (int c = 0; c < island[0].length; c++) {
                if (island[r][c] == 0) {
                    return new int[]{r, c}; 
                }
            }
        }
        throw new IllegalArgumentException("No space present");
    }


    public static List<int[]> possibleMoves(char[][] island, int[]current)  {
       int row = current[0];
       int col = current[1];

       List<int[]> moves = new ArrayList<>();

       //UP
       
       //DOWN

       //LEFT

       //RIGHT


    }


}
