package code;
import java.util.ArrayList;

/*
 * @author Britt Cyr
 * @version 1.0
 */

public class ChessBoard {
    public ArrayList<int[]> history;
    double[] pawn =    {9.00,9.00,9.00,9.00,9.00,9.00,9.00,9.00,
                        1.50,1.50,1.50,1.60,1.60,1.50,1.50,1.50,
                        1.40,1.40,1.40,1.50,1.50,1.40,1.40,1.40,
                        1.30,1.30,1.30,1.48,1.49,1.30,1.30,1.30,
                        1.20,1.20,1.25,1.38,1.39,1.25,1.20,1.20,
                        1.10,1.10,1.10,1.10,1.10,1.10,1.10,1.10,
                        1.00,1.00,1.00,1.00,1.00,1.00,1.00,1.00,
                        0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00};
    
    double[] rook =    {5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00,
                        5.00,5.00,5.00,5.00,5.00,5.00,5.00,5.00};
                        
    double[] knight =  {3.00,3.00,3.00,3.00,3.00,3.00,3.00,3.00,
                        3.00,3.10,3.10,3.10,3.10,3.10,3.10,3.00,
                        3.00,3.10,3.20,3.20,3.20,3.20,3.10,3.00,
                        3.00,3.10,3.20,3.30,3.30,3.20,3.10,3.00,
                        3.00,3.10,3.20,3.30,3.30,3.20,3.10,3.00,
                        3.00,3.10,3.20,3.20,3.20,3.20,3.10,3.00,
                        3.00,3.10,3.10,3.10,3.10,3.10,3.10,3.00,
                        3.00,2.98,3.00,3.00,3.00,3.00,2.98,3.00};
    
    double[] bishop =  {3.00,3.00,3.00,3.00,3.00,3.00,3.00,3.00,
                        3.00,3.00,3.00,3.00,3.00,3.00,3.00,3.00,
                        3.00,3.00,3.00,3.00,3.00,3.00,3.00,3.00,
                        3.00,3.20,3.00,3.00,3.00,3.00,3.20,3.00,
                        3.00,3.00,3.30,3.00,3.00,3.30,3.00,3.00,
                        3.00,3.00,3.00,3.00,3.00,3.00,3.00,3.00,
                        3.00,3.30,3.00,3.00,3.00,3.00,3.30,3.00,
                        3.00,3.00,2.90,3.00,3.00,2.90,3.00,3.00};
    
    double[] queen =   {9.40,9.40,9.60,9.70,9.70,9.60,9.40,9.40,
                        9.14,9.14,9.20,9.30,9.30,9.20,9.14,9.14,
                        9.12,9.12,9.12,9.14,9.14,9.12,9.12,9.12,
                        9.10,9.10,9.10,9.10,9.10,9.10,9.10,9.10,
                        9.00,9.00,9.30,9.00,9.00,9.00,9.00,9.00,
                        9.00,9.00,9.00,9.00,9.00,9.00,9.00,9.00,
                        9.00,9.00,9.00,9.00,9.00,9.00,9.00,9.00,
                        9.00,9.00,9.00,9.00,9.00,9.00,9.00,9.00};

    double[] king =    {96.00,96.00,96.00,96.00,96.00,96.00,96.00,96.00,
                        96.00,96.00,96.00,96.00,96.00,96.00,96.00,96.00,
                        96.00,96.00,96.00,96.00,96.00,96.00,96.00,96.00,
                        96.00,96.00,96.00,96.00,96.00,96.00,96.00,96.00,
                        97.00,97.00,97.00,97.00,97.00,97.00,97.00,97.00,
                        98.00,98.00,98.00,98.00,98.00,98.00,98.00,98.00,
                        99.00,99.00,99.00,99.00,99.00,99.00,99.00,99.00,
                        100.00,101.00,101.00,100.00,100.00,100.00,101.00,100.00};

    double[][] scores = {pawn, pawn, rook, knight, bishop, queen, king};
    private final char[] pieces = { '-', 'P', 'R', 'N', 'B', 'Q', 'K' };
    public int[] board;

