import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("press  1 to to create bank account of sbi or 2 to create bank account of baroda");
        Scanner sc = new Scanner(System.in);
        Rbiinterface bank;
        int n = sc.nextInt();
        if (n == 1) {
            bank = new Sbi("abc123", "112233", 1000);
        } else {
            bank = new Baroda("abc1233", "1122333", 10000);
        }
        System.out.println(bank.addMoney(100));
        System.out.println(bank.checkBalance("abc1233"));
        System.out.println(bank.rateOfInterest(4));
        System.out.println(bank.withdrawMoney("abc1233", 1000));
    }
}



