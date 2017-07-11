
public class mainPerson {

	public static void main(String[] args) {

		Person p[] = new Person[5];
		p[0] = new Students();
		p[1] = new Teachers();
		p[2] = new Cleaners();
		p[3] = new Students();
		p[4] = new Students();

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].print());
			if (p[i] instanceof Staff) {
				System.out.println(p[i]);
			}

		}
	}
}
