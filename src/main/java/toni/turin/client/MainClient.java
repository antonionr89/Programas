package toni.turin.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import toni.turin.configuration.Configuration;

public class MainClient {
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket kkSocket = new Socket("localhost", Configuration.PORT);
	}

}
