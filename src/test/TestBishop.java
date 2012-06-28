package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.Bishop;

public class TestBishop {

    @Test
    public void testBlackDownEdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,16});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});
        list.add(new int[] {2,47});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackDownCapture() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 1,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,16});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});
        list.add(new int[] {2,47});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackDownOwnPiece() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                        -1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0,-1,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteDownEdge() {
        int[] start =  {-2,-3, 4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,16});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});
        list.add(new int[] {2,47});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteDownCapture() {
        int[] start =  {-2,-3, 4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                        -1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0,-1,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,16});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});
        list.add(new int[] {2,47});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteDownOwnPiece() {
        int[] start =  {-2,-3, 4,-5,-6,-4,-3,-2,
                        -1, 0,-1, 0,-1,-1,-1,-1,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 1,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 2;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {2,9});
        list.add(new int[] {2,11});
        list.add(new int[] {2,20});
        list.add(new int[] {2,29});
        list.add(new int[] {2,38});   

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackUpEdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3,-4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,40});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});
        list.add(new int[] {58,23});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackUpCapture() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3,-4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,40});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});
        list.add(new int[] {58,23});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testBlackUpOwnPiece() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3,-4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteUpEdge() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,40});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});
        list.add(new int[] {58,23});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }
    
    @Test
    public void testWhiteUpCapture() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,40});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});
        list.add(new int[] {58,23});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
        compareLists(result, list);
    }

    @Test
    public void testWhiteUpOwnPiece() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 1, 0, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 58;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {58,49});
        list.add(new int[] {58,51});
        list.add(new int[] {58,44});
        list.add(new int[] {58,37});
        list.add(new int[] {58,30});

        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Bishop.getMoves(result, start, pieceToMove);
        
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
