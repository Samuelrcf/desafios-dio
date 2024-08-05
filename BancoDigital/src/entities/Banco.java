package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void mostrarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta número: " + conta.getNumero() + ", Cliente: " + conta.getCliente().getNome() + ", Saldo: " + conta.getSaldo());
        }
    }
}
