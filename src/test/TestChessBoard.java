package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import code.ChessBoard;

import org.junit.Test;

public class TestChessBoard {
    
    @Test
    public void testConstructor() {
        ChessBoard b = new ChessBoard();
        assert b.getClass() == ChessBoard.class;
        
        int[] start = {-2,-3,-4,-5,-6,-4,-3,-2,
                       -1,-1,-1,-1,-1,-1,-1,-1,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        1, 1, 1, 1, 1, 1, 1, 1,
                        2, 3, 4, 5, 6, 4, 3, 2};
        int[] board = b.getBoard();
        for (int x = 0; x < 64; x++){
            assertEquals(board[x],start[x]);
        }
    }

    @Test
    public void testHeuristic() {
        ChessBoard b = new ChessBoard();
        assert b.heuristic() == 0.0;
    }
    
    @Test
    public void testToString() {
        ChessBoard b = new ChessBoard();
        assertEquals(b.toString()
                ,"BRITT CYR CHESS\n\n*R*N*B*Q*K*B*N*R\n*P*P*P*P*P*P*P*P\n - - - - - - - -\n - - - - - - - -\n - - - - - - - -\n - - - - - - - -\n P P P P P P P P\n R N B Q K B N R\n\nSCORE IS: 0.0");
    }
    
    
    @Test
    public void testGetMoves(){
        ChessBoard board = new ChessBoard();
        ArrayList<int[]> moves = board.getMoves(false);
        
        ArrayList<int[]> expected = new ArrayList<int[]>();
        expected.add(new int[] {1,16});
        expected.add(new int[] {1,18});
        expected.add(new int[] {6,21});
        expected.add(new int[] {6,23});
        expected.add(new int[] {8,16});
        expected.add(new int[] {8,24});
        expected.add(new int[] {9,17});
        expected.add(new int[] {9,25});
        expected.add(new int[] {10,18});
        expected.add(new int[] {10,26});
        expected.add(new int[] {11,19});
        expected.add(new int[] {11,27});
        expected.add(new int[] {12,20});
        expected.add(new int[] {12,28});
        expected.add(new int[] {13,21});
        expected.add(new int[] {13,29});
        expected.add(new int[] {14,22});
        expected.add(new int[] {14,30});
        expected.add(new int[] {15,23});
        expected.add(new int[] {15,31});
        
        compareLists(moves, expected);
    }
    

    @Test
    public void testScoreChange(){
        ChessBoard board = new ChessBoard();
        int[] move = {52, 36};
        board.makeMove(move);
        
        assertEquals(board.scoreChange(move, 0), .39, .01);
        
        int[] move2 = {11, 27};
        board.makeMove(move2);
        
        assertEquals(board.scoreChange(move2, 0), -.38, .01);
        
        int[] move3 = {36, 27};
        board.makeMove(move3);
        
        assertEquals(board.scoreChange(move3, -1), 1.47, .01);
        
        int[] move4 = {3, 27};
        board.makeMove(move4);
        
        assertEquals(board.scoreChange(move4, 1), -1.48, .01);
    }
    
    
    @Test
    public void testMakeMove(){
        ChessBoard board = new ChessBoard();
        int[] move1 = new int[] {62, 47};
        int[] move2 = new int[] {54, 46};
        int[] move3 = new int[] {61, 54};
        int[] move4 = new int[] {60, 62};
        board.makeMove(move1);
        board.makeMove(move2);
        board.makeMove(move3);
        ArrayList<int[]> moves = board.getMoves(true);
        board.makeMove(move4);
        
        int[] expect = {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 1, 3,
                         1, 1, 1, 1, 1, 1, 4, 1,
                         2, 3, 4, 5, 0, 2, 6, 0};
                
        for(int x = 0 ; x < 64 ; x++){
            assertTrue(board.getBoard()[x]==expect[x]);
        }
        
        boolean found = false;
        for(int[] m: moves){
            if(m[0] == 60 && m[1] == 62){
                found = true;
            }
        }
        assertTrue(found);
        
        board.makeMove(new int[] {1,18});
        board.makeMove(new int[] {9,17});
        board.makeMove(new int[] {2,16});
        board.makeMove(new int[] {3,2});
        board.makeMove(new int[] {2,9});
        moves = board.getMoves(false);
        board.makeMove(new int[] {4, 2});
        
        int[] expect2 =    { 0, 0,-6,-2, 0,-4,-3,-2,
                            -1,-5,-1,-1,-1,-1,-1,-1,
                            -4,-1,-3, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 1, 3,
                             1, 1, 1, 1, 1, 1, 4, 1,
                             2, 3, 4, 5, 0, 2, 6, 0};
        for(int x = 0 ; x < 64 ; x ++){
            assertTrue(board.getBoard()[x]==expect2[x]);
        }
        found = false;
        for(int[]m : moves){
            if(m[0] == 4 && m[1] == 2){
                found = true;
            }
        }
        assertTrue(found);
    }
    
