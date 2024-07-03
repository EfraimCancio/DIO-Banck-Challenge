import account.Account;
import account.CurrentAccount;
import account.SavingsAccount;
import client.Client;
import client.LegalPerson;
import client.PhysicalPerson;

public class Main {
    public static void main(String[] args) {

        Client efraim = new PhysicalPerson();
        efraim.setName("Efraim");

        Client biel = new LegalPerson();
        biel.setName("Gabriel");

        Account ca = new CurrentAccount(efraim);
        ca.toDeposit(100);

        Account sa = new SavingsAccount(biel);
        ca.toTransfer(90, sa);

        ca.printStatement();
        sa.printStatement();
    }
}