package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Product 
{
	int productId;
	String productName;
	
	

	public Product(int productId, String productName) {
		
		this.productId = productId;
		this.productName = productName;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}



	public static void main(String[] args)
	{
		Product p1=new Product(1,"Pen");
		Product p2=new Product(2,"Book");
		Product p3=new Product(3,"Sheet");
		Product p4=new Product(4,"Bike");
		Product p5=new Product(5,"Car");
		Product p6=new Product(6,"Board");
		Product p7=new Product(7,"Bat");
		Product p8=new Product(8,"Ball");
		Product p9=new Product(9,"Mike");
		Product p10=new Product(10,"Movie");
		
		
		
		HashSet<Product> list=new HashSet<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		list.add(p10);
		
		  Iterator<Product> i=list.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
		

	}

}
