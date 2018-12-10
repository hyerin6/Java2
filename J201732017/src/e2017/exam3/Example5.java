package e2017.exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {

	/*static String[] convertToArray(String s) {
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(s);

		ArrayList<String> list = new ArrayList<>();

		while(m.find())
			list.add(m.group(0));

		return list.toArray(new String[list.size()]);
	}*/

	static String[] convertToArray(String s) {
		s = s.replaceAll("^[^a-zA-Z]+", "");
		s = s.replaceAll("[^a-zA-Z]+$", "");
		return s.split("[^a-zA-Z]+");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
		"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };

		for (String s : a) { 
			String[] t = convertToArray(s);
			System.out.println(Arrays.toString(t));
		}

	}

}
