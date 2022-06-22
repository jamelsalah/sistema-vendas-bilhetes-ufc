package server;


import java.net.*;
import java.io.*;

public class server{
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5000);
		Socket s = ss.accept();
		
		System.out.printf("Client Connected");
	}
}