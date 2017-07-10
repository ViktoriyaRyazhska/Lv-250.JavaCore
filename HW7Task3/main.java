package Task3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class main {
	public static void main(String[] args) {
		
	
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Oksana",1));
		student.add(new Student("Oleg", 2));
		student.add(new Student("Igor", 4));
		student.add(new Student("Petro", 4));
		student.add(new Student("Victor", 5));
	
		Iterator<Student> s = student.iterator();
		 
		  while(s.hasNext()) {
			  Student st = s.next();
		        System.out.println(st);
		    }
				
		Set<Student> student1 = new TreeSet(Student.getCourseComparator());
		student1.addAll(student);
		System.out.println(student1);
		
		Set<Student> student2 = new TreeSet(Student.getNameComparator());
		student2.addAll(student);
		System.out.println(student2);
		

}
}

		
	

