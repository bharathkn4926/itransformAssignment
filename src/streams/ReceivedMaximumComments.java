package streams;

import java.util.ArrayList;
import java.util.List;

public class ReceivedMaximumComments {

	public static void main(String[] args) {
		News news1 = new News(123, "Naman", "Raj", "International");
		News news2 = new News(321, "Aman", "Ram", "Budget");
		News news3 = new News(215, "Kamal", "Vipin", "Sports");
		News news4 = new News(128, "Himanshu", "Vinod", "Budget");
		News news5 = new News(123, "Deepika", "Vinita", "Finance");
		News news6 = new News(128, "Deepak", "Muskan", "Finance");
		News news7 = new News(128, "Ram", "Himani", "Finance");
		News news8 = new News(128, "Rahul", "Harsh", "Finance");
		List<News> news = new ArrayList<News>();

		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		news.add(news5);
		news.add(news6);
		news.add(news7);
		news.add(news8);

		int n = news.stream().min((p1, p2) -> {
			return (int) p1.getNewsId() + p2.getNewsId();
		}).get().getNewsId();

		System.out.println("News id with max number of comments is" + n);

	}

}
