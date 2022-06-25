package week3.day1;

public class AxisBank extends BankInfo {

	
	public int deposit(int amountAxis)
	{
		return amountAxis;
		
	}
	
	public void deposit1()
	{
		System.out.println("Overriden from BankInfo Class without any return type");
		
	}
	public static void main(String[] args) {
		
		AxisBank axisBankObj =new AxisBank();
		int bankInfoVariableSaving = axisBankObj.saving(10000); // saving method calling and assigning the value to new variable
		System.out.println("Inherited saving method from BankInfo Class: " + bankInfoVariableSaving); //Inherited savingMethod from BankInfo - Single Inheritance
		System.out.println("Inhertied fixed method from BankInfo Class: "  +axisBankObj.fixed(5000)); //Inherited fixedMethod from BankInfo - Single Inheritance
		System.out.print("Overridden deposit method using inheritance "); // Override message print
		System.out.println(axisBankObj.deposit(2000)); //Overridden the deposit method from BankInfo in AxisBank Class
		axisBankObj.deposit1(); //Overridden the deposit method from BankInfo in AxisBank Class - without return  type
		
		
		
		
	}
}