    @Test
    public void testFlip(){
        ChessBoard b = new ChessBoard();
        assertTrue(b.flip(0)==56);
        assertTrue(b.flip(7)==63);
        assertTrue(b.flip(1)==57);
    }
    
    @Test
    public void testGetBoard(){
        ChessBoard board = new ChessBoard();
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        for(int x = 0; x < 64 ; x++){
            assertTrue(board.getBoard()[x]==start[x]);
        }
    }
    
    public void testCheckPawnPromote(){
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        ChessBoard board = new ChessBoard();
        board.makeMove(new int[]{48, 0});
        start[0] = 1;
        start[48] = 0;
        for(int x = 0 ; x< 64; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.checkPawnPromote();
        start[0] = 5;
        for(int x = 0; x < 64 ; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.makeMove(new int[] {8, 56});
        start[8] = 0;
        start[56] = -1;
        for(int x = 0; x < 64; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.checkPawnPromote();
        start[56] = -5;
        for(int x = 0; x < 64 ; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
    }
    
    @Test
    public void testUndoMove(){
        ChessBoard board = new ChessBoard();
        board.makeMove(new int[] {52, 36});
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        start[52] = 0;
        start[36] = 1;
        for(int x = 0; x < 64; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.undoMove(new int[] {52, 36}, 0);
        start[52] = 1;
        start[36] = 0;
        for(int x = 0 ; x < 64; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.makeMove(new int[] {0, 63});
        start[0] = 0;
        start[63] = -2;
        for(int x = 0; x < 64 ; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
        board.undoMove(new int[] {0, 63}, 2);
        start[0] = -2;
        start[63] = 2;
        for(int x = 0; x < 64 ; x++){
            assertTrue(start[x] == board.getBoard()[x]);
        }
    }
    
    
    @Test
    public void testGetValidMoves(){
        ChessBoard board = new ChessBoard();
        ArrayList<int[]> moves = board.getValidMoves(false);
        
        ArrayList<int[]> expected = new ArrayList<int[]>();
        expected.add(new int[] {1,16});
        expected.add(new int[] {1,18});
        expected.add(new int[] {6,21});
        expected.add(new int[] {6,23});
        expected.add(new int[] {8,16});
        expected.add(new int[] {8,24});
        expected.add(new int[] {9,17});
        expected.add(new int[] {9,25});
        expected.add(new int[] {10,18});
        expected.add(new int[] {10,26});
        expected.add(new int[] {11,19});
        expected.add(new int[] {11,27});
        expected.add(new int[] {12,20});
        expected.add(new int[] {12,28});
        expected.add(new int[] {13,21});
        expected.add(new int[] {13,29});
        expected.add(new int[] {14,22});
        expected.add(new int[] {14,30});
        expected.add(new int[] {15,23});
        expected.add(new int[] {15,31});
        
        compareLists(moves, expected);
        
        ChessBoard boardEP = new ChessBoard();
        boardEP.makeMove(new int[] {48, 24});
        boardEP.makeMove(new int[] {50, 26});
        boardEP.makeMove(new int[] {9, 25});
        boardEP.history.add(new int[] {0,0});
        boardEP.history.add(new int[] {0,0});
        boardEP.history.add(new int[] {0,0});
        boardEP.history.add(new int[] {0,0});
        boardEP.history.add(new int[] {9, 25});
        
        ArrayList<int[]> movesEP = boardEP.getValidMoves(true);
        ArrayList<int[]> expectedEP = new ArrayList<int[]>(); 
    

        expectedEP.add(new int[] {26, 17});
        expectedEP.add(new int[] {24, 17});
        expectedEP.add(new int[] {56, 48});
        expectedEP.add(new int[] {56, 40});
        expectedEP.add(new int[] {56, 32});
        expectedEP.add(new int[] {24, 16});
        expectedEP.add(new int[] {26, 18});
        expectedEP.add(new int[] {57, 40});
        expectedEP.add(new int[] {57, 42});
        expectedEP.add(new int[] {59, 50});
        expectedEP.add(new int[] {59, 41});
        expectedEP.add(new int[] {59, 32});
        expectedEP.add(new int[] {62, 47});
        expectedEP.add(new int[] {62, 45});
        expectedEP.add(new int[] {49, 41});
        expectedEP.add(new int[] {49, 33});
        expectedEP.add(new int[] {51, 43});
        expectedEP.add(new int[] {51, 35});
        expectedEP.add(new int[] {52, 44});
        expectedEP.add(new int[] {52, 36});
        expectedEP.add(new int[] {53, 45});
        expectedEP.add(new int[] {53, 37});
        expectedEP.add(new int[] {54, 46});
        expectedEP.add(new int[] {54, 38});
        expectedEP.add(new int[] {55, 47});
        expectedEP.add(new int[] {55, 39});
        
        compareLists(expectedEP, movesEP);

        boardEP.history.add(new int[] {0, 0});
        ArrayList<int[]> expectedEP2 = new ArrayList<int[]>();
        ArrayList<int[]> movesEP2 = boardEP.getValidMoves(true);
        
        expectedEP2.add(new int[] {56, 48});
        expectedEP2.add(new int[] {56, 40});
        expectedEP2.add(new int[] {56, 32});
        expectedEP2.add(new int[] {24, 16});
        expectedEP2.add(new int[] {26, 18});
        expectedEP2.add(new int[] {57, 40});
        expectedEP2.add(new int[] {57, 42});
        expectedEP2.add(new int[] {59, 50});
        expectedEP2.add(new int[] {59, 41});
        expectedEP2.add(new int[] {59, 32});
        expectedEP2.add(new int[] {62, 47});
        expectedEP2.add(new int[] {62, 45});
        expectedEP2.add(new int[] {49, 41});
        expectedEP2.add(new int[] {49, 33});
        expectedEP2.add(new int[] {51, 43});
        expectedEP2.add(new int[] {51, 35});
        expectedEP2.add(new int[] {52, 44});
        expectedEP2.add(new int[] {52, 36});
        expectedEP2.add(new int[] {53, 45});
        expectedEP2.add(new int[] {53, 37});
        expectedEP2.add(new int[] {54, 46});
        expectedEP2.add(new int[] {54, 38});
        expectedEP2.add(new int[] {55, 47});
        expectedEP2.add(new int[] {55, 39});
        
        compareLists(expectedEP2, movesEP2);
        
        ChessBoard moveIntoCheck = new ChessBoard();
        moveIntoCheck.makeMove(new int[] {0, 52});
        ArrayList<int[]> movesIntoCheck = moveIntoCheck.getValidMoves(true);
        ArrayList<int[]> expectedIntoCheck = new ArrayList<int[]>();
        
        expectedIntoCheck.add(new int[] {59, 52});
        expectedIntoCheck.add(new int[] {60, 52});
        expectedIntoCheck.add(new int[] {61, 52});
        expectedIntoCheck.add(new int[] {62, 52});
        
        compareLists(expectedIntoCheck, movesIntoCheck);
        
        
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
