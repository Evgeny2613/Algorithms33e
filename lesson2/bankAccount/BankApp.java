package lesson2.bankAccount;

public class BankApp {
    // method of putting money
    //method of withdraw money
    // method of checking balance

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.0);
        System.out.println("Before transaction");
        ba1.display();
        ba1.deposit(200.0);
        ba1.withdraw(54.03);
        System.out.println("After transaction");
        ba1.display();

    }

}

    class BankAccount {
        private double balance;

        public BankAccount(double openingBalance) {
            this.balance = openingBalance;
        }


        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance >= amount)
                balance -= amount;
            else
                System.out.println("Not enough money");
        }

        public void display() {
            System.out.println("Balance: " + balance);
        }
    }

