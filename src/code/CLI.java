package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

    public static void makeMoveForUser(ChessBoard board, boolean playerColor) {

        System.out.println("\nPLEASE ENTER A MOVE TO MAKE");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String start = in.readLine();
            
            if(start.charAt(0)=='-'){
                handleOptions(board, playerColor, start);
                board.prettyPrint();
                makeMoveForUser(board,playerColor);
                return;
            }
            
            String end = in.readLine();
            
            userMakeMove(board, playerColor, start, end);
        }
        catch (Exception e) {
            board.prettyPrint();
            System.out.println("\nINVALID INPUT");
            makeMoveForUser(board, playerColor);
        }
    }
    
    public static void userMakeMove(ChessBoard board, boolean playerColor, String start, String end)
    throws InvalidInputException{
            int startLet = toInt(start.substring(0, 1));
            int endLet = toInt(end.substring(0, 1));

            int startInt = startLet
                    + (7 - (Integer.parseInt(start.substring(1, 2)) - 1)) * 8;
            int endInt = endLet
                    + (7 - (Integer.parseInt(end.substring(1, 2)) - 1)) * 8;

            int[] attemptedMove = new int[] { startInt, endInt };

            if (!isValidMoveForUser(board, playerColor, attemptedMove)) {
                throw new InvalidInputException("ILLEGAL MOVE");
            }

            board.makeMove(new int[] { startInt, endInt });
            board.history.add(new int[] {startInt, endInt});
            board.checkPawnPromote();
            //TODO: Check for en passant
        
    }

    public static boolean isValidMoveForUser(ChessBoard board, boolean color,
            int[] move) {
        ArrayList<int[]> boardMoves = board.getValidMoves(color);
        for (int[] validMove : boardMoves) {
            if (validMove[0] == move[0] && validMove[1] == move[1]) {
                return true;
            }
        }
        return false;
    }

    public static int toInt(String str) throws InvalidInputException {
        if (str.equalsIgnoreCase("a")) {
            return 0;
        }
        if (str.equalsIgnoreCase("b")) {
            return 1;
        }
        if (str.equalsIgnoreCase("c")) {
            return 2;
        }
        if (str.equalsIgnoreCase("d")) {
            return 3;
        }
        if (str.equalsIgnoreCase("e")) {
            return 4;
        }
        if (str.equalsIgnoreCase("f")) {
            return 5;
        }
        if (str.equalsIgnoreCase("g")) {
            return 6;
        }
        if (str.equalsIgnoreCase("h")) {
            return 7;
        }
        throw new InvalidInputException("BAD LETTER");
    }
    
    public static void handleOptions(ChessBoard board, boolean playerColor, String str) 
            throws InvalidInputException, GameOverException, IOException{
        char option = str.charAt(1);
        switch (Character.toUpperCase(option)){
            case 'H':
                Searcher.hint(board,playerColor);
                Searcher.hint(board,!playerColor);
                break;
            case 'U':
                undo(board);
                break;
            case 'X':
                override(board,playerColor);
                break;
            case 'W':
                writeFile(board);
                break;
            case 'O':
                readBoard();
                break;
            case 'M':
                printMoves();
                break;
            default:
                throw new InvalidInputException("INVALID INPUT");
        }
    }

    
    public static void undo(ChessBoard board){
        ArrayList<int[]> hist = board.history;
        ChessBoard board2 = new ChessBoard();
        hist.remove(hist.size()-1);
        hist.remove(hist.size()-1);
        for(int[] move: hist){
            board2.makeMove(move);
        }
        board2.history = hist;
        for(int x=0; x< 63; x++){
            board.getBoard()[x] = board2.getBoard()[x];
        }
    }

    public static void override(ChessBoard board, boolean playerColor)
            throws InvalidInputException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line1 = in.readLine();
        String line2 = in.readLine();

        int startLet = toInt(line1.substring(0, 1));
        int endLet = toInt(line2.substring(0, 1));

        int startInt = startLet
                + (7 - (Integer.parseInt(line1.substring(1, 2)) - 1)) * 8;
        int endInt = endLet
                + (7 - (Integer.parseInt(line2.substring(1, 2)) - 1)) * 8;

        board.makeMove(new int[] { startInt, endInt });
        board.history.add(new int[] {startInt, endInt});
        board.checkPawnPromote();
    }
    
    public static void writeFile(ChessBoard board){
        String path = "C:\\Users\\Britt\\Documents\\";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            String extension = in.readLine();
            path = path + extension + ".txt";
            FileOutputStream fo = new FileOutputStream(new File(path));
            PrintStream ps = new PrintStream(fo);
            ps.println(board.toString());
            for(int[] move: board.history){
                ps.print(move[0]);
                ps.print(" ");
                ps.println(move[1]);
            }
            ps.close();
            fo.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void readBoard(){
        try{
            String file = "C:\\Users\\Britt\\Documents\\";
            BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
            file = file + name.readLine() + ".txt";
            BufferedReader in = new BufferedReader(new FileReader(file));
            
            String line = in.readLine();
            line = in.readLine();
            //Need to convert pairs of letters to an integer
            int[] arr = new int[64];
            for (int row = 0; row < 8; row++){
                line = in.readLine();
                for (int col = 0; col < 8; col++){
                    char color = line.charAt(col*2);
                    char type = line.charAt(col*2+1);
                    arr[row*8+col] = getPiece(color,type);
                }
            }
            ArrayList<int[]> moves = new ArrayList<int[]>();
            in.readLine();
            in.readLine();
            line = in.readLine();
            while(line != null){
                Scanner scan = new Scanner(line);
                int start = scan.nextInt();
                int end = scan.nextInt();
                int[] move = new int[] {start, end};
                moves.add(move);
                line = in.readLine();
            }
            in.close();
            Main.board.setBoard(arr);
            Main.board.history = moves;
        }
        catch(IOException e){
            e.printStackTrace();
            System.err.println("BAD FILE");
        }
    }
    
    public static int getPiece(char color, char type){
        if (type == '-'){
            return 0;
        }
        int multiple = color == '*' ? -1 : 1;
        int num = 0;
        switch(type){
        case 'P':
            num = 1;
            break;
        case 'R':
            num = 2;
            break;
        case 'N':
            num = 3;
            break;
        case 'B':
            num = 4;
            break;
        case 'Q':
            num = 5;
            break;
        case 'K':
            num = 6;
            break;
        }
        return multiple * num;
    }
    
    public static void printMoves(){
        for(int[] move: Main.board.history){
            System.out.print(move[0]);
            System.out.print(" ");
            System.out.println(move[1]);
        }
        
    }
}
