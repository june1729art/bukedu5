package collectioin;

import java.util.*;

public class Sample1 {
	public static void main(String[]args) {
		//리스트 : 순서가 엄격하게 부여된 집합 데이터, 순번(index)가 검색의 기준접이다.
		//      기준접이 존재 하기 때문에 중복 데이터를 용항디.
		//java collection 은 interface이기 띠문에 직법 객작 할 수 없도 
		//implements 되어 있는 준비된 class 를 겍채로 조립하여 사옹항다.
		List<String> L = new ArrayList<String>();//<>을 없에애면 error 발생, 객테체외 집합이 바뀐다.//사용시 String 으로 바꾸어야 한다.
		L.add("홍길도");
		L.add("이영준");
		L.add("김철수");
		L.add(1,"김북부");
		System.out.println(L);
		
		List<String> L2 = new ArrayList<String>();
		L2= new ArrayList();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		
		L.addAll(2,L2);
		System.out.println(L);
		System.out.println(L2);
		
		
		//네이터를 입력할 때9네는 add() 로 입력하고 꺼내놀 때는 get() 가져 온다
		System.out.println(L.get(5));
		
		// 리스트에서 테이터의 수를 확인 할 때는 length 가 아니거ㅗ size()
		//collection은 사용방법이 딱 정해져 있어서 사용할 때 주의 하여하 한다.
		
		System.out.println(L.size());
		
		//일반 for 문
		for(int i=0; i<L.size(); i++){
			System.out.println(L.get(i)+"\t");
		}
		System.out.println();//위쪽이랄 구별되는 용도
		
		//향상된 for문 
		//for(변수:집합){집합 운행시 마다 1 단위씩 수행할 문장 }
		
		for (String str:L) {
			System.out.print(str+"\t");
		}
	}

}
