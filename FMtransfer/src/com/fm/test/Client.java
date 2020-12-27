package com.fm.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket client = new Socket();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input port :");
		int port = scanner.nextInt();
		InetSocketAddress address = new InetSocketAddress(port);
		try {
			client.connect(address);
			OutputStream os = client.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
			while(scanner.hasNextLine())
			{
				writer.write(scanner.nextLine());
				writer.newLine();
			}
			scanner.close();
			writer.flush();
			writer.close();
			os.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
