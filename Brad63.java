package tw.com.google.www_0904;

import java.util.LinkedList;

public class Brad63 {

	public static void main(String[] args) {
		
		//List最常實作：LinkedList(變動頻繁建議使用)、ArrayList(變動較少適用)，兩者基本上沒有差異。
		//list可以重複且有順序性
		
		LinkedList list = new LinkedList();
		
		list.add(12);
		
		list.add("john");
		
		list.add("john");
		
		list.add(12);
		
		list.add(2,"iii");
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		for(Object obj:list){
			
			System.out.println(obj);
		}
		
		

	}

}
