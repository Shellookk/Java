package je01_sintaxe;

public class Conta { //escopo global da classe
    //variavel da classe conta
    double saldo = 10.0;

    public void sacar( double valor){ //escopo local da metodo sacar
        double novoSaldo = saldo - valor;
    }
}
