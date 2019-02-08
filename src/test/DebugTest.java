package test;

public class DebugTest {

	public static void main(String args[]) { 
		String[] currencies = {"GBP", "USD", "JPY", "EUR", "INR"}; 
		System.out.println("Supported currencies for trading : "); 
		for (int i = 0; i <= currencies.length-1; i++) { 
			System.out.println(currencies[i]); 
			
			//find defect by breakpoint, use variable check which part problem, in this example they give us 5, that means [5] is fault;
		} 
	}
}
