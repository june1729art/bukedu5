package collection;

import java.util.*;

public class Sample4 {
	public static void main(String[]args) {
		//LinkedHadhSet: 인접한 ㅈ 데이터간에 링트ㅜ크가 존재하는 방식
		//Set   임에도 ㅅㄴ슌서가 ㄷ존대 하디만 중복게이터은 허용하디 않는다.
		LinkedHashSet LHS=new LinkedHashSet();
		LHS.add("A");
		LHS.add("B");
		LHS.add("C");
		LHS.add("D");
		LHS.add("E");
		LHS.add("A");
		System.out.println(LHS);
//		LHS.add("A");
		
		//TreeSet: 데이터를 저잘할 때 정열하여 저장한, Set 이므로 중복 데이터는 볼가 
		TreeSet TS=new TreeSet();
		TS.add("9");
		TS.add("7");
		TS.add("1");
		TS.add("5");
		TS.add("6");
		System.out.println(TS);
	}

}
