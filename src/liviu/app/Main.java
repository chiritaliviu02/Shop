package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;

import liviu.data.ProductManager;
import liviu.data.Rating;

 
public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm = ProductManager.getInstance();
		pm.printProductReport(101, "ro-RO"); 
		pm.printProductReport(103, "ro-RO");
//		pm.createProduct(164, "Kombucha", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
//		pm.reviewProduct(164, Rating.TWO_STAR, "Arata ca un ceai, este?");
//		pm.reviewProduct(164, Rating.FOUR_STAR, "Bun ceai");
//		pm.reviewProduct(164, Rating.FOUR_STAR, "Acesta nu este ceai");
//		pm.reviewProduct(164, Rating.FIVE_STAR, "Perfect!");
////		pm.printProductReport(164);
//		pm.dumpData();
//		pm.restoreData();   
//		pm.printProductReport(105);
//		pm.printProductReport(164);
//		pm.printProducts(p->p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating()
//				.ordinal() - p1.getRating().ordinal());
//		pm.getDiscounts().forEach(
//				(rating, discount) -> System.out.println(rating + "\t" + discount));
//		
//
// 

	}

}
