package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import code.King;

public class TestKing {

    @Test
    public void testWhiteCastleRight() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 0, 0, 2};
        
        int pieceToMove = 60;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {60,61});
        list.add(new int[] {60,62});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testWhiteCastleLeft() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 0, 0, 0, 6, 4, 0, 2};

        int pieceToMove = 60;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {60,59});
        list.add(new int[] {60,58});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testWhiteCastleBoth() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 0, 0, 0, 6, 0, 0, 2};
        
        int pieceToMove = 60;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {60,59});
        list.add(new int[] {60,58});
        list.add(new int[] {60,61});
        list.add(new int[] {60,62});
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testBlackCastleRight() {
        int[] start =  {-2,-3,-4,-5,-6, 0, 0,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 4;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {4,5});
        list.add(new int[] {4,6});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testBlackCastleLeft() {
        int[] start =  {-2, 0, 0, 0,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 4;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {4,3});
        list.add(new int[] {4,2});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);
        
        assertEquals(result.size(), list.size());

        compareLists(result, list);
    }
    
    @Test
    public void testBlackCastleBoth() {
        int[] start =  {-2, 0, 0, 0,-6, 0, 0,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 4;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {4,3});
        list.add(new int[] {4,2});
        list.add(new int[] {4,5});
        list.add(new int[] {4,6});
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testMoveAllDirections() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 6, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 0, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {35,26});
        list.add(new int[] {35,27});
        list.add(new int[] {35,28});
        list.add(new int[] {35,34});
        list.add(new int[] {35,36});
        list.add(new int[] {35,42});
        list.add(new int[] {35,43});
        list.add(new int[] {35,44});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }

    @Test
    public void testRightEdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 6,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 0, 4, 3, 2};
        
        int pieceToMove = 39;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {39,30});
        list.add(new int[] {39,31});
        list.add(new int[] {39,38});
        list.add(new int[] {39,46});
        list.add(new int[] {39,47});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testLeftEdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         6, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 0, 4, 3, 2};
        
        int pieceToMove = 32;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {32,24});
        list.add(new int[] {32,25});
        list.add(new int[] {32,33});
        list.add(new int[] {32,40});
        list.add(new int[] {32,41});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testNoMove() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 60;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
    }
    
    @Test
    public void testCapture() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1,-1, 0, 0, 0, 0, 0, 0,
                         6,-1, 0, 0, 0, 0, 0, 0,
                        -1,-1, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 0, 4, 3, 2};
        
        int pieceToMove = 32;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {32,24});
        list.add(new int[] {32,25});
        list.add(new int[] {32,33});
        list.add(new int[] {32,40});
        list.add(new int[] {32,41});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);

        compareLists(result, list);
        
    }
    
    @Test
    public void testCorner() {
        int[] start =  {-6,-3,-4,-5, 0,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 0;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        King.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
        
    }
    
    
    public void compareLists(ArrayList<int[]> result, ArrayList<int[]> list){ 
    assertEquals(result.size(), list.size());
    
    for(int[] move: result){
        boolean found = false;
        for(int[] actual: list){
            if (move[1]==actual[1] && move[0]==actual[0]){
                found = true;
                continue;
            }
        }
        if (!found){
            fail("Did not find the move " + move[0] + " , " + move[1]);
        }
    }
    
    for(int[] move: list){
        boolean found = false;
        for(int[] actual: result){
            if (move[1]==actual[1] && move[0]==actual[0]){
                found = true;
                continue;
            }
        }
        if (!found){
            fail("Did not find the move " + move[0] + " , " + move[1]);
        }
    }
    }
}
