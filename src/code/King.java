package code;

import java.util.ArrayList;

public class King extends ChessPiece {

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

        if (me > 7) {
            if (board[me - 8] * myval <= 0) {
                ret.add(new int[] { me, me - 8 });
            }

            if (mypos > 0 && board[me - 9] * myval <= 0) {
                ret.add(new int[] { me, me - 9 });
            }

            if (mypos < 7 && board[me - 7] * myval <= 0) {
                ret.add(new int[] { me, me - 7 });
            }
        }

        if (me < 56) {
            if (board[me + 8] * myval <= 0) {
                ret.add(new int[] { me, me + 8 });
            }

            if (mypos > 0 && board[me + 7] * myval <= 0) {
                ret.add(new int[] { me, me + 7 });
            }

            if (mypos < 7 && board[me + 9] * myval <= 0) {
                ret.add(new int[] { me, me + 9 });
            }
        }

        if (mypos > 0 && myval * board[me - 1] <= 0) {
            ret.add(new int[] { me, me - 1 });
        }

        if (mypos < 7 && myval * board[me + 1] <= 0) {
            ret.add(new int[] { me, me + 1 });
        }

        if (me == 4) {
            if (board[0] == -2 && board[1] == 0 && board[2] == 0
                    && board[3] == 0) {
                ret.add(new int[] { 4, 2 });
            }
            if (board[7] == -2 && board[6] == 0 && board[5] == 0) {
                ret.add(new int[] { 4, 6 });
            }
        } else if (me == 60) {
            if (board[56] == 2 && board[57] == 0 && board[58] == 0
                    && board[59] == 0) {
                ret.add(new int[] { 60, 58 });
            }
            if (board[63] == 2 && board[62] == 0 && board[61] == 0) {
                ret.add(new int[] { 60, 62 });
            }
        }
    }
}