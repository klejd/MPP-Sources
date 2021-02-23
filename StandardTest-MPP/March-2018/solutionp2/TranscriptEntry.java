package prob6;

import java.time.LocalDate;

public class TranscriptEntry {
private LocalDate dateTaken;
private String grade;
private Course course;
public TranscriptEntry(LocalDate dateTaken, String grade, Course course) {
	super();
	this.dateTaken = dateTaken;
	this.grade = grade;
	this.course = course;
}
public LocalDate getDateTaken() {
	return dateTaken;
}
public String getGrade() {
	return grade;
}
public Course getCourse() {
	return course;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((course == null) ? 0 : course.hashCode());
	result = prime * result + ((dateTaken == null) ? 0 : dateTaken.hashCode());
	result = prime * result + ((grade == null) ? 0 : grade.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TranscriptEntry other = (TranscriptEntry) obj;
	if (course == null) {
		if (other.course != null)
			return false;
	} else if (!course.equals(other.course))
		return false;
	if (dateTaken == null) {
		if (other.dateTaken != null)
			return false;
	} else if (!dateTaken.equals(other.dateTaken))
		return false;
	if (grade == null) {
		if (other.grade != null)
			return false;
	} else if (!grade.equals(other.grade))
		return false;
	return true;
}

}
