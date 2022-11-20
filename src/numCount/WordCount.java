package numCount;

public class WordCount {
	
	public String word;
	public int count = 0;
	
	public WordCount(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		count++;
	}
	
}
