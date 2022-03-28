/**
 * Author: Liviu
 */
package liviu.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import static liviu.data.Rating.*;

/**
 * @author 40751
 *
 */
public class Product {
	private int id;
	private String name;
	private BigDecimal price;
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private Rating rating;
	
	public Product () 
	{
		this(0, "no name", BigDecimal.ZERO);
	}
	
	 public Product (int id, String name, BigDecimal price, Rating rating) 
	 {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	 }
	 
	 public Product (int id, String name, BigDecimal price)
	 {
		this(id, name, price, NOT_RATED); 
	 }
	
	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	public  BigDecimal getPrice()
	{
		return price;
	}
	
	public void sePtice(final BigDecimal price)
	{
		//price = BigDecimal.ONE;
		this.price = price;
	}
	
	public BigDecimal getDiscount()
	{
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	public Rating getRatig()
	{
		return rating;
	}
	
	
	
	
	
}
