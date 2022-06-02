/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class LatihanServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
// TODO code application logic here 
int portNumber = 4444; try ( ServerSocket serverSocket = new ServerSocket(portNumber); 
        Socket clientSocket = serverSocket.accept(); 
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) { 
    String msg; 
    while(!(msg = in.readLine()).equalsIgnoreCase("exit")){ 
        System.out.println("Server Receive: " + msg); out.println("Pesan Diterima"); 
    } 
} catch (IOException ex) { 
    //Logger.getLogger(LatihanServer.class.getName()).log(Level.SEVERE, null, ex); 
    ex.getMessage();
} 
    } 
}



