package avaliação_poo_2.model;

public class Motocicleta extends Veiculo {

    public Motocicleta(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    // Sobrecarga de método (exemplo simplificado)
    public double calcularPrecoFinal() {
        return getPreco();
    }
}