    /*
     * This is the constructor and initializes the board
     */
    public ChessBoard(){
       int[] start =  {-2,-3,-4,-5,-6,-4,-3,-2,
                       -1,-1,-1,-1,-1,-1,-1,-1,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0,
                        1, 1, 1, 1, 1, 1, 1, 1,
                        2, 3, 4, 5, 6, 4, 3, 2};
       board = start;
       history = new ArrayList<int[]>();
    }

    /*
     * Get the list of moves for a given side
     * 
     * @param color The color to explore the moves for
     * 
     * @return moves An ArrayList<int[]> of moves that are legal
     */
    public ArrayList<int[]> getMoves(boolean color) {
        ArrayList<int[]> moves = new ArrayList<int[]>();
        
        for(int square = 0; square < 64; square++){
            int val = board[square];
            if(val == 0){
                continue;
            }
            
            if(val > 0 == color){
                val = Math.abs(val);
                
                switch(val){
                case 1:
                    Pawn.getMoves(moves, board, square);
                    break;
                case 2:
                    Rook.getMoves(moves, board, square);
                    break;
                case 3:
                    Knight.getMoves(moves, board, square);
                    break;
                case 4:
                    Bishop.getMoves(moves, board, square);
                    break;
                case 5:
                    Queen.getMoves(moves, board, square);
                    break;
                case 6:
                    King.getMoves(moves, board, square);
                    break;
                }
            }
        }
        
        return moves;
    }

    /*
     * Score the board positive favors white
     * 
     * @return score double score that represents the board score
     */
    public double heuristic() {
        double result = 0.0;
        
        for(int pos = 0; pos < 64; pos++){
            if(board[pos] > 0){
                result += scores[board[pos]][pos];
            }
            else if(board[pos] < 0){
                result -= scores[-board[pos]][flip(pos)];
            }
        }
        
        result = Math.floor(Math.pow(10.0,5.0)*result) / Math.pow(10.0, 5.0);
        return result;
    }
    
    /*
     * This is to get the corresponding position for black
     * as though you rotated the board 180 degrees
     * 
     * @param x int for the position to be flipped
     * @return y int of the other spot
     */
    public int flip(int x){
        int f = 63 - x;
        int r = f % 8;
        return f + 7 - 2*r;
    }
    
    /*
     * Variable heuristic for fast score changes
     * @param move the move that occurred
     * @param prevPiece the piece that was in the target square
     * @return scoreChange the change in score as a result of the move
     */
    public double scoreChange(int[] move, int prevPiece){
        double scoreChange = 0.00;
        
        if(prevPiece > 0){
            scoreChange -= scores[prevPiece][move[1]];
        }
        else if(prevPiece < 0){
            scoreChange += scores[-prevPiece][flip(move[1])];
        }
        
        if(board[move[1]] > 0){
            scoreChange -= scores[board[move[1]]][move[0]];
            scoreChange += scores[board[move[1]]][move[1]];
        }
        else{
            scoreChange += scores[-board[move[1]]][flip(move[0])];
            scoreChange -= scores[-board[move[1]]][flip(move[1])];
        }
        
        return scoreChange;
    }

    

    /*
     * Make a move on the board
     * 
     * @param move The move that will be made
     * 
     * @modifies board
     */
    public void makeMove(int[] move) {
        try{
        int start = move[0];
        int end = move[1];
        int piece = board[start];
        board[end] = piece;
        board[start] = 0;
        if ((piece == 6 || piece == -6)
                && (end - start == 2 || end - start == -2)
                && (start == 4 || start == 60)) {
            if (end > start) {
                makeMove(new int[] {move[0]+3,move[0]+1});
            }
            else{
                makeMove(new int[] {move[0]-4,move[0]-1});
            }
        }
        }
        catch (Exception e){}
    }
    
    /*
     * This is for undoing a move in the searcher
     * 
     * @param move int[] move that we want to reverse
     * @param piece int for the piece that was already there
     * @modifies board
     * @return None
     */

    public void undoMove(int[] move, int piece) {
        if ((board[move[1]] == 6 || board[move[1]] == -6)
                && (move[1] - move[0] == 2 || move[0] - move[1] == 2)
                && (move[0] == 4 || move[0] == 60 )) {
            if (move[0] < move[1]) {
                makeMove(new int[] { move[0] + 1, move[0] + 3 });
            } else {
                makeMove(new int[] { move[0] - 1, move[0] - 4 });
            }
            makeMove(new int[] { move[1], move[0] });
        }
        else{
            makeMove(new int[] { move[1], move[0] });
            board[move[1]] = piece;
        }
    }

