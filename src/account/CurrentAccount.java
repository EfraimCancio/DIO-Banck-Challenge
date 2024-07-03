package account;

import client.Client;

public class CurrentAccount extends Account {
    public CurrentAccount(Client client) {
        super(client);
    }

    public void printStatement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printInfos();
    }
}
