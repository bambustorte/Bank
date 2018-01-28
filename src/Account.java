public class Account {

    private int bankCode;
    private int accountNumber;
    private double balance;
    private String name;


    public Account(int bankCode, int accountNumber, String name){
        balance = 0.0;
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public double withdraw(double amount){
        if((balance - amount) < 0)
            return 0;

        balance = balance - amount;

        return amount;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }

    public void print(){
        System.out.println(
                "\n- Owner: " + this.name +
                "\n- account number: " + accountNumber +
                "\n- bankCode: " + bankCode +
                "\n- balance: " + balance
        );
    }
}
