package com.fm.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		int port = (int) (Math.random() * Short.MAX_VALUE + 1001);
		try {
			System.out.println(port);
			server = new ServerSocket(port);
			Socket dataSocket = server.accept();
			InputStream is = dataSocket.getInputStream();
			if (is.available() > 0) {
				String path = "D:/" + System.currentTimeMillis();
				File file = new File(path);
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buffer = new byte[1024];
				int length =0;
				while ((length=is.read(buffer, 0, 1024)) != -1) {
					fos.write(buffer, 0, length);
				}
				fos.flush();
				fos.close();
			}
			dataSocket.close();
			server.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
