package Task1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<Human> setHuman = new LinkedHashSet<>();
		setHuman.add(new Human("Igor", 28));
		setHuman.add(new Human("Natali", 21));
		setHuman.add(new Human("Taras", 24));
		setHuman.add(new Human("Leonid", 60));
		setHuman.add(new Human("Anna", 23));

		for (Human human : setHuman) {
			System.out.println(setHuman);
		}

		System.out.println();

		TreeSet<Human> setHuman1 = new TreeSet<>(new HumanComparator());
		setHuman1.add(new Human("Igor", 28));
		setHuman1.add(new Human("Natali", 21));
		setHuman1.add(new Human("Taras", 24));
		setHuman1.add(new Human("Leonid", 60));
		setHuman1.add(new Human("Anna", 23));

		for (Human human : setHuman1) {
			System.out.println(setHuman1);
		}

	}
}
