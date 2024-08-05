package entities;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		super.printInfos();
	}
}


