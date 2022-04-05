package liviu.app;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Locale;

import liviu.data.Drink;
import liviu.data.Food;
import liviu.data.Product;
import liviu.data.ProductManager;
import liviu.data.Rating;


public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm = new ProductManager(Locale.UK);
		Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED );
		pm.printProductReport(p1);
		p1 = pm.reviewProduct(p1, Rating.FOUR_STAR,	"Nice hot cup of tea");
		p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Rather weak tea");
		p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
		p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
		p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea");
		p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon" );
		pm.printProductReport(p1);
		
		Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED );
		p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok ");
		p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is the milk ");
		p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "It ' s perfect with ten spoons of sugar ");
		pm.printProductReport(p2); 
		
		Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2) );
		 p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "Very nice cake");
		 p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "It good, but I've expected more chocolate");
		 p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "This cake is perfect");
		pm.printProductReport(p3);
		
		Product p4 = pm.createProduct(104, "Cookie", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now() );
		p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "Just another Cookie");
		p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "ok");
		pm.printProductReport(p4);
		
		Product p5 = pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
		p5 = pm.reviewProduct(p5, Rating.FIVE_STAR, "Tasty");
		p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "Not bad at all");
		pm.printProductReport(p5);
		
		Product p6 = pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now() );
		p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too sweet");
		p6 = pm.reviewProduct(p6, Rating.THREE_STAR, "Better than cookie");
		p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too bitter");
		p6 = pm.reviewProduct(p6, Rating.ONE_STAR, "I don't get it");
		pm.printProductReport(p6);
//		Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2) );
//		Product p8 = p4.applyRating(Rating.FIVE_STAR);
//		Product p9 = p1.applyRating(Rating.TWO_STAR);
//		
//		System.out.println(p6.equals(p7));
//		System.out.println(p1.getBestBefore());
//		System.out.println(p3.getBestBefore());
		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
//		System.out.println(p5);
//		System.out.println(p6);
//		System.out.println(p7);
//		System.out.println(p8);
//		System.out.println(p9);





	}

}
