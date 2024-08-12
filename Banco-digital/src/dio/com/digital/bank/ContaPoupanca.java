package dio.com.digital.bank;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca() {
        super();
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da Poupança:");
        super.imprimirInfosComuns();
    }

}
