package ch17;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
					new Student("홍길동", 90),
					new Student("김길동", 95),
					new Student("남길동", 80)
				);
		
		//방법1
		int sum1 = studentList.stream()
							  .mapToInt(Student::getScore)
							  .sum();
		//방법2
		int sum2 = studentList.stream()
							  .map(Student::getScore)
							  .reduce(0, (a,b) -> {
									System.out.println("a:"+a);
									System.out.println("b:"+b);
									System.out.println("==========");
								return a+b;
							  });
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
	}
}
