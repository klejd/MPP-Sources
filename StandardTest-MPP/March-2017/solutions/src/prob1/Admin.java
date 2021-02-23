package prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> undergrads) {
		return undergrads.stream()
			    .filter(s -> (s.getGpa() > 3.0))
		        .filter(s -> (s.getMajor().equals(Majors.CS)))
			    .collect(Collectors.toList());
	}
}
