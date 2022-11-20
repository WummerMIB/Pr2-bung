package pr2EnumVerschar;

public class Prof extends Student {

	public Prof(String name, String nachname, int matrikelNummer) {
		super(name, nachname, matrikelNummer);
		// TODO Auto-generated constructor stub
	}

	private int gehalt = 2000;

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public void bonusGehalt(int bonus) {
		this.gehalt = this.gehalt + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.gehalt;
	}
}
