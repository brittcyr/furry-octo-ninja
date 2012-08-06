package code;

import java.util.ArrayList;
import java.util.Random;

import View.ChessView;

public class Searcher {
    static boolean randomized = true;

    /*
     * This is the first version of the search It will have a search depth of 1
     * 
     * @param color boolean that tells which side is to move
     * 
     * @param board Chessboard that will get the move. To be removed in
     * production
     * 
     * @modifies board
     * 
     * @return None
     */
    @Deprecated
    public static void naiveSearch(boolean color, ChessBoard board) {
        ArrayList<int[]> moves = board.getMoves(color);

        // We will make a move and then undo it
        int size = moves.size();
        double[] scores = new double[size];
        int[][] move = new int[size][2];

        int index = 0;
        for (int[] m : moves) {
            int prevPiece = board.getBoard()[m[1]];
            board.makeMove(m);
            scores[index] = board.scoreChange(m, prevPiece);
            move[index] = m;
            board.undoMove(m, prevPiece);
            index++;
        }

        int bestIndex = 0;
        double bestScore = scores[0];

        for (int x = 1; x < size; x++) {
            if ((scores[x] > bestScore && color)
                    || (scores[x] < bestScore && !color)) {
                bestScore = scores[x];
                bestIndex = x;
            }
        }

        board.makeMove(move[bestIndex]);
    }

    /*
     * Variable depth search
     * 
     * @param color boolean that tells which side is to move
     * 
     * @param board Chessboard that will get the move. To be removed in
     * production
     * 
     * @param depth
     * 
     * @return result double that is the score at this node
     */
    public static double searchR(boolean color, int depth) {
        if(depth == 0){
            return 0.0;
        }
        ArrayList<int[]> moves = Main.board.getMoves(color);
        int size = moves.size();
        double[] scores = new double[size];

        int index = 0;
        for (int[] m : moves) {
            int prevPiece = Main.board.board[m[1]];
            if (Math.abs(prevPiece) == 6){
                return prevPiece*100.0*-1;
            }
            Main.board.makeMove(m);
            scores[index] = Main.board.scoreChange(m, prevPiece) + searchR(!color, depth - 1);
            Main.board.undoMove(m, prevPiece);
            index++;
        }

        double bestScore = scores[0];

        for (int x = 1; x < size; x++) {
            if ((scores[x] > bestScore && color)
                    || (scores[x] < bestScore && !color)) {
                bestScore = scores[x];
            }
        }

        return bestScore;
    }
    
    /*
     * Variable depth search
     * 
     * @param color boolean that tells which side is to move
     * 
     * @param board ChessBoard that will get the move. To be removed in
     * production
     * 
     * @param depth
     * 
     * @return result double that is the score at this node
     */
    public static int[] searchLayer1(boolean color, ChessBoard board, int depth) 
            throws GameOverException{
        ArrayList<int[]> moves = board.getValidMoves(color);
        if (checkGameOver(board, color)){
            throw new GameOverException("ME");
        }
        int size = moves.size();
        double[] scores = new double[size];
        int[][] move = new int[size][2];

        int index = 0;
        for (int[] m : moves) {
            int prevPiece = board.getBoard()[m[1]];
            board.makeMove(m);
            scores[index] = board.scoreChange(m, prevPiece) + searchR(!color, depth - 1);
            move[index] = m;
            board.undoMove(m, prevPiece);
            index++;
        }

        int bestIndex = 0;
        double bestScore = scores[0];
        if (randomized){
        Random r = new Random();
        for(int x = 1; x < size; x++){
            double scale = 10.0;
            scores[x] *= (r.nextDouble()+scale)/scale;
        }
        }

        for (int x = 1; x < size; x++) {
            if ((scores[x] > bestScore && color)
                    || (scores[x] < bestScore && !color)) {
                bestScore = scores[x];
                bestIndex = x;
            }
        }

        board.makeMove(move[bestIndex]);
        board.history.add(move[bestIndex]);
        board.checkPawnPromote();

        return move[bestIndex];
    }
    
    
    public static void determineWinner(ChessBoard board, boolean playerColor){
        board.prettyPrint();
        System.out.println("GAME OVER");
        if(board.getValidMoves(playerColor).size()==0){
            ArrayList<int[]> compMoves = board.getMoves(!playerColor);
            boolean capture = false;
            for(int[] move: compMoves){
                if(Math.abs(board.getBoard()[move[1]])==6){
                    capture = true;
                    break;
                }
            }
            if (capture){
                System.out.println("YOU LOST");
            }
            else{
                System.out.println("STALEMATE");
            }
        }
        else{
            ArrayList<int[]> compMoves = board.getMoves(playerColor);
            boolean capture = false;
            for(int[] move: compMoves){
                if(Math.abs(board.getBoard()[move[1]])==6){
                    capture = true;
                    break;
                }
            }
            if (capture){
                System.out.println("YOU WIN");
            }
            else{
                System.out.println("STALEMATE");
            }
        }
    board.prettyPrint();
    }
    
    public static boolean checkGameOver(ChessBoard board, boolean playerToMove){
        ArrayList<int[]> moves = board.getValidMoves(playerToMove);
        if (moves.size() == 0){
            return true;
        }
        return false;
    }
    
    public static void hint(ChessBoard board, boolean playerColor) throws GameOverException{
        searchLayer1(playerColor,board,ChessView.searchDepth);
    }
}