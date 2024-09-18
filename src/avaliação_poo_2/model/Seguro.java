package avaliação_poo_2.model;

public class Seguro {
    private double valor;
    private String cobertura;

    public Seguro(double valor, String cobertura) {
        this.valor = valor;
        this.cobertura = cobertura;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
