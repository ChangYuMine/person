package tw.com.google.www._0903;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad55 {

	public static void main(String[] args) {
		
		student s1 = new student(new Bike(),"john",90,50,75);
		
		student s2 = new student(new Bike(),"allen",80,70,45);
		
	
		
		try {
			ObjectOutputStream obj1 
			
			= new ObjectOutputStream
			
			(new FileOutputStream("dir/student.john"));
			
			obj1.writeObject(s1);
			
			obj1.writeObject(s2);
			
			obj1.flush();
			
			obj1.close();
		
		} catch (IOException e) {
			
			System.out.println(e.toString());
		
		}
		
	}

}

class student implements Serializable{
	
	String name;
	
	Bike bike;
	
	int cha;
	
	transient int eng;
	
	int math;
	
	student(Bike bike,String name,int cha,int eng,int math){
		
		this.cha=cha;
		
		this.eng=eng;
		
		this.math=math;
		
		this.name=name;
		
		this.bike=bike;
	}
	
	int dototal(){return cha+eng+math;}
	
	double dototal2(){return dototal()/3.0;}
}
class Bike implements Serializable{
	
}
