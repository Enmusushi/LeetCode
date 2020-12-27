package com.fm.client;

import java.net.Socket;

public class Client {
	private Socket client = null;
	public Client() {
		client = new Socket();
	}
	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}
	
	
}
