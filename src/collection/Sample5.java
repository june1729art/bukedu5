package collection;

import java.util.*;

public class Sample5 {
	public static void main(String[]args) {
		//List : 숨서 엄격, 준복 허락
		//Set : m숨서 없음, 중복 불가ㅓ
		//Map ; 검색어(key) 와 값(value)이 한 쌍으ㅜ로 저장하는 방법
		//    데이터의 검색이 편해서 개발에 야ㅐ용하기 좋은 . **5,000,000
		//      ㄱ국순거는 존재하지 않고 value는 두중복이 가능하지만 key 는 중복될 수 없다.
		Map<String, Student> m=new HashMap<String, Student>();
		//Map<key, value); 제네릭 지더절시 정 시   두개ㅐ를 지정하녀얄 ㅏㄷㄴ다
		//Map.put(key,value); key 와 value를 한 쌍으로 묵ㄱ어 제대데이터 닐입력
		//Map.get(key);  검ㅅ객어르 ㄹ기중으로 해당하는 value 를 출력
		m.put("B", new Student ("김철수",105));
		m.put("A", new Student ("이영준",110));
		m.put("C", new Student ("홍길동",65));""
		m.put("D", new Student ("김북부",500));
		//m.put("E", 100);//value는 중복회어도 상관 없다.
		//m.put("C", 999);// key는 종복괴면 이전의 갑이 소멸 도니다.
		System.out.println(m);
		System.out.println(m.get("B"));
		//Map 을 for 운으로 운행하기 위해서은 key 들어가 잇은 Set 을 추출한 뒤에 사용하여아 한다.
		
	}

}
class Student{
	String name;
	int number;
	Student(String a, int b){
		name=a;
		number=b;
	}
	//System.out.println(Object);
	//메개변수로 전달된 Object는 Object.toString()을 수핼한 결고물을 콘솔에 줄력하게 된다.
	//따라서 객체 내부의 toString()을 오버라이드하면 원하는 내용이 콘솔에 출력하게 수정 가능하다.
	//extends 부분이 적히지 않은 모든 class 는 extends Object 와 같으므로 println 의 매개 번수로 전달 가능하다.
	public String toString() {
		return "["+name+":" +number+"]";
	}
}
