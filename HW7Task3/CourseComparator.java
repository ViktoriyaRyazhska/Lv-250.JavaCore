package Task3;

import java.util.Comparator;

public class CourseComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
		    return ((Student)o1).course - ((Student)o2).course;
		  }
		}

