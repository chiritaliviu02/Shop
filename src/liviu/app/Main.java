package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import liviu.data.ProductManager;
import liviu.data.Rating;

 
public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm = ProductManager.getInstance();
		
		AtomicInteger clientCount = new AtomicInteger(0);
		Callable<String> client = () ->
		{
			String clientId = "Client " + clientCount.incrementAndGet();
			String threadName = Thread.currentThread().getName();
			int produceId = ThreadLocalRandom.current().nextInt(63) + 101;
			String languageTag = ProductManager.getSupportedLocales()
								.stream()
								.skip(ThreadLocalRandom.current().nextInt(4))
								.findFirst().get();
			StringBuilder log = new StringBuilder();
			log.append(clientId + " " + threadName + "\n-\tstart of log\t-\n");
			log.append(pm.getDiscounts(languageTag)
						.entrySet()
						.stream() 
						.map(entry -> entry.getKey() + "\t" + entry.getValue())
						.collect(Collectors.joining("\n")));
			log.append("\n-\tend of log\t-\n");
			return log.toString();
		};
		
		
		
		
		
		pm.printProductReport(101, "ro-RO"); 
		pm.printProductReport(103, "ro-RO");


	}

}