    /*
     * Make and print a human readable version of the board
     * 
     * @return  string  String that is human readable for the board
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        String header = "BRITT CYR CHESS\n\n";
        String score = "\nSCORE IS: ";
        String heuristic = Double.toString(heuristic());
        StringBuilder b = new StringBuilder(150);
        for (int x = 0; x < 64; x++) {
            if (x % 8 == 0) {
                b.append("\n");
            }
            char color = board[x] >= 0 ? ' ' : '*';
            b.append(color);
            b.append(pieces[Math.abs(board[x])]);
        }
        b.append("\n");
        b.deleteCharAt(0);
        ret.append(header);
        ret.append(b.toString());
        ret.append(score);
        ret.append(heuristic);
        return ret.toString();
    }

    /*
     * Print a human readable version of the board
     */
    public void prettyPrint(){
        System.out.println(this);
    }
    
    /*
     * Accessor function for the board
     * 
     * @return  board   int[] representation of the board
     */
    public int[] getBoard(){
        return board;
    }
    
    /*
     * Gets all the valid moves for a player so that they don't move into check
     * Get all moves the fast way
     * Check for en passant
     * Check move into check / failure to move out of it
     * Check if rook or king has already moved for castling
     * Remove castle out of or through check
     * 
     * @param color boolean that represents the color to explore for
     * @return moves all the valid moves
     */
    public ArrayList<int[]> getValidMoves(boolean color){
        checkPawnPromote();
        ArrayList<int[]> moves = getMoves(color);

        if (history.size() > 0) {
            int[] prevMove = history.get(history.size() - 1);
            if (Math.abs(board[prevMove[1]]) == 1
                    && Math.abs(prevMove[1] - prevMove[0]) == 16) {
                if (prevMove[1] % 8 > 0
                        && board[prevMove[1]] * board[prevMove[1] + 1] == -1) {
                    moves.add(new int[] { prevMove[1] + 1, prevMove[1] - 8 });
                }
                if (prevMove[1] % 8 < 7
                        && board[prevMove[1]] * board[prevMove[1] - 1] == -1) {
                    moves.add(new int[] { prevMove[1] - 1, prevMove[1] - 8 });
                }
            }
        }
        
        
        for(int x = moves.size()-1 ; x >= 0 ; x--){
            int[] move = moves.get(x);
            int prevInt = board[move[1]];
            makeMove(move);
            ArrayList<int[]> oppMoves = getMoves(!color);
            for(int[] m: oppMoves){
                if(Math.abs(board[m[1]]) == 6){
                    moves.remove(x);
                    break;
                }
            }
            undoMove(move, prevInt);
        }
        
        ArrayList<int[]> oppMoves = getMoves(!color);
        for(int x = moves.size()-1; x >= 0; x--){
            int[] move = moves.get(x);
            if(Math.abs(board[move[0]])==6 && Math.abs(move[0]-move[1])==2){
                boolean illegal = false;
                int rook = move[0] > move[1] ? move[0] - 4 : move[0] + 3;
                for(int[] m: history){
                    if(m[0] == rook || m[0] == move[0]){
                        illegal = true;
                        break;
                    }
                }
                if(illegal){
                    moves.remove(x);
                    break;
                }

                int mid = (move[0] + move[1])/2;
                for(int[] oppMove: oppMoves){
                    if(oppMove[1] == move[0] || oppMove[1] == mid){
                        moves.remove(x);
                        break;
                    }
                }
            }
        }
        
        return moves;
    }
    /*
     * This checks for a pawn promotion
     * This is only called at the base level of the search
     * and for the player moves
     * @param None
     * @modifies board
     * @return None
     */
    public void checkPawnPromote(){
        for(int x = 0; x < 8; x++){
            if (board[x] == 1){
                board[x] = 5;
            }
        }
        for(int x = 56; x < 64; x++){
            if (board[x] == -1){
                board[x] = -5;
            }
        }
    }
    
    public void setBoard(int[] board2){
        for(int x = 0; x < 63; x++){
            board[x] = board2[x];
        }
    }
}