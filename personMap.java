package Task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.omg.CORBA.PUBLIC_MEMBER;

public class personMap {
	public static void main(String[] args) {
		Map<String, String> person = new HashMap<String, String>();
		person.put("Miroshnychenko", "Bogdan");
		person.put("Kozak", "Bogdan");
		person.put("Ivanov", "Maksym");
		person.put("Zozylia", "Olesia");
		person.put("Kit", "Marika");
		person.put("Gryb", "Oksana");
		person.put("Moroz", "Oksana");
		person.put("Lis", "Rostik");
		person.put("Jobs", "Stiv");
		person.put("J", "Lo");
		System.out.println(person);

		for (Object key1 : person.keySet()) {
			
			for (Object key2 : person.keySet()) {
				if (!key1.toString().equals(key2.toString())) {
					String x = person.get(key1);
					String y = person.get(key2);
					if (x == y) {
						person.remove(key2);
					}
					System.out.println(person);
				}
			}
		}
	}
}
