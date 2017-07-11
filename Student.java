package Task3;

import java.util.Comparator;

public class Student {
	String name;
	int course;

	static NameComparator nameComparator = new NameComparator();

	static CourseComparator courseComparator = new CourseComparator();

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
		return;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static void setNameComparator(NameComparator nameComparator) {
		Student.nameComparator = nameComparator;
	}

	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}

	public static void setCourseComparator(CourseComparator courseComparator) {
		Student.courseComparator = courseComparator;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
}
