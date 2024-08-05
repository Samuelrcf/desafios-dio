package entities;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(IConta contaDestino, double valor);
	
	void imprimirExtrato();
}
