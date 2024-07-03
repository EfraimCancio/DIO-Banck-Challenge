import account.Account;
import account.CurrentAccount;
import account.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account ca = new CurrentAccount();
        ca.toDeposit(100);

        Account sa = new SavingsAccount();
        ca.toTransfer(90, sa);

        ca.printStatement();
        sa.printStatement();
    }
}