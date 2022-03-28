package liviu.app;
import java.math.BigDecimal;
import java.util.Formatter.BigDecimalLayoutForm;

import liviu.data.Product;
import liviu.data.Rating;


public class Main 
{

	public static void main(String[] args) 
	{
		Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99) );
//		p1.setId(101);
//	    p1.sePtice(BigDecimal.valueOf(1.99));
//		p1.setName("Tea");
		
		Product p2 = new Product(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR );
		Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
		Product p4 = new Product();
		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRatig().getStars());
		System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRatig().getStars());
		System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRatig().getStars());
		System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRatig().getStars());
	}

}
