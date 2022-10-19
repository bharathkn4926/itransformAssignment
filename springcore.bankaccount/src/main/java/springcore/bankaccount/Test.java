package springcore.bankaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	BankAccount account=(BankAccount) context.getBean("BankAccount");
	account.displayBean();
	
	BankAccountController bank=new BankAccountController();
	bank.deposite(1234567,200);
	bank.getBalance(0);
	bank.withdraw(1234567,200);
	bank.fundTransfer(0, 0, 0);
	
	
	}

}
