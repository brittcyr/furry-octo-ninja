package code;

@SuppressWarnings("serial")
public class GameOverException extends Exception{

    public String player;
    
    GameOverException(String player){
        this.player = player;
    }
}
