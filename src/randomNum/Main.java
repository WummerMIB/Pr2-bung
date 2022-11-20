package randomNum;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i<=1000;i++ ) {
			System.out.println(generateRandomNumber());
		}
	}
	
	
	
	public static int generateRandomNumber() {
		int randNum = (int)(Math.random()*16)+15;
		return randNum;
	}

}
