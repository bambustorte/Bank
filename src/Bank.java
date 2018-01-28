public class Bank {
    public static void main(String[] args) {

        Action action1 = new Action();
        Account account1 = new Account(1001, 2002, "peter");

        while(true) {

            switch (action1.showMenu()){
                case 1:
                    account1 = action1.newAccount();
                    break;
                case 2:
                    action1.deposit(account1);
                    break;
                case 3:
                    action1.withdraw(account1);
                    break;
                case 4:
                    account1.print();
                    break;
                default:
                    System.out.println("invalid input");
            }

        }
    }
}

