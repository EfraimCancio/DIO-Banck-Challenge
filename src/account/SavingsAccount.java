package account;

public class SavingsAccount extends Account{
    public void printStatement() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printInfos();
    }
}
