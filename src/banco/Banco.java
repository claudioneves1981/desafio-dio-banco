package banco;

import conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco{


   protected String nome = "Banco Cláudio";
   protected List<Conta> contas = new ArrayList<>();


   public List<Conta> getContas() {
      return contas;
   }


   public String getNome() {
      return nome;
   }

   @Override
   public void adcionarConta(Conta conta){

      contas.add(conta);

    }

    @Override
    public void imprimeContas(){
      System.out.println(contas);
   }


   @Override
   public String toString() {
      return "{" +
              "nome='" + nome + '\'' +
              ", conta=" + contas +
              '}';
   }
}
