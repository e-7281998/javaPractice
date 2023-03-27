package ch17;

import java.util.Arrays;
import java.util.List;

public class Check05 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expresstions",
				"Java8 supports lambda expressions"
				);

		list.stream()
			.filter(s -> s.toLowerCase().contains("java"))
			.forEach(s -> System.out.println(s));
			
	}
}
