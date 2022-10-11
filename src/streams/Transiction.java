package streams;

public class Transiction {
	
	Trader trader;
	int year;
	Integer value;
	public Transiction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public Integer getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Transiction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	

}
