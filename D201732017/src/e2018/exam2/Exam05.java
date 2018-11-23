package e2018.exam2;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;

public class Exam05 {

	static void removeEvenNumbers(Collection<Integer> c) {
		Iterator<Integer> i = c.iterator();

		while(i.hasNext()) {
			int j = i.next();
			if(j %  2 == 0) i.remove();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new ArrayList<Integer>(); 

		for (int i = 0; i < 10; ++i) 
			c.add(i); 

		removeEvenNumbers(c); 
		System.out.println(c.toString());
	}

}
