package code;

import java.net.*;
import java.io.*;

public class Connection {
    public URL url;
    
    
    //TODO: GET THE MOVE THAT WE NEED TO SEND
    
    public Connection(String url) throws MalformedURLException{
        this.url = new URL(url);
    }
    
    public String sendAndRespond() throws IOException{
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        if(conn.getResponseCode() != HttpURLConnection.HTTP_OK){
            //TODO: HANDLE ERROR
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String move = in.readLine();
        in.close();
        return move;
    }
    
}
