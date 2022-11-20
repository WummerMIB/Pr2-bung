package pr2EnumVerschar;

public class StaticMember {
	
	public static class InnereKlasse {
		public String toString() {
			return "Ich bin innen";
		}
		
		public static class InnereInnereKlasse {
			public String toString() {
				return "Hallo";
			}
		}
	}
	
	public String toString() {
		return "Ich bin außen";
	}
}
