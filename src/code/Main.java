package code;

import javax.swing.SwingUtilities;

import View.ChessView;;

public class Main {

    static int searchDepth = 5;
    static ChessBoard board ;
    
    /*
     * Insertion point for the project
     * 
     * @param args String[] args are the parameters
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ChessView main = new ChessView();
                main.setVisible(true);
            }
        });
    }
}