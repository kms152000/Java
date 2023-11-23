package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
			/*//예외 발생(java.util.NoSuchElemetException)
			double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
			 
			 */
		
		
		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();
		if (optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: " + );
		}
			
	}
}
