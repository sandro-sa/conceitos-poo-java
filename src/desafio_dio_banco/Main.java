package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	 private static List<Conta> contas = new ArrayList<>();
	private static Banco banco;
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Sandro");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Luciana");
		
		Conta cc  = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente1);
		Conta cc2  = new ContaCorrente(cliente2);
		Conta cp2 = new ContaPoupanca(cliente2);
		contas.add(cp);
		contas.add(cc);
		contas.add(cp2);
		contas.add(cc2);
		
		banco = new Banco();
		banco.setNome("Pra voce");
		banco.setContas(contas);
		banco.infBanco();
		
		cc.depositar(100);
		cc.transferir(cp, 110);
		cc.sacar(110);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc2.depositar(100);
		cc2.transferir(cp, 10);
		cc2.imprimirExtrato();
		cp2.imprimirExtrato();
		cc2.sacar(10);
		cc2.transferir(cp2, 10);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cc2.imprimirExtrato();
		cp2.imprimirExtrato();
		
		
	}

}
