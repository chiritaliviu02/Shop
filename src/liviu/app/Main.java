package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;

import liviu.data.ProductManager;
import liviu.data.Rating;

 
public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm = new ProductManager("ro-RO");
//		pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED );
		pm.parseProduct("D,101,Ceai,1.99,0,2022-04-10");
		pm.printProductReport(101);
//		pm.reviewProduct(101 , Rating.FOUR_STAR,	"Nice hot cup of tea");
		pm.parseReview("101,4, O cafea bun\u0103, hmm fierbinte...");
		pm.parseReview("101,2, Se pute mai bine");
		pm.parseReview("101,4, A fost aproape perfect\u0103");
		pm.parseReview("101,4,O sa mai beau cu placere");
		pm.parseReview("101,5, Un ceai perfect");
		pm.parseReview("101,3, Mai trebuia putin\u0103 lamie" );
		pm.printProductReport(101);
		
		pm.parseProduct("F,103,Prajituric\u0103,3.99,0,2022-04-12");
		pm.printProductReport(103);
		
		
		
		
		//pm.changeLocale("ro-RO");
//
//		pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED );
//		pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok ");
//		pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk ");
//		pm.reviewProduct(102, Rating.FIVE_STAR, "It ' s perfect with ten spoons of sugar ");
//		//pm.printProductReport(102); 
//
//		pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2) );
//		pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice cake");
//		pm.reviewProduct(103, Rating.FOUR_STAR, "It good, but I've expected more chocolate");
//		pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect");
//		//pm.printProductReport(103);
//
//		pm.createProduct(104, "Cookie", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now() );
//		pm.reviewProduct(104, Rating.THREE_STAR, "Just another Cookie");
//		pm.reviewProduct(104, Rating.THREE_STAR, "ok");
//		//pm.printProductReport(104);
//
//		pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
//		pm.reviewProduct(105, Rating.FIVE_STAR, "Tasty");
//		pm.reviewProduct(105, Rating.FOUR_STAR, "Not bad at all");
//		//pm.printProductReport(105);
//
//		pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now() );
//		pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
//		pm.reviewProduct(106, Rating.THREE_STAR, "Better than cookie");
//		pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
//		pm.reviewProduct(106, Rating.ONE_STAR, "I don't get it");
//		pm.printProductReport(106);
//
//		pm.printProducts(p->p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//
//		pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount)) ;
		//		pm.printProducts((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())); 

		//Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal()-p1.getRating().ordinal();
		//Comparator<Product> priceSorter = (p1, p2 ) ->p2.getPrice().compareTo(p1.getPrice());
		//		pm.printProducts(ratingSorter.thenComparing(priceSorter));
		//		pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());


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
