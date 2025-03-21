class Account {
    private double balance = 100.00;

    double getBalance() {
        return balance;
    }
   void deposit(double amount) {
        balance = balance + amount; // balance +=amount
   }


   boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
   }
}


class TransactionLogger {
    void logTransaction(String message) {
        System.out.println("Transaction Log:" + message);
    }
}










public class BankingSystem {
}
