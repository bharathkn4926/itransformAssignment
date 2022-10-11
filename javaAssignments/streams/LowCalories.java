package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowCalories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("Gauva", 98, 200, "red"));
		fruits.add(new Fruit("Orange", 102, 120, "orange"));
		fruits.add(new Fruit("apple", 97, 150, "red"));
		fruits.add(new Fruit("Banana", 108, 40, "green"));
		fruits.add(new Fruit("Papaya", 88, 50, "yellow"));
		fruits.add(new Fruit("Water Melon", 107, 90, "red"));

		List<Fruit> result = fruits.stream().filter(s -> (s.getCalories() < 100))
				.sorted((p1, p2) -> p2.getCalories().compareTo(p1.getCalories())).collect(Collectors.toList());

		System.out
				.println("Fruits having calories less than 100 and sorted in descending order according of calories :");
		result.forEach(System.out::println);

	}

}
