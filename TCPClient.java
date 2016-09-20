package tw.com.google.www_0904;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		//顯示傳送時間
		
	try {
		
		Socket client = new Socket
				
				(InetAddress.getByName("127.0.0.1"),6666);
		
		//OutputStream out = client.getOutputStream();
		//上式使用BufferedOutputStream後即可不用。
		
		BufferedOutputStream bout
		
				= new BufferedOutputStream
				
						(client.getOutputStream());
		
		BufferedInputStream bin = 
				
				new BufferedInputStream
				
					(new FileInputStream("dir/747.jpg"));
		
		int a;
		
		while((a=bin.read())!=-1){
			
			bout.write(a);
			
		}
		
		bout.flush();
		
		bin.close();
		
		client.close();
		
		bout.close();
		
		System.out.println("sendOK");
		
		System.out.println(System.currentTimeMillis()-start);
		//印出傳送時間
		
	} catch (FileNotFoundException e) {
		
		
	} catch (IOException e) {
		
		System.out.println(e.toString());
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//傳送訊息範例		
//		try {
//			Socket socket 
//			
//				= new Socket
//				
//					(InetAddress.getByName("127.0.0.1"),8888);
//			
//			OutputStream out = socket.getOutputStream();
//			
//			out.write("天佑台灣".getBytes());
//			
//			out.flush();
//			
//			out.close();
//			
//			socket.close();
//			
//		} catch (UnknownHostException e) {
//			
//			
//		} catch (IOException e) {
//			
//		}
		
		

	}

}
