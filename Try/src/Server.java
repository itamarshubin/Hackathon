import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

//import newClient.Server;

import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Server 
{
	static Vector<Socket> ClientSockets;
	int data = 0;
	int fps = 10;
	
	Server() throws IOException
	{
		System.out.println("Server started");
		
		ServerSocket server = new ServerSocket(8000);
		ClientSockets = new Vector<Socket>();
		
		while (true)
		{
			Socket client = server.accept();
			AcceptClient acceptClient = new AcceptClient(client);
			System.out.println("Client connected");
		}
	}
	
	class AcceptClient extends Thread
	{
		Socket ClientSocket;
		DataInputStream in;
		DataOutputStream out;
		
		AcceptClient(Socket client) throws IOException
		{
			ClientSocket = client;
			in = new DataInputStream(ClientSocket.getInputStream());
			out = new DataOutputStream(ClientSocket.getOutputStream());
			
			ClientSockets.add(ClientSocket);
			
			start();

		}
		
		public void run() 
		{
			  try
			  {
                  while (true) 
                  {
                	  Thread waitForInput = new Thread()
                	  {
                		    public void run() 
                		    {
                		        try 
                		        {
                		        	String inputC = in.readUTF();
                		        	data++;
                		        }
                		        catch(Exception e) 
                		        {
                		            System.out.println(e);
                		        }
                		    }  
                	  };

                	  waitForInput.start();
	                  //System.out.println("here");
	                  for (int i = 0; i < ClientSockets.size(); i++) 
	                  {
	                          Socket pSocket = (Socket) ClientSockets.elementAt(i);
	                          //if(ClientSocket.equals(pSocket))
	                          //    continue;
	                          DataOutputStream pOut = new DataOutputStream(pSocket.getOutputStream());
	                          pOut.writeUTF(data+"");
	                          pOut.flush();
	                          System.out.println(data);
	                  }
	                  try {Thread.sleep(1000/fps);} catch (InterruptedException e) {}
                  }
			  } 
			  catch (IOException e) 
			  {
                  //e.printStackTrace();
			  }
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
        Server server = new Server();
	}
}
