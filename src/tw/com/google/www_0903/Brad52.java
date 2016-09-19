package tw.com.google.www_0903;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brad52 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file 
			
					= new FileInputStream("dir/john.csv");
			
			InputStreamReader read = new InputStreamReader(file);
			
			BufferedReader read2 = new BufferedReader(read);
			
			String line = read2.readLine();
			
//			String[]read3 = line.split(",");
			
//			System.out.println(read3.length);
			
//			for(String data:read3){
//				
//				System.out.println(data);
//				
//			}
			
			while((line=read2.readLine())!=null){
				
				String[]read3 = line.split(",");
				
				//System.out.println(read3.length);
				
				for(String data:read3){
					
					System.out.println(data);
					
				}
				
				
			}
			
			file.close();
			
		} catch (IOException e) {
			
			System.out.print(e.toString());
			
		}

	}

}
