package assignment02;

public class AddingMachine 
{
	 private int total;
	 private String printTotal = "0";
	 
	 public AddingMachine () 
	 {	 
		 total = 0;  // not needed - included for clarity
	 }
	  
	 public int getTotal () 
	 {
		 return total;
	 }
	  
	 public void add (int value) 
	 {
		 total += value;
		 printTotal += (" + " + value);
	 }

	 public void subtract (int value) 
	 {
		 total -= value;
		 printTotal += (" - " + value);
	 }

	 public String toString ()
	 {	 
		 return printTotal;
	 }

	 public void clear() 
	 {
	 }
}
