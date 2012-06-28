package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import code.Rook;


public class TestRook {

    @Test
    public void testBlackDown() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                         0,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 0;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {0,8});
        list.add(new int[] {0,16});
        list.add(new int[] {0,24});
        list.add(new int[] {0,32});
        list.add(new int[] {0,40});
        list.add(new int[] {0,48});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteDown() {
        int[] start =  { 2,-3,-4,-5,-6,-4,-3,-2,
                         0,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 0;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {0,8});
        list.add(new int[] {0,16});
        list.add(new int[] {0,24});
        list.add(new int[] {0,32});
        list.add(new int[] {0,40});
        list.add(new int[] {0,1});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackUp() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 1, 1, 1, 1, 1, 1, 1,
                        -2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 56;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {56,48});
        list.add(new int[] {56,40});
        list.add(new int[] {56,32});
        list.add(new int[] {56,24});
        list.add(new int[] {56,16});
        list.add(new int[] {56,57});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteUp() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 56;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {56,48});
        list.add(new int[] {56,40});
        list.add(new int[] {56,32});
        list.add(new int[] {56,24});
        list.add(new int[] {56,16});
        list.add(new int[] {56,8});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteLREdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 2, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {35,27});
        list.add(new int[] {35,19});
        list.add(new int[] {35,11});
        list.add(new int[] {35,43});
        list.add(new int[] {35,34});
        list.add(new int[] {35,33});
        list.add(new int[] {35,32});
        list.add(new int[] {35,36});
        list.add(new int[] {35,37});
        list.add(new int[] {35,38});
        list.add(new int[] {35,39});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackLREdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0,-2, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {35,27});
        list.add(new int[] {35,19});
        list.add(new int[] {35,51});
        list.add(new int[] {35,43});
        list.add(new int[] {35,34});
        list.add(new int[] {35,33});
        list.add(new int[] {35,32});
        list.add(new int[] {35,36});
        list.add(new int[] {35,37});
        list.add(new int[] {35,38});
        list.add(new int[] {35,39});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteLRCapt() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 0, 0, 2, 0, 0, 0,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {35,27});
        list.add(new int[] {35,19});
        list.add(new int[] {35,11});
        list.add(new int[] {35,43});
        list.add(new int[] {35,34});
        list.add(new int[] {35,33});
        list.add(new int[] {35,32});
        list.add(new int[] {35,36});
        list.add(new int[] {35,37});
        list.add(new int[] {35,38});
        list.add(new int[] {35,39});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackLRCapt() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 0,-2, 0, 0, 0, 1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        int pieceToMove = 35;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {35,27});
        list.add(new int[] {35,19});
        list.add(new int[] {35,51});
        list.add(new int[] {35,43});
        list.add(new int[] {35,34});
        list.add(new int[] {35,33});
        list.add(new int[] {35,32});
        list.add(new int[] {35,36});
        list.add(new int[] {35,37});
        list.add(new int[] {35,38});
        list.add(new int[] {35,39});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Rook.getMoves(result, start, pieceToMove);
        
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
