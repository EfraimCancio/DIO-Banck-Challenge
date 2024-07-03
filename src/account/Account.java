package account;

public abstract class Account implements InterfaceAccount {

    protected int agency;
    protected int number;
    protected double balance;

    private static int DEFAUT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    public Account() {
        this.agency = DEFAUT_AGENCY;
        this.number = SEQUENCIAL++;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public void toWithdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void toDeposit(double value) {
        this.balance += value;
    }

    @Override
    public void toTransfer(double value, Account targetAccount) {
        this.toWithdraw(value);
        targetAccount.toDeposit(value);
    }

    protected void printInfos() {
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero da conta: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
