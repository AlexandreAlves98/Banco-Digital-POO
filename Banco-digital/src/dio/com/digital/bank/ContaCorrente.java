package dio.com.digital.bank;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {
        super();
    }

    public void imprimirExtrato() {
        System.out.println("Extrato conta Corrente: ");
        super.imprimirInfosComuns();
    }

}
