package tw.com.google.www._0904;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		
		try {
			Socket socket 
			
				= new Socket
				
					(InetAddress.getByName("127.0.0.1"),8888);
			
			socket.close();
			
		} catch (UnknownHostException e) {
			
			
		} catch (IOException e) {
			
		}
		
		

	}

}
