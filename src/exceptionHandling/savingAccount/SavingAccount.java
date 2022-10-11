package exceptionHandling.savingAccount;

public class SavingAccount {
	long id=1234567890;
	double balance=2000;
	double amount;
	
	
	double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException 
	{
		if(amount>balance) throw new InsufficientBalanceException();
		if(amount<0) throw new IllegalBankTransactionException();
		return balance=balance-amount;
		
	}
	double deposite(double amount) throws IllegalBankTransactionException {
		if(amount<0) throw new IllegalBankTransactionException();
		return balance=balance+amount;
		
	}

	public static void main(String[] args)  
	{
		SavingAccount s1=new SavingAccount();
		try {
			s1.withdraw(1000);
			
		} catch (InsufficientBalanceException e) {
			System.out.println("Insufficient funds");
		} catch (IllegalBankTransactionException e) {
			System.out.println("Invalid entry");
		}
		System.out.println("Withdraw Sucessfull , Balance = "+s1.balance+"Rs");
		
		
		try {
			s1.deposite(600);
		} catch (IllegalBankTransactionException e) {
			System.out.println("Enter valid amount");
		}
		System.out.println("Deposite Sucessfull, Balance = "+s1.balance+"Rs");		
	}

}
