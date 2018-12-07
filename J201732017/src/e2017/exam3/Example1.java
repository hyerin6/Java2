package e2017.exam3;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*
 * 배열을 list로 만들 때 Arrays.asList(...)을 사용하는데 단점을 발견했다. 
 * 이렇게 만들어지는 list는 unmodifiable이라 하며 remove 및 add를 할 수 없다. 
 * strArrays라는 String 배열이 있다고 가정하자. 
 * 
 * 1. List<String> strList = Arrays.asList(strArrays);
 * 
 * 2. List<String> list = new ArrayList<>();
 *    Collections.addAll(strList, strArrays);
 *    >> 이 예제에서는 collection 타입이 필요하여 2번으로 구현
 *    
 * 3. List<String> strList = new ArrayList<>(Arrays.asList(strArrays));
 *    
 * 1번은 remove/add에 Exception이 발생하고(UnsupportedOperationException)
 * 2번은 reference가 그대로 전해진다.
 * 3번은 copy이기 때문에 reference는 없어지지만 불필요하게 2개 생성되는 케이스가 될 수 있다.
 */

public class Example1 {

	static List<String> solution(String[] a1, String[] a2, String[] a3) { 
		// a1 배열, a2 배열, a3 배열의 교집합을 계산해서 리턴

		// retainAll 메소드 사용하기 
		List<String> list = new ArrayList<>();
		Collections.addAll(list, a1);

		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2, a2);

		List<String> list3 = new ArrayList<>();
		Collections.addAll(list3, a3);

		list.retainAll(list2);
		list.retainAll(list3);

		// for문 사용하여 직접 검사
		List<String> strList = Arrays.asList(a1);
		List<String> strList2 = Arrays.asList(a3);
		List<String> output = new ArrayList<>();

		for(int i = 0; i < strList.size(); ++i) {
			if(list.contains(a2[i]) && strList2.contains(a2[i]))
				if(!output.contains(a2[i]))
					output.add(a2[i]);
		}

		// return list;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a1 = { "A", "B", "D", "F", "G" }; 
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };

		System.out.println(solution(a1, a2, a3));

	}

}
