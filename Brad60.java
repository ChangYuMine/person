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
			
			System.out.println("OK"+urip.getHostAddress());
			
		} catch (SocketException e) {
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
		}

	}

}
