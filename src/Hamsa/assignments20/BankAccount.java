package Hamsa.assignments20;

public class BankAccount {
    String accountHolder;
    Long accountNumber;
    Double balance;

    public void totalBalance() {
        String account=""+accountNumber;
        String last4OfAccount=account.substring((account.length()-4));
        System.out.println(accountHolder+" Your total balance in your account ending in "+last4OfAccount+" = "+balance);
    }

    public void withDraw(double amount) {
        String account=""+accountNumber;
        String last4OfAccount="********"+account.substring((account.length()-4));
        balance -= amount;
        System.out.println(accountHolder+" you just withdraw "+amount+" US Dollars. from your account ending in "+last4OfAccount);
        System.out.println(accountHolder+" Your total balance in your account ending in "+last4OfAccount+" is "+balance);
    }
    public void deposit(double amount) {
        String account=""+accountNumber;
        String last4OfAccount="********"+account.substring((account.length()-4));
        balance += amount;
        System.out.println(accountHolder+" you just deposit "+amount+" US Dollars. into your account ending in "+last4OfAccount);
        System.out.println(accountHolder+" Your total balance in your account ending in "+last4OfAccount+" is "+balance);

    }

    public void setBankPersonalInfo(String accountHolder,Long accountNumber,Double balance){
       this.accountHolder=accountHolder;
       this.accountNumber=accountNumber;
       this.balance=balance;
    }
}



//     toString()
    //practice task:
// create a custom class for bank account
//   attrubutes: accountHolder(String), accountNumber(long), balance(double)
//   actions: totalBalance(), withDraw( amount ), deposit( amount )
//     toString()
//
//create a class called bankAccountObject to call BankAccount methods,variables.
//Ex : if i deposit 50 dollars my balance should increase 50 dollars
//   : if i withdraw 100 dollars my balance should decrease for 100 dollars
//   : to check the balance use totalBalance method
//

