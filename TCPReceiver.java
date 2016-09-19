package tw.com.google.www._0904;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPReceiver {

	public static void main(String[] args) {
		
		try {
			ServerSocket server 
			
					= new ServerSocket(8888);
			
			System.out.println("before");
			
			server.accept();
			//重要!!接收動作!!
			
			System.out.println("after");
			
			server.close();
			
			System.out.println("OK");
			
		} catch (IOException e) {
			
			
		}

	}

}
