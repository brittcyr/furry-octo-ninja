package code;

import java.util.ArrayList;

public class Knight extends ChessPiece {

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

        int mypos = me % 8;
        int myval = board[me];

        boolean uur = (me > 15 && mypos < 7);
        boolean urr = (me > 7 && mypos < 6);
        boolean uul = (me > 15 && mypos > 0);
        boolean ull = (me > 7 && mypos > 1);
        boolean ddr = (me < 48 && mypos < 7);
        boolean drr = (me < 56 && mypos < 6);
        boolean ddl = (me < 48 && mypos > 0);
        boolean dll = (me < 56 && mypos > 1);

        if (uur && myval * board[me - 15] <= 0) {
            ret.add(new int[] { me, me - 15 });
        }

        if (urr && myval * board[me - 6] <= 0) {
            ret.add(new int[] { me, me - 6 });
        }

        if (uul && myval * board[me - 17] <= 0) {
            ret.add(new int[] { me, me - 17 });
        }

        if (ull && myval * board[me - 10] <= 0) {
            ret.add(new int[] { me, me - 10 });
        }

        if (ddr && myval * board[me + 17] <= 0) {
            ret.add(new int[] { me, me + 17 });
        }

        if (drr && myval * board[me + 10] <= 0) {
            ret.add(new int[] { me, me + 10 });
        }

        if (ddl && myval * board[me + 15] <= 0) {
            ret.add(new int[] { me, me + 15 });
        }

        if (dll && myval * board[me + 6] <= 0) {
            ret.add(new int[] { me, me + 6 });
        }

    }

}
