package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import code.CLI;
import code.ChessBoard;
import code.Searcher;

/**
 * ChessView is a JFrame that has all the fields required. It can be played by
 * using the main.
 */
@SuppressWarnings("serial")
public class ChessView extends JFrame implements MouseListener, MouseMotionListener{
    /**
     * The ChessGUI fields are all of the objects in the GUI.
     */
    Dimension boardSize = new Dimension(600, 600);
    Dimension GUISize = new Dimension(800, 800);
    private final Color WHITE = Color.white;
    private final Color BROWN = new Color(128,40,0);
    
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;
    int loc;
    public static ChessBoard board;
    
    public static int searchDepth = 5;
    boolean playerColor;
    
    boolean boardLock;
    private JPanel chessBoard;
    private JLayeredPane layeredPane;
    

    public ChessView(){
        super("Britt Cyr Chess");
        
        board = new ChessBoard();
        playerColor = true;
        boardLock = false;
        layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        layeredPane.setPreferredSize(boardSize);
        layeredPane.addMouseListener(this);
               
        chessBoard = new JPanel();
        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
        chessBoard.setLayout( new GridLayout(8, 8) );
        chessBoard.setPreferredSize( boardSize );
        chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
 
        makeBoard(board);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo( null );
        setVisible(true);
    }
    
    
    public void mousePressed(MouseEvent e){
        if(boardLock){return;}
        chessPiece = null;
        Component c =  chessBoard.findComponentAt(e.getX(), e.getY());

       
        if (c instanceof JPanel) 
        return;

        try{
        loc = Integer.parseInt(c.getParent().getName());
       
        Point parentLocation = c.getParent().getLocation();
        xAdjustment = parentLocation.x - e.getX();
        yAdjustment = parentLocation.y - e.getY();
        chessPiece = (JLabel)c;
        chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
        chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
        layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
        }
        catch (NullPointerException ex){
            
        }
        }
    
    
    public void mouseReleased(MouseEvent e) {
        if(boardLock){return;}
        if(chessPiece == null) return;
       
        chessPiece.setVisible(false);
        Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
       
        Container parent;
        if (c instanceof JLabel){
        parent = c.getParent();
        parent.remove(0);
        parent.add( chessPiece );
        }
        else {
        parent = (Container)c;
        parent.add( chessPiece );
        }
        chessPiece.setVisible(true);
        
        if(Integer.parseInt(parent.getName()) != loc){
            String newLoc = toSquare(Integer.parseInt(parent.getName()));
            String oldLoc = toSquare(loc);
            try{CLI.userMakeMove(board, true, oldLoc, newLoc);}
            catch(Exception ex)
            {System.out.println("\nINVALID MOVE");
             return;}
            boardLock = true;
            makeComputerMove();
            boardLock = false;
        }

        }
    
    public String toSquare(int loc){
        int row = loc / 8;
        int col = loc % 8;
        return Character.toString((char)('a' + col)) + Integer.toString(8-row);
    }
    
    public int toInt(String a){
        return (int)(a.charAt(0) - 'a') + 8*(8-Integer.parseInt(Character.toString(a.charAt(1))));
    }
       
    public void mouseClicked(MouseEvent e) {
        
    }
    
    public void squareClicked(int x, int y){
        
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    public void makeComputerMove(){
            try {
                Searcher.searchLayer1(!playerColor, board, searchDepth);
                makeBoard(board);
            } catch (Exception e) {
                Searcher.determineWinner(board, playerColor);
            }
    }
    
    public void mouseDragged(MouseEvent me) {
        if (boardLock){return;}
        if (chessPiece == null) return;
       chessPiece.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
       }


    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        
    }

    
    public void makeBoard(ChessBoard board){
        chessBoard.removeAll();
        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel( new BorderLayout() );
            chessBoard.add( square );
            square.setName(Integer.toString(i));
           
            int row = (i / 8) % 2;
            if (row == 1)
            square.setBackground( i % 2 == 0 ? BROWN : WHITE );
            else
            square.setBackground( i % 2 == 0 ? WHITE : BROWN );
            
            JLabel piece = null; 
            String path = "./src/View/";
            int p = board.getBoard()[i];
            
            if(p > 0){
                path += "w";
            }
            if(p < 0){
                path += "b";
            }
                        
            switch (Math.abs(p)){
                case 0:
                    break;
                case 1:
                    path += "p";
                    break;
                case 2:
                    path += "r";
                    break;
                case 3:
                    path += "n";
                    break;
                case 4:
                    path += "b";
                    break;
                case 5:
                    path += "q";
                    break;
                case 6:
                    path += "k";
                    break;
                    }
                path += ".gif";
            
            if (!path.equals("./src/View/.gif")){
                piece = new JLabel(new ImageIcon(path));
                JPanel panel = (JPanel)chessBoard.getComponent(i);
                panel.add(piece);
            }
            }
    }
    
}
