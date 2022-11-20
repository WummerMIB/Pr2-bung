package pr2EnumVerschar;

public class Student {

	private String name;
	private String nachname;
	private int matrikelNummer;

	public Student(String name, String nachname, int matrikelNummer) {
		super();
		this.name = name;
		this.nachname = nachname;
		this.matrikelNummer = matrikelNummer;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return this.name + " " + this.nachname + " " + this.matrikelNummer;
	}

	public int getMatrikelNummer() {
		return matrikelNummer;
	}

	public void setMatrikelNummer(int matrikelNummer) {
		this.matrikelNummer = matrikelNummer;
	}
	
	public static class Exmat {
		public String toString() {
			return "raus";
		}
		
		public String oops() {
			return "doch wider drin";
		}
	}
		
}
