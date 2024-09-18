package avaliação_poo_2.model;

public class Carro extends Veiculo {
    private Seguro seguro;

    // Construtor sem seguro
    public Carro(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        this.seguro = null;  // Carro sem seguro
    }

    // Construtor com seguro
    public Carro(String marca, String modelo, double preco, Seguro seguro) {
        super(marca, modelo, preco);
        this.seguro = seguro;
    }

    // Sobrecarga de método para calcular o preço final com ou sem seguro
    public double calcularPrecoFinal() {
        return getPreco();
    }

    public double calcularPrecoFinalComSeguro() {
        return seguro != null ? getPreco() + seguro.getValor() : getPreco();
    }

    // Getters e Setters
    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
}