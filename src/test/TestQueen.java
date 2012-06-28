package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.Queen;

public class TestQueen {
    
    @Test
    public void testBlackMiddle() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 27;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {27,19});
        list.add(new int[] {27,18});
        list.add(new int[] {27,20});
        list.add(new int[] {27,24});
        list.add(new int[] {27,25});
        list.add(new int[] {27,26});
        list.add(new int[] {27,28});
        list.add(new int[] {27,29});
        list.add(new int[] {27,30});
        list.add(new int[] {27,31});
        list.add(new int[] {27,34});
        list.add(new int[] {27,35});
        list.add(new int[] {27,36});
        list.add(new int[] {27,41});
        list.add(new int[] {27,43});
        list.add(new int[] {27,45});
        list.add(new int[] {27,48});
        list.add(new int[] {27,51});
        list.add(new int[] {27,54});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteMiddle() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 27;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {27,19});
        list.add(new int[] {27,18});
        list.add(new int[] {27,20});
        list.add(new int[] {27,24});
        list.add(new int[] {27,25});
        list.add(new int[] {27,26});
        list.add(new int[] {27,28});
        list.add(new int[] {27,29});
        list.add(new int[] {27,30});
        list.add(new int[] {27,31});
        list.add(new int[] {27,34});
        list.add(new int[] {27,35});
        list.add(new int[] {27,36});
        list.add(new int[] {27,41});
        list.add(new int[] {27,43});
        list.add(new int[] {27,45});
        list.add(new int[] {27,9});
        list.add(new int[] {27,11});
        list.add(new int[] {27,13});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackNone() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 3;
        
        ArrayList<int[]> list = new ArrayList<int[]>();

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteNone() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 59;
        
        ArrayList<int[]> list = new ArrayList<int[]>();

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackMiddleFlip() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1, 1,-1, 1,-1, 1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 1, 1,-1, 1, 1,-1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 27;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {27,19});
        list.add(new int[] {27,18});
        list.add(new int[] {27,20});
        list.add(new int[] {27,24});
        list.add(new int[] {27,25});
        list.add(new int[] {27,26});
        list.add(new int[] {27,28});
        list.add(new int[] {27,29});
        list.add(new int[] {27,30});
        list.add(new int[] {27,31});
        list.add(new int[] {27,34});
        list.add(new int[] {27,35});
        list.add(new int[] {27,36});
        list.add(new int[] {27,41});
        list.add(new int[] {27,43});
        list.add(new int[] {27,45});
        list.add(new int[] {27,9});
        list.add(new int[] {27,11});
        list.add(new int[] {27,13});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    
    @Test
    public void testWhiteMiddleFlip() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1, 1,-1, 1,-1, 1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 1, 1,-1, 1, 1,-1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 27;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {27,19});
        list.add(new int[] {27,18});
        list.add(new int[] {27,20});
        list.add(new int[] {27,24});
        list.add(new int[] {27,25});
        list.add(new int[] {27,26});
        list.add(new int[] {27,28});
        list.add(new int[] {27,29});
        list.add(new int[] {27,30});
        list.add(new int[] {27,31});
        list.add(new int[] {27,34});
        list.add(new int[] {27,35});
        list.add(new int[] {27,36});
        list.add(new int[] {27,41});
        list.add(new int[] {27,43});
        list.add(new int[] {27,45});
        list.add(new int[] {27,48});
        list.add(new int[] {27,51});
        list.add(new int[] {27,54});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackNoneFlip() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1,-1,-1,-1, 1, 1, 1,
                         2, 3, 4,-5, 6, 4, 3, 2};
        
        int pieceToMove = 59;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {59, 60});
        list.add(new int[] {59, 58});
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteNoneFlip() {
        int[] start =  {-2,-3,-4, 5,-6,-4,-3,-2,
                        -1,-1, 1, 1, 1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-5, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 3;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {3, 2});
        list.add(new int[] {3, 4});
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Queen.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    
    public void compareLists(ArrayList<int[]> result, ArrayList<int[]> list) {
        assertEquals(result.size(), list.size());

        for (int[] move : result) {
            boolean found = false;
            for (int[] actual : list) {
                if (move[1] == actual[1] && move[0] == actual[0]) {
                    found = true;
                    continue;
                }
            }
            if (!found) {
                fail("Did not find the move " + move[0] + " , " + move[1]);
            }
        }

        for (int[] move : list) {
            boolean found = false;
            for (int[] actual : result) {
                if (move[1] == actual[1] && move[0] == actual[0]) {
                    found = true;
                    continue;
                }
            }
            if (!found) {
                fail("Did not find the move " + move[0] + " , " + move[1]);
            }
        }
    }
    //TODO: Test move left, right, up down, to the edge

}
