package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CLI {

    public static void makeMoveForUser(ChessBoard board, boolean playerColor) {

        System.out.println("\nPLEASE ENTER A MOVE TO MAKE");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String start = in.readLine();
            
            if(start.charAt(0)=='-'){
                handleOptions(board, playerColor, start);
                board.prettyPrint();
                makeMoveForUser(board,playerColor);
                return;
            }
            
            String end = in.readLine();

            int startLet = toInt(start.substring(0, 1));
            int endLet = toInt(end.substring(0, 1));

            int startInt = startLet
                    + (7 - (Integer.parseInt(start.substring(1, 2)) - 1)) * 8;
            int endInt = endLet
                    + (7 - (Integer.parseInt(end.substring(1, 2)) - 1)) * 8;

            int[] attemptedMove = new int[] { startInt, endInt };

            if (!isValidMoveForUser(board, playerColor, attemptedMove)) {
                throw new Exception("ILLEGAL MOVE");
            }

            board.makeMove(new int[] { startInt, endInt });
            board.history.add(new int[] {startInt, endInt});
            board.checkPawnPromote();
            
        } catch (Exception e) {
            board.prettyPrint();
            System.out.println("\nINVALID INPUT");
            makeMoveForUser(board, playerColor);
        }
    }

    public static boolean isValidMoveForUser(ChessBoard board, boolean color,
            int[] move) {
        ArrayList<int[]> boardMoves = board.getValidMoves(color);
        for (int[] validMove : boardMoves) {
            if (validMove[0] == move[0] && validMove[1] == move[1]) {
                return true;
            }
        }
        return false;
    }

    public static int toInt(String str) throws Exception {
        if (str.equalsIgnoreCase("a")) {
            return 0;
        }
        if (str.equalsIgnoreCase("b")) {
            return 1;
        }
        if (str.equalsIgnoreCase("c")) {
            return 2;
        }
        if (str.equalsIgnoreCase("d")) {
            return 3;
        }
        if (str.equalsIgnoreCase("e")) {
            return 4;
        }
        if (str.equalsIgnoreCase("f")) {
            return 5;
        }
        if (str.equalsIgnoreCase("g")) {
            return 6;
        }
        if (str.equalsIgnoreCase("h")) {
            return 7;
        }
        throw new Exception();
    }
    
    public static void handleOptions(ChessBoard board, boolean playerColor, String str) throws Exception{
        char option = str.charAt(1);
        switch (Character.toUpperCase(option)){
            case 'H':
                Searcher.hint(board,playerColor);
                Searcher.hint(board,!playerColor);
                break;
            case 'U':
                undo(board);
                break;
            /*case 'C':
                capturedPieces(board,playerColor);*/
            case 'X':
                override(board,playerColor);
                break;
            default:
                throw new Exception("INVALID INPUT");
        }
    }

    
    public static void undo(ChessBoard board){
        ArrayList<int[]> hist = board.history;
        ChessBoard board2 = new ChessBoard();
        hist.remove(hist.size()-1);
        hist.remove(hist.size()-1);
        for(int[] move: hist){
            board2.makeMove(move);
        }
        board2.history = hist;
        for(int x=0; x< 63; x++){
            board.getBoard()[x] = board2.getBoard()[x];
        }
    }
    
    public static void override(ChessBoard board, boolean playerColor) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line1 = in.readLine();
        String line2 = in.readLine();

        int startLet = toInt(line1.substring(0, 1));
        int endLet = toInt(line2.substring(0, 1));

        int startInt = startLet
                + (7 - (Integer.parseInt(line1.substring(1, 2)) - 1)) * 8;
        int endInt = endLet
                + (7 - (Integer.parseInt(line2.substring(1, 2)) - 1)) * 8;

        board.makeMove(new int[] { startInt, endInt });
        board.history.add(new int[] {startInt, endInt});
        board.checkPawnPromote();
    }
}
