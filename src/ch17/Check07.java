package ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Member2{
	private String name;
	private String job;
	public Member2(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
}

public class Check07 {
	public static void main(String[] args) {
		List<Member2> list = Arrays.asList(
					new Member2("최민호", "개발자"),
					new Member2("이민호", "디자이너"),
					new Member2("한민호", "개발자")
				);
		
		List<Member2> developers = list.stream()
									 .filter(s -> s.getJob().equals("개발자"))
									 .toList();
		developers.stream()
				  .forEach(s -> System.out.println(s.getName()));
									 						 
	}
}
