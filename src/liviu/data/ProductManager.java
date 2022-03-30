/**
 * Author: Liviu
 */
package liviu.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author 40751
 *
 */
public class ProductManager {
	
	public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore)
	{
		return new Food(id, name, price, rating, bestBefore );
	}
	
	public Product createProduct(int id, String name, BigDecimal price, Rating rating)
	{
		return new Drink(id, name, price, rating  );
	}
	
	
	
	

}
