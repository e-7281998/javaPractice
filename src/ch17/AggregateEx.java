package ch17;

import java.util.Arrays;

public class AggregateEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//카운팅
		long count = Arrays.stream(arr)
							.filter(n -> n%2==0)
							.count();
		System.out.println(count);
		
		//총합
		long sum = Arrays.stream(arr)
						 .filter(n -> n%2==0)
						 .sum();
		System.out.println(sum);
		
		//평균
		double avg = Arrays.stream(arr)
							.filter(n -> n%2==0)
							.average()
							.getAsDouble();
		System.out.println(avg);
		
		//최대값
		int max = Arrays.stream(arr)
						.filter(n -> n%2==0)
						.max()
						.getAsInt();
		System.out.println(max);
		
		//최소값
		int min = Arrays.stream(arr)
						.filter(n -> n%2==0)
						.min()
						.getAsInt();
		System.out.println(min);
		
		//첫 번째 요소
		int first = Arrays.stream(arr)
						  .filter(n ->n%3==0)
						  .findFirst()
						  .getAsInt();
		System.out.println(first);
	}
}