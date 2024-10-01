package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Sandro");
		
		Conta cc  = new ContaCorrente(cliente);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.transferir(cp, 10);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
