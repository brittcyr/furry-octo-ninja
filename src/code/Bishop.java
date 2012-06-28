package code;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    /*
     * This gets the moves for a piece at a position me
     * 
     * @param ret ArrayList<int[]> this is where we put the moves
     * 
     * @param board int[] the board representation
     * 
     * @param me int for the location to look at
     */
    public static void getMoves(ArrayList<int[]> ret, int[] board, int me) {

        // up left
        int mypos = me % 8;
        int myval = board[me];
        int other = me - 9;
        while (other >= 0 && mypos > other % 8) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other -= 9;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // up right
        other = me - 7;
        while (other >= 0 && mypos < other % 8) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other -= 7;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // down left
        other = me + 7;
        while (other < 64 && mypos > other % 8) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other += 7;
            } else {
                if (board[other] * myval > 0) {
                    break;
                }
                ret.add(new int[] { me, other });
                break;
            }
        }

        // down right
        other = me + 9;
        while (other < 64 && mypos < other % 8) {
            if (board[other] == 0) {
                ret.add(new int[] { me, other });
                other += 9;
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