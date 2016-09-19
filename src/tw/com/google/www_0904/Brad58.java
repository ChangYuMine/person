package tw.com.google.www_0904;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad58 {

	public static void main(String[] args) {
		
		try {
			
			InetAddress[] ips = 
					
					InetAddress.getAllByName("www.hinet.net");
			
			for(InetAddress ip:ips){
				
				System.out.println(ip.getHostAddress());
			}
			
			//System.out.println(ips.getHostAddress());
			
		} catch (UnknownHostException e) {
			
			System.out.println("XX");
			
		}

	}

}
