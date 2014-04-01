package toni.turin.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import toni.turin.configuration.Configuration;

public class MainServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(Configuration.PORT);
		Socket socketClient1 = serverSocket.accept();
		Socket socketClient2 = serverSocket.accept();
		System.out.println("recibido");
	}

}
