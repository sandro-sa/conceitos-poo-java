package desafio_dio_banco;

public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(Conta contaDestino, double valor);
}
