/**
 * Author: Liviu
 */
package liviu.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;
import static liviu.data.Rating.*;

/**
 * @author 40751
 *
 */
public abstract class Product implements Rateable<Product>  {
	private int id;
	private  String name;
	private BigDecimal price;
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private Rating rating;


	//	 Product () 
	//	{
	//		this(0, "no name", BigDecimal.ZERO);
	//	}

	Product (int id, String name, BigDecimal price, Rating rating) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	Product (int id, String name, BigDecimal price)
	{
		this(id, name, price, NOT_RATED); 
	}

	public int getId() {
		return id;
	}

	public String getName()
	{
		return name;
	}

	public  BigDecimal getPrice()
	{
		return price;
	}

	public BigDecimal getDiscount()
	{
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	@Override
	public Rating getRating()
	{
		return rating;
	}

	public abstract Product  applyRating (Rating newRating);
	//	{
	//		return new Product(id, name, price, newRating);
	//	}

	public LocalDate getBestBefore()
	{
		return LocalDate.now();
	}


	@Override
	public String toString()
	{
		return id + ", " + name + ", " + price + ", " + getDiscount() + ", " + rating.getStars() + " " + getBestBefore();  
	}

	@Override
	public int hashCode()
	{
		int hash = 5;
		hash = 23 * hash + this.id;
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{

			return true;
		}
		//if(obj != null && getClass() == obj.getClass() )
		if(obj instanceof Product)
		{
			final Product other = (Product) obj;
			return this.id == other.id; // && Objects.equals(this.name, other.name);
		}
		return false;

	}







}
