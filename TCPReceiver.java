package tw.com.google.www_0904;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
				
		try {
			
			ServerSocket server;
			
			server = new ServerSocket(6666);
			
			Socket socket = server.accept();
			
			BufferedInputStream bin=
					
					new BufferedInputStream
					
						(socket.getInputStream());
			
			BufferedOutputStream bout = 
					
					new BufferedOutputStream
					
						(new FileOutputStream("upload/747.jpg"));
			
			int a;
			
			while((a=bin.read())!=-1){
				
				bout.write(a);
			}
			
			bout.flush();
			
			bin.close();
			
			server.close();
			
			bout.close();
		
		} catch (IOException e) {
		
			System.out.println("Server"+e.toString());
			
		}
		
		
		
			
//傳送訊息範例			
//		try {
//			ServerSocket server 
//			
//					= new ServerSocket(8888);
//			
//			Socket socket = server.accept();
//			//重要!!接收動作!!
//			
//			InputStream in = socket.getInputStream();
//			
//			InputStreamReader irs = new InputStreamReader(in);
//			
//			BufferedReader read = new BufferedReader(irs);
//			
//			int c;
//			
//			StringBuffer sb = new StringBuffer();
//			
//			while((c=read.read())!=-1){
//				
//				sb.append((char)c);
//				
//			}
//			
//			InetAddress urip = socket.getInetAddress();
//			
//			server.close();
//			
//			System.out.println(urip.getHostAddress()+":"+sb);
//			
//		} catch (IOException e) {
//			
//			
//		}

	}

}
