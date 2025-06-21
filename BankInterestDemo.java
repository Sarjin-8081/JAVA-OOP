
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

// Class: SavingsAccount
class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

// Class: FixedDepositAccount
class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.07; // 7% interest
    }
}

// Class: BankInterestDemo
public class BankInterestDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000);
        Account fixed = new FixedDepositAccount(1000);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Fixed Deposit Account Interest: " + fixed.calculateInterest());
    }
}
