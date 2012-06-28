package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.Knight;

public class TestKnight {

    @Test
    public void testBlackTop() {
        int[] start =  {-2,-3,-3,-5,-6,-4,-3,-2,
                         1,-1,-1,-1, 1,-1,-1,-1,
                         0, 1, 0, 1, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,8});
        list.add(new int[] {2,12});
        list.add(new int[] {2,17});
        list.add(new int[] {2,19});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteTop() {
        int[] start =  {-2,-3, 3,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0,-1, 0,-1, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,8});
        list.add(new int[] {2,12});
        list.add(new int[] {2,17});
        list.add(new int[] {2,19});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteMiddle() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 1, 0, 1, 0, 0, 0,
                         0, 1, 0, 0, 0, 1, 0, 0,
                         0, 0, 0, 3, 0, 0, 0, 0,
                         0, 1, 0, 0, 0, 1, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackMiddle() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0,-1, 0,-1, 0, 0, 0,
                         0,-1, 0, 0, 0,-1, 0, 0,
                         0, 0, 0,-3, 0, 0, 0, 0,
                         0,-1, 0, 0, 0,-1, 0, 0,
                         1, 1,-1, 1,-1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackBottom() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 1, 0, 1, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3,-3, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,48});
        list.add(new int[] {58,41});
        list.add(new int[] {58,43});
        list.add(new int[] {58,52});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteBottom() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0,-1, 0,-1, 0, 0, 0, 0,
                        -1, 1, 1, 1,-1, 1, 1, 1,
                         2, 3, 3, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,48});
        list.add(new int[] {58,41});
        list.add(new int[] {58,43});
        list.add(new int[] {58,52});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Knight.getMoves(result, start, pieceToMove);
        
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

    //TODO: Test move left, right, up down, to the edge
    //TODO: Test move with zero possible moves
    //TODO: Test move with capture
    //TODO: Test move blocked by own piece
}