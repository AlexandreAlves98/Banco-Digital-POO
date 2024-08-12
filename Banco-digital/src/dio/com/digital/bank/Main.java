package dio.com.digital.bank;

public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); 
        bancoInicial.setNome("First Bank");
        Cliente carla = new Cliente("Adailton", bancoInicial); 
        carla.setNome("Adailton Cabral Silva"); 
        Conta ccorrente = new ContaCorrente(carla);
        ccorrente.depositar(99);
        Cliente alisson = new Cliente("Brenda", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(alisson);
        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        ccorrente.transferir(31, cpoupanca);
        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();
        Cliente carolina = new Cliente("Wellington", bancoInicial);
        Conta ccorrente2 = new ContaCorrente(carolina);
        ccorrente2.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }

}
