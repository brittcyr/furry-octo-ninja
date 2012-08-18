package code;

public class ChessNotation {

    public static String getAlgebraicNotationForMove(int[] move, ChessBoard board){
        String result = "";
        //Assume the move is already made
        int end = move[1];
        int start = move[0];
        

        char[] pieces = { '-', 'P', 'R', 'N', 'B', 'Q', 'K' };
        
        result = Character.toString(pieces[Math.abs(board.board[end])]);
        if (board.board[end] == 1 || board.board[end] == -1){
            result = "";
        }
        
        result += toSquare(end);
        
        //First make the move depending on the type of piece, then determine if more needed
        return result;
    }
    
    
    public static String toSquare(int sq){

        int sqCol = sq % 8;
        int sqRow = 8 - (sq / 8);
        
        
        
        return "TEST";
    }
}
