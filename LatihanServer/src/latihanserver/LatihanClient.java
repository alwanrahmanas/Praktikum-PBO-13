/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanserver;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class LatihanClient {
    
    public static void main(String args[]){ 
        
        String hostName = "localhost"; 
        int portNumber = 4444;
        
        try ( Socket echoSocket = new Socket(hostName, portNumber); 
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),true); 
                BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream())); 
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));){ 
            
            String msg;
            while((msg= stdIn.readLine())!=null){
               out.println(msg);
               if(msg.equalsIgnoreCase("exit"))break;
                System.out.println("Client receive: "+ in.readLine()); 
        
            }
            }catch (IOException ex) { 
            //Logger.getLogger(LatihanClient.class.getName()).log(Level.SEVERE, null, ex); 
            ex.getMessage();
        } 
        
    }
    
}
        
    

