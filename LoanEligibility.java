
public class LoanEligibility
{
	void person()
	{
		String name,address;
		int balance,lamt;
		name="Sailesh";
		address="Hyderabad";
		balance=210000;
		lamt=1500000;
		if(balance<100000 || lamt>2000000)
		{
			System.out.println("You are not eligible for Loan");
			System.out.println("Bank balance must be greater than 100000");
			System.out.println("Maximum loan amount is Rs.10,00,000");
		}
		else
		{
			System.out.println("Congrats! you are eligible for loan");
			System.out.println("Enter your full details:");
			System.out.println("Name :"+name);
			System.out.println("Location :"+address);
			System.out.println("Balance :"+balance);
			System.out.println("Loadn needed :"+lamt);		
		}
	}

	public static void main(String[]args){
		LoanEligibility check =new LoanEligibility();
		check.person();
	}
}