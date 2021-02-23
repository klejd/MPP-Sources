package prob6;

import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
private List<Course> courseList = new ArrayList();
PlanOfStudy(){} 
public void  addCourse(Course course) {
	courseList.add(course);			
}
public List<Course> getCourseList() {
	return courseList;
}

}
