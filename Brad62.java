package tw.com.google.www_0904;

import java.util.Iterator;
import java.util.TreeSet;

public class Brad62 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();
		//TreeSet不重複無法排序但可以排序
		//0904_5_12min
		
//		HashSet set = new HashSet<>();
		//HastSet不重複無法排序
		
//		set.add(12);
//		
//		set.add("john");
//		
//		set.add(12.7);
//		
//		set.add(true);

		//只能存取物件資料，不能存取基本型別
		//沒有重複性(除了不同的new物件)和順序性
		//autoboxing觀念
		//0904_4_1hr06
		
//		System.out.println(set.size());
		
		while(set.size()<6){
			
			set.add((int)(Math.random()*49+1));
			
		}
		
		System.out.println(set);
		
		//迭代器
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			
			Object obj = it.next();
			
			System.out.println((Integer)obj);
		}
		
		System.out.println("--------");
		
		//使用foreach方式檢視資料結構(較方便)
		
		for(Object obj:set){
			
			System.out.println((Integer)obj);
		}

	}

}
