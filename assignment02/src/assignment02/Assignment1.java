package assignment02;
public class Assignment1 
{
	public static void main(String args[])
	{
		AddingMachine machine = new AddingMachine();
		machine.add(7);
		System.out.println(machine.getTotal());
		machine.subtract(3);
		System.out.println(machine.getTotal());
		System.out.println(machine.toString());
		machine.clear();
		System.out.println(machine.getTotal());
		System.out.println(machine.toString());
		
	}
}
