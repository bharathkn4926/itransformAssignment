package streams;

import java.util.stream.Collectors;
import java.util.*;

public class ColorWise {
	
	public static void main(String[] args) {

	
	List <Fruit> fruits = new ArrayList<>();
	fruits.add(new Fruit("Gauva",98,200,"red"));
	fruits.add(new Fruit("Orange",102,120,"orange"));
	fruits.add(new Fruit("apple",97,150,"red"));
	fruits.add(new Fruit("Banana",108,40,"green"));
	fruits.add(new Fruit("Papaya",88,50,"yellow"));
	fruits.add(new Fruit("Water Melon",107,90,"red"));
	
	Map<Object, List<Fruit>>f=fruits.stream().collect(Collectors.groupingBy(fruit->fruit.getColor()));
	for(Object fi:f.keySet())
		System.out.println(f.get(fi));
		
	}
}
