package code;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception{
    String message;
    
    InvalidInputException(String msg){
        message = msg;
    }
    
}
