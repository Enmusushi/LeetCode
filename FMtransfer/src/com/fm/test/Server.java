package com.fm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket server=null;
		int port = (int)(Math.random()*Short.MAX_VALUE+1001);
		try {
			System.out.println(port);
			server = new ServerSocket(port);
			Socket dataSocket = server.accept();
			InputStream  is= dataSocket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
			dataSocket.close();
			server.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
