package ch17;

import java.util.Arrays;
import java.util.List;

class Member{
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class Check06 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("김기범", 30),
				new Member("한기범", 40),
				new Member("신기범", 26)
				);
		
		double avg = list.stream()
						 .mapToInt(s -> s.getAge())
						 .average()
						 .getAsDouble();
		
		System.out.println("평균 나이 : " + avg);
	}
}
