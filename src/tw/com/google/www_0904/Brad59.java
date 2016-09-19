package tw.com.google.www_0904;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Brad59 {

	public static void main(String[] args) {
		
		//進度
		//0904_2_30
		//0904_AM_1hr
		
		String data = "我正在攻擊你!!";
		
		byte[]sendData = data.getBytes();
				
		try {
			DatagramSocket socket 
			
			= new DatagramSocket();
			
			DatagramPacket packet 
			
			= new DatagramPacket
			
			(sendData,sendData.length,
					
					InetAddress.getByName("111.246.10.73"),8888);
			
			socket.send(packet);
			
			socket.close();
			
			System.out.println("OK");
			
		} catch (SocketException e) {
			
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			
		}
		
	}

}
