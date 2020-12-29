package com.fm.v1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(file.getName());
			dos.writeLong(file.length());
			FileInputStream fis = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int length = 0;
			while((length=fis.read(buffer, 0, 1024))!=-1) {
				dos.write(buffer, 0, length);
			}
			fis.close();
			dos.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
