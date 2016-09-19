package tw.com.google.www_0903;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad53 {

	public static void main(String[] args) {
		
		try {
			
			DataOutputStream data
			
			= new DataOutputStream(new FileOutputStream("dir/data.txt"));
			
			int a=456;
			
			boolean b=true;
			
			double c=12.7;
			
			data.writeInt(a);
			
			data.writeBoolean(b);
			
			data.writeDouble(c);
			
			data.flush();
			
			data.close();
			
		} catch (IOException e) {
			
		}
		

			
		
		

		
		
		
		
		
		
	}

}
