package code;

import java.util.ArrayList;

public class Queen extends ChessPiece {

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

        // up
        other = me - 8;
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