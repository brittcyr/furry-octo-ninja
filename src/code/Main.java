package code;

public class Main {

    static int searchDepth = 5;
    static ChessBoard board ;
    
    /*
     * Insertion point for the project
     * 
     * @param args String[] args are the parameters
     */
    public static void main(String[] args) {
        boolean playerColor = true;
        board = new ChessBoard();
        if (!playerColor) {
            try {
                Searcher.searchLayer1(!playerColor, board, searchDepth);
            } catch (Exception e) {
            }
        }

        while (true) {
            try {
                board.prettyPrint();
                CLI.makeMoveForUser(board, playerColor);
                Searcher.searchLayer1(!playerColor, board, searchDepth);
            } catch (Exception e) {
                Searcher.determineWinner(board, playerColor);
                break;
            }
        }
    }
}