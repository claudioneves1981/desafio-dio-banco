## POO - Desafio-dio-banco

### LAB - Modelagem de uma aplicação bancaria usando poo.

#### Funcionalidades
1. **Classe Banco**
    - Atributos: `String nome , List<Conta> contas;`
    - Métodos: `adcionarConta(Conta conta), imprimeContas(); getters e setters`
2. **Classe Cliente**
    - Atributos `String nome`
    - Métodos `getters e setters`
3. **Classe Conta**
   - Atributos: `int agencia , int numero, double saldo, Cliente cliente;`
   - Métodos: `sacar(double valor), depositar(double valor), transferir(double valor, Conta contaDestino)`,`imprimirInfosComuns(), getters e setters`
4. **Classes ContaCorrente e ContaPoupanca**
    - Métodos: `imprimirExtrato()`
