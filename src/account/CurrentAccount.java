package account;

public class CurrentAccount extends Account {
    public void printStatement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printInfos();
    }
}
