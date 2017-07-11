package Task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

public class Union {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Union(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Union [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Set<Union> set1 = new HashSet();

		set1.add(new Union(15, "Oxana"));
		set1.add(new Union(14, "Galia"));
		set1.add(new Union(25, "Myrosia"));
		set1.add(new Union(6, "Sofia"));
		set1.add(new Union(7, "Karolina"));

		Iterator<Union> iterator = set1.iterator();
		while (iterator.hasNext()) {
			Union text = iterator.next();
			System.out.println("Student name is " + text.name + ", age -- " + text.age);
		}
		System.out.println();
		System.out.println(set1);

		Set<Union> set2 = new HashSet();
		set2.addAll(set1);
		set2.add(new Union(50, "JLo"));

		Iterator<Union> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Union text2 = iterator2.next();
			System.out.println("Student name is " + text2.name + ", age -- " + text2.age);

		}

	}
}
