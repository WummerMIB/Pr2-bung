package randomNum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testgenerateRandomNumber() {
		Main mi = new Main();
		for(int i = 0; i<= 10000; i++) {
			int x = mi.generateRandomNumber();
			if(x == 30) {
				assertEquals(x, 30);
			}
			if(x == 15) {
				assertEquals(x, 15);
			}
			if(x <15) {
				
			}
		}
		
	}

}
