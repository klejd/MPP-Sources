package prob1;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static List<Student> obtainHonorRoll(List<Student> undergrads) {
		return undergrads.stream()
			    .filter(s -> (s.getGpa() > 3.0))
		        .filter(s -> (s.getMajor().equals(Majors.CS)))
			    .collect(Collectors.toList());

	}

	public static void main(String[] args) {
		@SuppressWarnings("serial")
		List<Student> list = new ArrayList<Student>() {
			{
				add(new Student("Joe", 3.2, Majors.CS));
				add(new Student("Tom", 3.5, Majors.CH));
				add(new Student("HeLing", 2.9, Majors.CS));
				add(new Student("Pierre", 2.8, Majors.ENG));
				add(new Student("Ihaku", 3.9, Majors.CS));
				add(new Student("Richard", 2.8, Majors.CS));
			}
		};
		//System.out.println(list);
		System.out.println(obtainHonorRoll(list));

	}

}
