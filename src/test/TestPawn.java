package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import code.Pawn;


public class TestPawn {
    
    @Test
    public void testInitialMoveTwo() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {48,40});
        list.add(new int[] {48,32});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, 48);
        
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
    
    
    @Test
    public void testInitialMoveTwoBlocked() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {48,40});  
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, 48);
        
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
    
    @Test
    public void testBlackInitialMoveTwo() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {8,16});
        list.add(new int[] {8,24});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, 8);
        
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
    
    
    @Test
    public void testBlackInitialMoveTwoBlocked() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {8,16});  
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, 8);
        
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
    
    @Test
    public void testBlackInitialMoveTwoCaptureLeft() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         1, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 9;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {pieceToMove,17});
        list.add(new int[] {pieceToMove,25});
        list.add(new int[] {pieceToMove,16});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, pieceToMove);
        
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
    
    
    @Test
    public void testInitialMoveTwoCaptureBoth() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 0,-1, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 49;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {pieceToMove,41});
        list.add(new int[] {pieceToMove,33});
        list.add(new int[] {pieceToMove,40});
        list.add(new int[] {pieceToMove,42});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, pieceToMove);
        
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
    
    @Test
    public void testInitialMoveTwoCaptureRight() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, -1, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};

        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {48,40});
        list.add(new int[] {48,32});
        list.add(new int[] {48,41});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, 48);
        
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
    
    @Test
    public void testInitialMoveTwoCaptureLeft() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                        -1, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 49;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {pieceToMove,41});
        list.add(new int[] {pieceToMove,33});
        list.add(new int[] {pieceToMove,40});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, pieceToMove);
        
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
    
    
    @Test
    public void testBlackInitialMoveTwoCaptureBoth() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         1, 0, 1, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 9;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {pieceToMove,17});
        list.add(new int[] {pieceToMove,25});
        list.add(new int[] {pieceToMove,16});
        list.add(new int[] {pieceToMove,18});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, pieceToMove);
        
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
    
    @Test
    public void testBlackInitialMoveTwoCaptureRight() {
        int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                        -1,-1,-1,-1,-1,-1,-1,-1,
                         0, 0, 1, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0,
                         1, 1, 1, 1, 1, 1, 1, 1,
                         2, 3, 4, 5, 6, 4, 3, 2};
        
        int pieceToMove = 9;
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {pieceToMove,17});
        list.add(new int[] {pieceToMove,25});
        list.add(new int[] {pieceToMove,18});   
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        
        Pawn.getMoves(result, start, pieceToMove);
        
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
