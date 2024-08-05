package application;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente("Alice", "12345678900");
        Cliente cliente2 = new Cliente("Bob", "98765432100");
        
        Conta contaCorrente = new ContaCorrente(1, cliente1);
        Conta contaPoupanca = new ContaPoupanca(2, cliente2);
        
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);
        
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);
        
        contaCorrente.transferir(contaPoupanca, 200);
        
        banco.mostrarContas();
    }
}
