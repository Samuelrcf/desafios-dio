package entities;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança");
		super.printInfos();
	}
}


