package tw.com.google.www_0904;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad61 {

	public static void main(String[] args) {
		
		//複製網頁圖片或服務(範例使用轉PDF服務)
		
		long start = System.currentTimeMillis();
		
		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://www.ebooks-cct.com.tw/");
			//URL觀念_0904_4_12min
			
			HttpURLConnection port
			//轉型前：URLConnection
			//參考：0904_4_17min
			
					= (HttpURLConnection)url.openConnection();
			
			port.connect();
			
			InputStream in = port.getInputStream();
			
			FileOutputStream fout = 
					
					new FileOutputStream("upload/john2.pdf");
			
			int a;
			
			while((a = in.read())!=-1){
				
				fout.write(a);
								
			}
			
			fout.flush();
			
			fout.close();
			
			in.close();
			
			System.out.println("OK："+(System.currentTimeMillis()-start));
			
			
		} catch (MalformedURLException e) {
		
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
			
		}
	
//複製網址原始碼		
//		try {
//			URL url = new URL("http://www.ebooks-cct.com.tw");
//			//URL觀念_0904_4_12min
//			
//			HttpURLConnection port
//			//轉型前：URLConnection
//			//參考：0904_4_17min
//			
//					= (HttpURLConnection)url.openConnection();
//			
//			port.connect();
//			
//			BufferedReader read 
//			
//					= new BufferedReader
//					
//							(new InputStreamReader(port.getInputStream()));
//			
//			String line;
//			
//			while((line = read.readLine())!=null){
//				
//					System.out.println(line);
//			}
//			
//			
//			read.close();
//			
//		} catch (MalformedURLException e) {
//		
//			
//		} catch (IOException e) {
//			
//			System.out.println(e.toString());
//			
//		}

	}

}
