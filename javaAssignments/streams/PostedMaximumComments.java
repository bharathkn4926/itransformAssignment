package streams;

import java.util.ArrayList;
import java.util.List;

public class PostedMaximumComments {

	public static void main(String[] args) {
		News news1 = new News(123,"Rajan","Raj","International");
		News news2 = new News(120,"Lakshmi","Raj","Budget");
		News news3 = new News(145,"Bharath","Raj","International");
		News news4 = new News(321,"Aman","Ram","Budget");
		
		News news6 = new News(128,"Himanshu","Vinod","Budget");
		News news7 = new News(190,"Deepika","Vinita","Finance");
		News news8 = new News(176,"Kalyan","Raj","International");
		News news9 = new News(189,"Kishan","Raj","Budget");
		
		List <News> news = new ArrayList<News>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		
	    news.add(news6);
		news.add(news7);
		news.add(news8);
		news.add(news9);
		
		System.out.println(" user who posted maximum comments");
	 	String  n=news.stream()
		.max((p1,p2)-> {
			return (int) p1.getCommentByUser().compareTo(p2.getCommentByUser());
			}).get().getCommentByUser();
	 	System.out.println(n);

	}
}
