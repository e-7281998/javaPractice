package ch17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Member3{
	private String name;
	private String job;
	public Member3(String name, String job) {
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(name).append(", job=").append(job).append("]");
		return builder.toString();
	}
	
}

public class Check08 {
	public static void main(String[] args) {
		List<Member3> list = Arrays.asList(
				new Member3("최민호", "개발자"),
				new Member3("이민호", "디자이너"),
				new Member3("한민호", "개발자")
				);
		
		Map<String, List<Member3>> groupingMap = list.stream()
													 .collect(
														Collectors.groupingBy(s -> s.getJob())
															 );
		System.out.println("[개발자]");
		for(Member3 mb : groupingMap.get("개발자")) {
			System.out.println(mb.toString());
		}
		
		System.out.println("[디자이너]");
		for(Member3 mb:groupingMap.get("디자이너")) {
			System.out.println(mb.toString());
		}
		
	}
}
