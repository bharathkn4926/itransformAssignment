package springcore.bankaccount;

public interface BankAccountService {
         public double withdraw(long accountId,double accountBalance);
         public double deposite(long accountId,double accountBalance);
         public double getBalance(long accountId);
         public boolean fundTransfer(long fromAccount,long toAccount,double amount);
}
