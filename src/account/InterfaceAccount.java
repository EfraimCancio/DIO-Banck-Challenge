package account;

public interface InterfaceAccount {
     void toWithdraw(double value);
     void toDeposit(double value);
     void toTransfer(double value, Account targetAccount);
     void printStatement( );
}
