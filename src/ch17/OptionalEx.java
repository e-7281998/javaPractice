package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//방법1
		OptionalDouble optional = list.stream()
									  .mapToInt(Integer::intValue)
									  .average();
		if(optional.isPresent())
			System.out.println("방법1) 평균있음 => " + optional.getAsDouble());
		else
			System.out.println("방법1) 평균없음");
		
		//방법2
		double avg = list.stream()
						 .mapToInt(Integer::intValue)
						 .average()
						 .orElse(0.0);
		System.out.println("방법2) 평균"+avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3) 평균 =>" + a));
	}
	
	//결과
	//방법1) 평균없음
	//방법2) 평균0.0
}
