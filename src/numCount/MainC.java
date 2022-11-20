package numCount;

import java.util.HashMap;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		numberCountList();
	}

	public static void numberCountList() {
		HashMap<Integer, WordCount> wordCount = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] rt = input.split(" ");
		
		
		int max = wordCount.size();
		Scanner sc1 = new Scanner(System.in);
		String input1 = sc.nextLine();
		for (int z = 0; z < wordCount.size(); ++z) {
			if (input1.equals(wordCount.get(z).getWord())) {
				System.out.println(wordCount.get(z).getCount());
			}
		}
	}
}
