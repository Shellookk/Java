package avaliação_poo_2.services;
import avaliação_poo_2.model.Veiculo;
import java.util.List;

public class Concessionaria {

    // Método estático para calcular o preço médio dos veículos
    public static double calcularPrecoMedio(List<Veiculo> veiculos) {
        double soma = 0;
        for (Veiculo veiculo : veiculos) {
            soma += veiculo.getPreco();
        }
        return veiculos.size() > 0 ? soma / veiculos.size() : 0;
    }

    // Sobrecarga de método para busca de veículos por marca
    public static Veiculo buscarPorMarca(List<Veiculo> veiculos, String marca) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equalsIgnoreCase(marca)) {
                return veiculo;
            }
        }
        return null;
    }
}
