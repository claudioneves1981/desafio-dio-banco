import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente claudio = new Cliente();
        claudio.setNome("Claudio");

        Conta cc = new ContaCorrente(claudio);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(claudio);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco();
        banco.adcionarConta(cp);
        banco.adcionarConta(cc);
        banco.imprimeContas();
    }
}
