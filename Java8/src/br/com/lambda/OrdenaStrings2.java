package br.com.lambda;
import java.util.Arrays;
import java.util.List;

public class OrdenaStrings2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Thiago","Willian","Elton","Douglas","Miguel");

		list.forEach(s -> System.out.println(s));

		list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		list.forEach(s -> System.out.println(s));
	}
}
