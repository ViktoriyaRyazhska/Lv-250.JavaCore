package Task3;

import java.util.Comparator;

public class NameComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
		    return ((Student)o1).name.compareTo(((Student)o2).name);
		  }
		}

