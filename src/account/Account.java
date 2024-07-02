package account;

public abstract class Account implements InterfaceAccount {
    private int agencia;
    private int numero;
    private double balance;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public void toWithdraw(double value) {

    }

    @Override
    public void toDeposit(double value) {

    }

    @Override
    public void toTransfer(double value, Account targetAccount) {

    }
}
