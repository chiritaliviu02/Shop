package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;

import liviu.data.ProductManager;
import liviu.data.Rating;

 
public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm =ProductManager.getInstance();
		pm.printProductReport(101, "en-GB");
		pm.printProductReport(103, "ro-RO");
		
	}

}
