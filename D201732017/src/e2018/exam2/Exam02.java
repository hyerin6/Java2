package e2018.exam2;

import java.util.Arrays;

public class Exam02 {
	static String toString(Person[] a) {
		// Person 클래스에 toString을 재정의 해야한다.
		return Arrays.toString(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };

		System.out.println(toString(a));
	}

}
