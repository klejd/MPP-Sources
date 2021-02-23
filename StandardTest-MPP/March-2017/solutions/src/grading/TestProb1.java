package grading;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import prob1.Admin;
import prob1.Majors;
import prob1.Student;

public class TestProb1 extends TestCase {
	@SuppressWarnings("serial")
	List<Student> typicalList = new ArrayList<Student>() {
		{
			add(new Student("Joe", 3.2, Majors.CS));
			add(new Student("Tom", 3.5, Majors.CH));
			add(new Student("HeLing", 2.9, Majors.CS));
			add(new Student("Pierre", 2.8, Majors.ENG));
			add(new Student("Ihaku", 3.9, Majors.CS));
			add(new Student("Richard", 2.8, Majors.CS));
		}
	};
	@SuppressWarnings("serial")
	List<Student> typicalListExpectedReturn = new ArrayList<Student>() {
		{
			add(new Student("Joe", 3.2, Majors.CS));
			add(new Student("Ihaku", 3.9, Majors.CS));
		}
	};
	@SuppressWarnings("serial")
	List<Student> allTooLowList = new ArrayList<Student>() {
		{
			add(new Student("Joe", 3.0, Majors.CS));
			add(new Student("Tom", 3.5, Majors.CH));
			add(new Student("HeLing", 2.9, Majors.CS));
			add(new Student("Pierre", 2.8, Majors.ENG));
			add(new Student("Ihaku", 1.9, Majors.CS));
			add(new Student("Richard", 2.8, Majors.CS));
		}
	};
	List<Student> allTooLowListExpectedReturn = new ArrayList<Student>() {
		{
		}
	};
		
	@SuppressWarnings("serial")
	List<Student> noCSList = new ArrayList<Student>() {
		{
			add(new Student("Joe", 3.4, Majors.CH));
			add(new Student("Tom", 3.5, Majors.PH));
			add(new Student("HeLing", 3.9, Majors.SOC));
			add(new Student("Pierre", 3.8, Majors.ENG));
			add(new Student("Ihaku", 2.9, Majors.ENG));
			add(new Student("Richard", 3.8, Majors.PSY));
		}
	};
	List<Student> noCSListExpectedReturn = new ArrayList<Student>() {
		{
		}
	};
	public void testTypicalList() {
		List<Student> result = Admin.obtainHonorRoll(typicalList);
		int correctSize = typicalListExpectedReturn.size();
		assertNotNull(result);
		assertEquals("Expected list size to be " + correctSize, 
				correctSize, result.size());
		assertTrue(hasSameElements(typicalListExpectedReturn, result));
		
	}
	public void testNoCSList() {
		List<Student> result = Admin.obtainHonorRoll(noCSList);
		assertNotNull(result);
		assertTrue("Expected empty list", result.isEmpty());
		
	}
	public void testAllTooLowList() {
		List<Student> result = Admin.obtainHonorRoll(allTooLowList);
		assertNotNull(result);
		assertTrue("Expected empty list", result.isEmpty());
		
	}
	
	private boolean hasSameElements(List<Student> stList1, List<Student> stList2) {
		if(stList1 == null || stList2 == null) return false;
		if(stList1.size() != stList2.size()) return false;
		for(Student s: stList1) {
			boolean found = false;
			for(Student t: stList2) {
				if(s.getName().equals(t.getName())) found = true;
			}
			if(!found) return false;
		}
		return true;
	}
}
