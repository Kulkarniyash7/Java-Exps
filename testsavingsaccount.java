import java.util.Scanner;

class SavingsAccount{
	static double annualIntrestRate = 4.0;
	private double AccBal;
	Scanner sc = new Scanner (System.in); 
 	double intrest;	

		void calculateMonthlyIntrest(double annualIntrestRate,double AccBal){
		
		double bal = AccBal+intrest;
		intrest=AccBal*((annualIntrestRate/12)/100);
		System.out.println("The monthly intrest is :"+intrest);
		System.out.println("Balanca after adding monthly intrest is "+bal);

		
				
		} 

		static void modifyIntrestRate(double Intrest){
		 annualIntrestRate = Intrest;
		}

		void show (){
		System.out.println("Intrest"+annualIntrestRate);
		
		}		
}
class testsavingsaccount{
	public static void main(String[]Args){
	SavingsAccount saver1= new SavingsAccount();
	SavingsAccount saver2= new SavingsAccount();
	saver1.calculateMonthlyIntrest(4,2000);
  	saver2.calculateMonthlyIntrest(4,3000);
	SavingsAccount.modifyIntrestRate(5);
	saver1.show();
	saver2.show();
	
	}




}

