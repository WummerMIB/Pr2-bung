package pr2EnumVerschar;

public class MainVers {

	public static Student st;
	public static Student st1;
	public static void main(String[] args) {

		st = new Prof("Bob", "Bobs", 2222) {
			public void bonusGehalt(int bonus) {
				bonus = ((Prof) st).getGehalt() + bonus + bonus;
				((Prof) st).setGehalt(bonus);
			}

			public String toString() {
				return "Wegen gefeuert" + " " + ((Prof) st).getGehalt();
			}
		};
		((Prof) st).bonusGehalt(500);

		System.out.println(((Prof) st).getGehalt());
		System.out.println(st.toString());

		// überschreiben on the fly add Konstruktor ?
		// kann man methoden nur überschrein keine neuen anlegen st1.noteGet wird nicht gefunden ?
		st1 = new Student("To") {
			private int note;

			public int noteGet() {
				 this.note = 4;
				 return this.note;
			}
		};

		Student.Exmat stExmat = new Student.Exmat() {
			public String toString() {
				return "Wie gehts";
			}
		};
		System.out.println(stExmat.toString());
		System.out.println(stExmat.oops());
	}
}
