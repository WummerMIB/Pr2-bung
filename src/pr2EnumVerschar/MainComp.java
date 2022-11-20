package pr2EnumVerschar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComp {

	public static void main(String[] args) {
		
		List<Student> studenten = new ArrayList<>();
		studenten.add(new Student("Boob", "Obbo", 20001));
		studenten.add(new Student("Otto", "Toot", 20000));
		studenten.add(new Student("Peter", "Pahn", 2000));
		
		studenten.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getMatrikelNummer() - o1.getMatrikelNummer();
			}
		});
		
		for(Student s : studenten) {
			System.out.println(s.toString());
		}
	}
}
