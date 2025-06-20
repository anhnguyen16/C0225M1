package vn.codegym.demo;

// Sử dụng trong môi trường đa luồng
public class ATMExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("0011004149609", 1000);

        // Thread 1 - ATM 1
        Thread t1 = new Thread(() -> {
            account.withdraw(800); // Rut 800d
        });
        t1.setName("ATM-1-MYDINH");

        // Thread 2 - ATM 2
        Thread t2 = new Thread(() -> {
            account.withdraw(800); // Rut 800d
        });
        t2.setName("ATM-2-CAUGIAY");

        t1.start();
        t2.start();
    }
}