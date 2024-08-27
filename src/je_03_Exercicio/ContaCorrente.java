package je_03_Exercicio;

import java.time.LocalDate;

public class ContaCorrente {

    //variaveis
    int numeroConta;
    int numeroAgencia;
    String nomeCliente;
    LocalDate dataNascimento;
    double saldoConta;
    boolean ativo = true;

    //Metodos
    void sacar (double valorSolicitado) {

    }
    void transferir(double valorSolicitado, ContaCorrente contaDestino) {

    }
    void cancelar(String justificativa){

    }
    List consultarExtrato( LocalDate datainicial, LocalDate dataFinal){
        return null;
    }
    double consultarSaldo(){
        return saldoConta;
    }

}
