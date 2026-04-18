class BankAccount {
    String accNumber;
    String holderName;
    double balance;
    
    public void deposit(double amount) {balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public void displayBalance() {System.out.println(holderName + "Balance: " + balance);
    }
    
    public class MainClass { 
        public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.holderName="Emily";
        a1.balance = 10000;
        
        BankAccount a2 = new BankAccount();
        a2.holderName = "Sylvie";
        a2.balance = 5000;
        
        a1.deposit(1500);
        a2.withdraw(1000);
        
        a1.displayBalance();
        a2.displayBalance();
    }
}
}
