package liviu.app;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import liviu.data.Product;
import liviu.data.ProductManager;
import liviu.data.Rating;

 
public class Main 
{

	public static void main(String[] args) 
	{	
		ProductManager pm =ProductManager.getInstance();
		
		AtomicInteger clientCount = new AtomicInteger(0);
		Callable<String> client = () -> {
			String clientId = "Client " + clientCount.incrementAndGet();
			String threadName = Thread.currentThread().getName();
			int productId =ThreadLocalRandom.current().nextInt(5) + 101;
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
			Product product = pm.reviewProduct(productId, Rating.FOUR_STAR, " inca o parere");
			log.append((product != null) ? "\n Produs " + productId + "catalogat\n" : "\nProdus " + productId + " nu este catalogat\n");
			pm.printProductReport(productId, languageTag, clientId);
			log.append(clientId + "raport generat pentru produs " + productId);
			log.append("\n-\tend of log\t-\n");			
			return log.toString();
		};
		
		List<Callable<String>> clients = Stream.generate(() -> client).limit(5).collect(Collectors.toList());
		ExecutorService executorSerivice = Executors.newFixedThreadPool(3);
		try {
			List<Future<String>> results = executorSerivice.invokeAll(clients);
			executorSerivice.shutdown();
			results.stream().forEach(result ->{
				try {
					System.out.println(result.get());
				} catch (InterruptedException  | ExecutionException ex) {
					Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Eror retrieving client log ", ex);
				}
			});
		} catch (InterruptedException ex) {
			
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error invoking clients ", ex);
		}
		
		
	}

}
