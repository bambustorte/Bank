import java.util.Scanner;

public class Action {

    Scanner scanner = new Scanner(System.in);

    public int showMenu(){
        System.out.println("1. Create new account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display information");

        return scanner.nextInt();
    }

    void withdraw(Account account){
        System.out.println("how much?");
        account.withdraw(scanner.nextDouble());
    }

    void deposit(Account account){
        System.out.println("how much?");
        account.deposit(scanner.nextDouble());
    }

    public Account newAccount(){
        System.out.println("provide name");
        scanner.nextLine();
        String name = scanner.nextLine();
        return new Account(1, 1, name);
    }
}
