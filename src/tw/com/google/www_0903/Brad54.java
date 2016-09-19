package tw.com.google.www_0903;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Brad54 {

	public static void main(String[] args) {
	
		try {
			DataInputStream data2 
			
			= new DataInputStream(new FileInputStream("dir/data.txt"));
			
			int data = data2.readInt();
			
			boolean data3 = data2.readBoolean();
			
			double data4 = data2.readDouble();
			
			System.out.println(data);
			
			System.out.println(data3);
			
			System.out.println(data4);
			
			data2.close();
						
		} catch (IOException e) {
			
		}

	}

}
