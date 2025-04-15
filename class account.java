public Account(String accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}

public double checkBalance() {
    return balance;
}

public void deposit(double amount) {
    if(amount > 0) {
        balance += amount;
    }
}

public boolean withdraw(double amount) {
    if(amount > 0 && amount <= balance) {
        balance -= amount;
        return true;
    }
    return false;
}
