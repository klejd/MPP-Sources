package prob6;

public class Course {
	private String courseTitle;
	private String primaryProfessor;
	
	public Course(String courseTitle, String primaryProfessor) {
		super();
		this.courseTitle = courseTitle;
		this.primaryProfessor = primaryProfessor;
	}
	

	public String getCourseTitle() {
		return courseTitle;
	}


	public String getPrimaryProfessor() {
		return primaryProfessor;
	}


	@Override
	public String toString() {
		// uncomment when ready
		  return courseTitle + ": " + primaryProfessor;
		 
		//return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		if (primaryProfessor == null) {
			if (other.primaryProfessor != null)
				return false;
		} else if (!primaryProfessor.equals(other.primaryProfessor))
			return false;
		return true;
	}
	
}
