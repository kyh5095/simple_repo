package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		// ArrayList 객체를 저장하기위한 배열
		
		list1.add(10); // ArrayList 에는 객체밖에 못들어온다
						// 10은 기본형이지만 알아서 wrapper클래스이용 박싱 후 저장을해준다 
		
		list1.add(new Integer(5)); // 정확히는 이렇게 박싱해줘야한다
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// subList : arrayList에서 일부를 뽑아서 새로운 배열을 생성
		ArrayList list2 = new ArrayList(list1.subList(1,4));
												// 1번인덱스이상 4번인덱스미만
		print(list1,list2);
		
		// Collection : 인터페이스 / Collections : 유틸 클래스		
		// 오름차순 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		// reverse() : 배열 순서를 거꾸로 뒤집어준다
		// 오름차순정렬(sort()) 후 뒤집어주기 -> 내림차순
		Collections.reverse(list1);
		print(list1, list2);
		
		// contains() : 해당 요소가 포함되어있는지
		// containsAll() : 해당 요소가 모두 포함되어있는지 확인
		// list2 값들이 list1에 전부 포함되어있는지
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		
		// add() : 내용을 추가. 위치(인덱스)도 지정가능
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 3번인덱스에 A추가
		print(list1, list2);
		
		// set() : 해당 위치(인덱스)에 있는 내용을 변경
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		// indexOf() : 지정된 객체의 위치(인덱스)를 알려줌
		System.out.println("index = "+list1.indexOf("1")); //문자 1
		System.out.println("index = "+list1.indexOf(1)); // 숫자 1
		print(list1, list2); // 문자 숫자 구별해서 찾아준다
		
		
		// remove() : 해당 인덱스의 값이 삭제
		list1.remove(1); // 1번 인덱스의 값이 삭제가 된다
		list1.remove(new Integer(1)); // 객체로 넣게되면 해당값의 숫자1이 삭제된다
		print(list1, list2);
		
		// retainAll() : 겹치는 값만 남기고 나머지는 모두 삭제
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1, list2);	// list1의 값 중 list2와 중복값은 남기고 나머지 삭제한다
		
		// get() : 해당 인덱스의 값을 불러온다
		// list2 에서 list1 과 겹치는 부분을 삭제
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) // list2의 값이 list1에 포함되어있는지
				list2.remove(i);		
		}
		print(list1, list2);
		
		
		// 전체삭제가 안된다. 삭제할때마다 size가 줄어들기때문
//		for(int i=0; i<list2.size(); i++) { // 컬렉션에서는 길이가 length()가 아니라
//			list2.remove(i);				// size()로 작성한다
//		}
//		// 전체삭제 : 마지막인덱스부터 삭제한다
//		for(int i=list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
//		print(list1, list2);
		
	}
	
	// 출력하기 위한 메서드
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}
