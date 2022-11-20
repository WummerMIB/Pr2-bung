package hashMa;

import java.util.Collection;
import java.util.HashMap;

public class MainH {
	
	public static void main(String[] args) {
		HashMap<Integer,String> ubung = new HashMap<>();
		ubung.put(1,"Hi");
		ubung.put(2,"was");
		ubung.put(3,"geht");
		ubung.put(4,"ab");
		
		Collection<String> coll = ubung.values();
		int i = 0;
		String[] list = new String[coll.size()];
		for(String s : coll) {
			list[i++] = s;
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
