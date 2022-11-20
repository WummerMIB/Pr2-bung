package pr2EnumVerschar;

public class MainStat {

	public static void main(String[] args) {

		final String ausgabe = "Ich bin lokal";

		StaticMember äussere = new StaticMember();
		StaticMember.InnereKlasse innere = new StaticMember.InnereKlasse();
		StaticMember.InnereKlasse.InnereInnereKlasse innereIn = new StaticMember.InnereKlasse.InnereInnereKlasse();
		System.out.println(äussere);
		System.out.println(innere);
		System.out.println(innereIn);

		class LocalClass {
			public String toString() {
				return ausgabe;
			}
		}
		
		LocalClass local = new LocalClass();
		System.out.println(local.toString());
	}
}
