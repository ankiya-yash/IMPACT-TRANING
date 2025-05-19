public class atmMachine {
    static int balance = 1000;
    static int pin = 1234;

    public static void main(String[] args) throws java.io.IOException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\n1.Check Balance 2.Deposit 3.Withdraw 4.Change PIN 5.Exit");
            int ch = sc.nextInt();
            if (ch == 1) checkBalance();
            else if (ch == 2) deposit(sc);
            else if (ch == 3) withdraw(sc);
            else if (ch == 4) changePin(sc);
            else if (ch == 5) break;
            else System.out.println("Invalid choice");
        }
        sc.close();
    }

    static void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    static void deposit(java.util.Scanner sc) {
        System.out.print("Enter amount: ");
        int amt = sc.nextInt();
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    static void withdraw(java.util.Scanner sc) {
        System.out.print("Enter amount: ");
        int amt = sc.nextInt();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    static void changePin(java.util.Scanner sc) {
        System.out.print("Enter old PIN: ");
        int oldPin = sc.nextInt();
        if (oldPin == pin) {
            System.out.print("Enter new PIN: ");
            pin = sc.nextInt();
            System.out.println("PIN changed");
        } else {
            System.out.println("Wrong PIN");
        }
    }
}