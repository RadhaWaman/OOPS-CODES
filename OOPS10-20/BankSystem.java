class BankAccount {
    private int balance;
    private final int accountId;

    public BankAccount(int accountId, int initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Account " + accountId + ": Deposited " + amount + ", Balance = " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Account " + accountId + ": Withdrawn " + amount + ", Balance = " + balance);
        } else {
            System.out.println("Account " + accountId + ": Insufficient balance for withdrawal of " + amount);
        }
    }

    public synchronized int getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public static void transfer(BankAccount from, BankAccount to, int amount) {
        synchronized (from) {
            synchronized (to) {
                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposit(amount);
                    System.out.println("Transferred " + amount + " from Account " + from.getAccountId() + " to Account " + to.getAccountId());
                } else {
                    System.out.println("Transfer failed: Insufficient funds in Account " + from.getAccountId());
                }
            }
        }
    }
}

class Transaction implements Runnable {
    private final BankAccount from;
    private final BankAccount to;
    private final int amount;
    private final String type;

    public Transaction(BankAccount from, BankAccount to, int amount, String type) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public void run() {
        switch (type) {
            case "deposit":
                from.deposit(amount);
                break;
            case "withdraw":
                from.withdraw(amount);
                break;
            case "transfer":
                BankAccount.transfer(from, to, amount);
                break;
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, 1000);
        BankAccount acc2 = new BankAccount(102, 500);

        Thread t1 = new Thread(new Transaction(acc1, null, 200, "deposit"));
        Thread t2 = new Thread(new Transaction(acc1, null, 300, "withdraw"));
        Thread t3 = new Thread(new Transaction(acc1, acc2, 150, "transfer"));
        Thread t4 = new Thread(new Transaction(acc2, acc1, 100, "transfer"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
 