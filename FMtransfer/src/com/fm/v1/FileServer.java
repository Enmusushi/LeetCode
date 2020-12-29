package com.fm.v1;

import java.io.DataInputStream;
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
			DataInputStream dis = new DataInputStream(is);
			if (is.available() > 0) {
				String fileName=  dis.readUTF();
				Long fileLength = dis.readLong();
				String path = "D:/" + System.currentTimeMillis()+"-"+fileName;
				File file = new File(path);
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buffer = new byte[1024];
				int length =0;
				float curFinished = 0f;
				while ((length=dis.read(buffer, 0, 1024)) != -1) {
					fos.write(buffer, 0, length);
					curFinished+=length;
					System.out.println("check:"+curFinished/fileLength);
				}
				fos.flush();
				fos.close();
				dis.close();
			}
			dataSocket.close();
			server.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
