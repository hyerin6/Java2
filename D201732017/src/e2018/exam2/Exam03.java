package e2018.exam2;

import java.util.Arrays;

public class Exam03 {

	// compareIdentity 메소드: identity 비교 결과를 리턴
	static boolean compareIdentity(Person[] a1, Person[] a2) {
		return a1 == a2; 
	}

	static boolean compareEquality(Person[] a1, Person[] a2) {
		return Arrays.equals(a1, a2); // Person 클래스에 equals 재정의함
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] a1 = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) }; 
		Person[] a2 = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };

		System.out.println(compareIdentity(a1, a2));
		System.out.println(compareEquality(a1, a2));
	}

}
