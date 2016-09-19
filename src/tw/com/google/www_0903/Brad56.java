package tw.com.google.www_0903;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad56 {

	public static void main(String[] args) {
		
		try {
			
			ObjectInputStream obj 
			
			= new ObjectInputStream
			
			(new FileInputStream("dir/student.john"));
			
			Object obj1 = obj.readObject();
			
			student s1 = (student)obj1;
			
			student s2 = (student)obj.readObject();
			
//			Object obj2 = obj.readObject();
//			
//			student s2 = (student)obj2;
			
			System.out.println(s1.name+":"+s1.dototal());
			
			System.out.println(s2.name+":"+s2.dototal());
			
			obj.close();
			
		}catch (Exception e) {
		
			 System.out.println(e.toString());
		}

	}

}
