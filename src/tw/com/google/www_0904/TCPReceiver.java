package tw.com.google.www_0904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
		
		try {
			ServerSocket server 
			
					= new ServerSocket(8888);
			
			Socket socket = server.accept();
			//重要!!接收動作!!
			
			InputStream in = socket.getInputStream();
			
			InputStreamReader irs = new InputStreamReader(in);
			
			BufferedReader read = new BufferedReader(irs);
			
			int c;
			
			StringBuffer sb = new StringBuffer();
			
			while((c=read.read())!=-1){
				
				sb.append((char)c);
				
			}
			
			InetAddress urip = socket.getInetAddress();
			
			server.close();
			
			System.out.println(urip.getHostAddress()+":"+sb);
			
		} catch (IOException e) {
			
			
		}

	}

}
