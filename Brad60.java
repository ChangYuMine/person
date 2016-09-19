package tw.com.google.www._0904;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad60 {

	public static void main(String[] args) {
				
		byte[]buf = new byte[1024];
		
		try {
			
			DatagramSocket socket 
			
			= new DatagramSocket(8888);
			
			DatagramPacket packet 
			
				= new DatagramPacket(buf, buf.length);
			
			socket.receive(packet);
			
			socket.close();
			
			InetAddress urip = packet.getAddress();
			
			byte[]data = packet.getData();
			
			int len = packet.getLength();
			
			System.out.println(urip.getHostAddress()
					
					+":"+new String(data,0,len));
			
		} catch (SocketException e) {
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
		
		}
	}

}
