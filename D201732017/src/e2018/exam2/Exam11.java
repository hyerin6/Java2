package e2018.exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Exam11 {

	static class Data { 
		String value;

		public Data(String value) {
			this.value = value.toUpperCase();
		} 

		// equals 재정의해야 비교가 가능하다. 
		// -> 비교해야 하는 메소드를 사용하려면(remove) equals 메소드를 재정의 해야한다.
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Data == false) 
				return false;
			Data d = (Data)obj;
			return Objects.equals(value, d.value);
		}

		@Override
		public String toString() {
			return String.format("Data(\"%s\")", value);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Data> a = new ArrayList<Data>();
		a.add(new Data("a"));
		a.add(new Data("b")); 
		a.add(new Data("c"));

		a.remove(new Data("B"));
		System.out.println(a.toString());
	}

}
