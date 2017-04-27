package adt;

public class Counter {
	private String str;
	private int i = 0;

	public Counter(String str) {
		super();
		this.str = str;
	}

	public Counter() {
		// TODO Auto-generated constructor stub
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void increment(){
		i++;
	}

	@Override
	public String toString() {
		return "Counter [str=" + str + ", i=" + i + "]";
	}
	
}
