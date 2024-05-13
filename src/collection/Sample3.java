package collection;

import java.util.*;

public class Sample3 {
	public static void main(String[]args) {
		//set: 순서 없는 데이트 집합, 데이터의 중복을 허락하지 않는다.
		//Set 억시 interface 이므로 implements 가 된 class 로 허용해야 한ㄷ,
		
		Set s=new HashSet();
		boolean result;
		s.add("apple");
		s.add("mango");
		s.add("grape");
		s.add("grape");
		s.add("orange");
		result= s.add("apple");//중복 허용//표시느 않됨
		s.add(null);
		s.add("null");//구별 않됨//가ㅜㄱㅂ급적 문다 null 은 사용하지 마세요. 구별이 안ㅀ됨
		System.out.println(s);
		System.out.println(result);
		result= s.add("bear");
		System.out.println(result);//새로 데이터가 잘 들어가 경우 true
		
		//set의 for 문을 통한 운행
		//배열로 변경해서 for 문으로 출력하는 방법
		
		String[] array = new String[s.size()];//set 과 동일한ㅇ 배열을 준비
		s.toArray(array);                      //set 의 내용물을 옮겨적기 (index가 부여됨)
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//list로 변환해서 for 문으로 풀력하는 방번
		 List<String> L=new ArrayList<String>(s);
		 System.out.println(L);
		 for(int i=0; i<L.size(); i++) {
			 System.out.println(L.get(i));
			 
		 }	 
		// 향샹된 for 믄은 이욯하는방법, set 데이텨도 iterator가 존재 하므오 향샹된 for 문울 사용사능	
		 //**
		 
		for(String str:s) {
			System.out.println(str);
		}	
		
		//iterator 를 이욯해서 촐력하는 방법
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}  


