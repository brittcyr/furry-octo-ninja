package code;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    /*
     * Get the moves for a given piece
     * 
     * @param moves An arraylist of moves that we will be editing
     * 
     * @param board the board
     * 
     * @param me the piece to consider
     * 
     * @modifies moves
     */
    public static void getMoves(ArrayList<int[]> ret, int[] board, int me) {
        boolean color = board[me] > 0 ? true : false;
        if (color) {
            if (me < 8) {
                return;
            }
            if (me >= 42 && board[me - 8] == 0 && board[me - 16] == 0) {
                ret.add(new int[] { me, me - 16 });
            }
            if (board[me - 8] == 0) {
                ret.add(new int[] { me, me - 8 });
            }
            if (me % 8 > 0 && board[me - 9] < 0) {
                ret.add(new int[] { me, me - 9 });
            }
            if (me % 8 < 7 && board[me - 7] < 0) {
                ret.add(new int[] { me, me - 7 });
            }
        } else {
            if (me >= 54) {
                return;
            }
            if (me < 16 && board[me + 8] == 0 && board[me + 16] == 0) {
                ret.add(new int[] { me, me + 16});
            }
            if (board[me + 8] == 0) {
                ret.add(new int[] { me, me + 8 });
            }
            if (me % 8 > 0 && board[me + 7] > 0) {
                ret.add(new int[] { me, me + 7});
            }
            if (me % 8 < 7 && board[me + 9] > 0) {
                ret.add(new int[] { me, me + 9 });
            }
        }
    }

}
