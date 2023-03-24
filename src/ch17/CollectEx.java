package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2{
	private String name;
	private String gender;
	private int score;

	public Student2(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getScore() {
		return score;
	}
}

public class CollectEx {
	public static void main(String[] args) {
		List<Student2> totalList = new ArrayList<>();
		totalList.add(new Student2("홍길동", "남", 90));
		totalList.add(new Student2("강길동", "남", 100));
		totalList.add(new Student2("상길동", "남", 40));
		totalList.add(new Student2("이길동", "여", 80));
		
		//스트림에서 리스트 컬렉션 얻기 : toList();
		List<Student2> maleList = totalList.stream()
											.filter(s -> s.getGender().equals("남"))
											.toList();
		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("=======================================");
		
		//학생 이름을 키, 점수를 값으로 갖는 map생성
		Map<String, Integer> map = totalList.stream()
											.collect(
												Collectors.toMap(
														s -> s.getName(),	//key
														s -> s.getScore()	//value
														)
													);
		System.out.println(map);
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");

		Map<String, List<Student2>> map2 = totalList.stream()
													.collect(
														Collectors.groupingBy(s -> s.getGender())
															);
		List<Student2> maleList2 = map2.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println("=======================================");

		List<Student2> femaleList = map2.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		
	}
}
