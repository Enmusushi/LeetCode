package com.fm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
	public static void main(String[] args) {
		Socket client = new Socket();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input port :");
		int port = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please input file path :");
		String path = scanner.nextLine();
		File file = new File(path);
		InetSocketAddress address = new InetSocketAddress(port);
		try {
			client.connect(address);
			OutputStream os = client.getOutputStream();
			FileInputStream fis = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int length = 0;
			while((length=fis.read(buffer, 0, 1024))!=-1) {
				os.write(buffer, 0, length);
			}
			fis.close();
			os.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
