import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    // Add more tests here!
    // Come up with varied cases

    @Test    
    public void testReachableArea_OnlyWater() {
        int[][] island = {
            {2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2},
            {2, 2, 0, 2, 2},
            {2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual); 
    }

    @Test
    public void testReachableArea_allWalkable() {
        int[][] island = {
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(25, actual); // The explorer can reach all 25 cells.
    }


    // @Test
    // public void testReachableArea_map1() {
    //     int[][] island = {
    //         {1, 1, 1, 3, 1},
    //         {3, 2, 3, 1, 3},
    //         {1, 1, 1, 1, 3},
    //         {3, 1, 2, 1, 0},
    //         {1, 1, 1, 2, 1}
    //     };
    //     int actual = ExplorerSearch.reachableArea(island);
    //     assertEquals(10, actual); 
    // }    

    @Test
    public void testReachableArea_surroundedByMountains() {
        int[][] island = {
            {1, 1, 1, 1, 1},
            {1, 2, 3, 2, 1},
            {1, 3, 0, 3, 1},
            {1, 2, 3, 2, 1},
            {1, 1, 1, 1, 1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual); 
    }


    @Test
    public void testReachableArea_minimumIslandSize() {
        int[][] island = {
            {0} 
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual); 
    }

    @Test
    public void testReachableArea_largeIsland() {
        int[][] island = {
            {1, 1, 1, 3, 1, 1},
            {3, 2, 3, 1, 3, 1},
            {1, 1, 1, 1, 3, 3},
            {3, 1, 2, 1, 0, 1},
            {1, 1, 1, 2, 1, 1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual); // The explorer can only reach 14 cells.
    }
}
