package vn.codegym.demo;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Đồng bộ hóa phương thức rút tiền
    public synchronized boolean withdraw(double amount) {
        // rut 11,000,000d
        // so du 10,000,000d
        if (balance >= amount) {
            // Mô phỏng một số xử lý mất thời gian
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " đã rút: " + amount + "đ | Số dư: " + balance + "đ");
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " không thể rút: " + amount + "đ | Số dư: " + balance + "đ");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}