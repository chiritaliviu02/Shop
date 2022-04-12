/**
 * Author: Liviu
 */
package liviu.data;

/**
 * @author 40751
 *
 */
public class ProductManagerException  extends Exception {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductManagerException() 
	{	
		super();
	}
	
	public ProductManagerException(String message) 
	{
		super(message);		
	}
	 
	public ProductManagerException(String message , Throwable cause)
	{
		super(message, cause);
	}
	
	
	
	
}
