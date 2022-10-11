package streams;
 
public class Fruit {
	String name;
	Integer calories;
	Integer price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public Integer getCalories() {
		return calories;
	}
	public Integer getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
