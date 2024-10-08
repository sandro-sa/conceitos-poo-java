package desafio_dio_banco;

public abstract class Conta  implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	/*Composição*/
	protected Cliente cliente;
	
	public Conta() {
	}
	
	public Conta(Cliente cliente) {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			System.out.println("== Saldo insuficiente! ==");
		}
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;	
	}
	@Override
	public void transferir(Conta contaDestino, double valor) {
		if(valor <= this.saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}else {
			System.out.println("== Transferencia negada, Saldo insuficiente! ==");
		}
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Cliente: "+ this.cliente.getNome()));
		System.out.println(String.format("Agencia:  %d", this.agencia));
		System.out.println(String.format("Numero da Conta:  %d", this.numero));
		System.out.println(String.format("Saldo:  %.2f", this.saldo));
	}

}
