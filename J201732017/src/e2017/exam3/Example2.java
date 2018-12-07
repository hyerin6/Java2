package e2017.exam3;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;
public class Example2 {
	static List<String> solution(String[] a1, String[] a2, String[] a3) { 
		// (a1 ∪ a2) - a3

		List<String> list = Arrays.asList(a1);
		List<String> output = new ArrayList<>();

		for(int i = 0; i < list.size(); ++i) {
			output.add(a1[i]);
			if(!list.contains(a2[i])) 
				output.add(a2[i]);
		}

		for(int i = 0; i < a3.length; ++i) {
			if(output.contains(a3[i]))
				output.remove(a3[i]);
		}

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
