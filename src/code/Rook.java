package code;

import java.util.ArrayList;

public class Rook extends ChessPiece {

    /*
     * Get the moves for a given piece
     * 
     * @param moves An arraylist of moves that we will be editing
     * @param board the board
     * @param me the piece to consider
     * @modifies moves
     */
    public static void getMoves(ArrayList<int[]> ret, int[] board, int me) {

        int myval = board[me];
        // up
        int other = me - 8;
        while (other >= 0) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other -= 8;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // down
        other = me + 8;
        while (other < 64) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other += 8;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // left
        int mypos = me % 8;
        other = me - 1;
        while (mypos > other % 8 && other >= 0) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other -= 1;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // right
        other = me + 1;
        while (mypos < other % 8) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other += 1;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }
    }

}