package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;

import liviu.data.Drink;
import liviu.data.Food;
import liviu.data.Product;
import liviu.data.Rating;


public class Main 
{

	public static void main(String[] args) 
	{
		Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99) );
		Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR );
		Product p3 = new Food(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2) );
		Product p4 = new Product();
		Product p5 = p3.applyRating(Rating.THREE_STAR);

		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRatig().getStars());
		System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRatig().getStars());
		System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRatig().getStars());
		System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRatig().getStars());
		System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " + p5.getRatig().getStars());
		System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRatig().getStars());
	}

}
