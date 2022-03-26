package liviu.app;
import java.math.BigDecimal;

import liviu.data.Product;


public class Main 
{

	public static void main(String[] args) 
	{
		Product p1 = new Product();
	//	p1.setId(101);
	    p1.sePtice(BigDecimal.valueOf(1.99));
	//	p1.setName("Tea");
		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount());
	}

}
