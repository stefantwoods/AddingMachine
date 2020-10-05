/**
 * Name: Stefan Woods
 * Date: 10/5/20
 * Description: Class AddingMachine can add, subtract and return a total 
 */

package cse360assignment02;

public class AddingMachine 
{
	  /**
	   * variables
	   */
	  private int total;
	  private String memory = "";
	  
	  /**
	   * constructor
	   */
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	    memory = "0";
	  }
	  
	  public int getTotal () 
	  {
	    return total;
	  }
	  
	  public void add (int value) 
	  {
		  total = total + value;
		  memory = memory + " + " + value;
	  }

	  public void subtract (int value) 
	  {
		  total = total - value;
		  memory = memory + " - " + value;
	  }

	  public String toString () 
	  {
	    return memory;
	  }

	  public void clear() 
	  {
		  memory = "";
	  }
	  
	}


