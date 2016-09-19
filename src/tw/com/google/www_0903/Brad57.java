package tw.com.google.www_0903;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad57 {

	public static void main(String[] args) {
		
		Brad573 obj = new Brad573();
		
		try {
			ObjectOutputStream obj1 
			
			= new ObjectOutputStream
			
			(new FileOutputStream("dir/john57"));
			
			obj1.writeObject(obj);
			
			obj1.flush();
			
			obj1.close();
			
			System.out.println("OK");
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
			
		}
		System.out.println("-----------");
		
		try {
			ObjectInputStream obj2 
			
			= new ObjectInputStream
			
			(new FileInputStream("dir/john57"));
			
			Brad573 obj3 = (Brad573)obj2.readObject();
			
			obj2.close();
				
			System.out.println("OKOK");
			
		} catch (Exception e) {
			
			System.out.println(e.toString());

		}
		
		

	}

}
class Brad571 implements Serializable{
	
		Brad571(){
		
		System.out.println("Brad571");
		
		}
	
}

class Brad572 extends Brad571 {
	
		Brad572(){
		
		System.out.println("Brad572");
		
		}
	
}

class Brad573 extends Brad572 {
	
		Brad573(){
		
		System.out.println("Brad573");
		
		}
	
	
	
}

