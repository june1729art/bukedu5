package collection;

import java.util.*;

public class Sample2 {
	public static void main(String[]args) {
		//ArrayList : 배열과 유사한 형태로 구현도니 리스트  //** 5,000,000
		//LinkedList : 인근된 값의 검색에  특화된 리스트
		LinkedList LL= new LinkedList();
		LL.add("A");
		LL.add("B");
		LL.add("C");
		LL.add("D");
		LL.add("E");
		LL.addFirst("Z");
		LL.addLast("가");
		LL.removeFirst();
		LL.removeLast();
		System.out.println(LL);
	}

}
