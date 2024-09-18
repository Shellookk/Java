package avaliação_poo_2;
import avaliação_poo_2.model.*;
import avaliação_poo_2.services.Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Isaque Rodrigues");

        // Criando veículos
        Carro carro1 = new Carro("Toyota", "Corolla", 90000);
        Motocicleta moto1 = new Motocicleta("Honda", "CB500", 32000);

        // Adicionando veículos ao cliente
        cliente1.adicionarVeiculo(carro1);
        cliente1.adicionarVeiculo(moto1);

        // Criando uma lista de veículos
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);

        // Calculando o preço médio dos veículos
        double precoMedio = Concessionaria.calcularPrecoMedio(veiculos);
        System.out.println("Preço médio dos veículos: R$ " + precoMedio);

        // Buscando veículo por marca
        Veiculo veiculoBuscado = Concessionaria.buscarPorMarca(veiculos, "Honda");
        if (veiculoBuscado != null) {
            System.out.println("Veículo encontrado: " + veiculoBuscado.getModelo());
        } else {
            System.out.println("Veículo não encontrado.");
        }

        // Exibindo os veículos do cliente
        System.out.println("Veículos do cliente " + cliente1.getNome() + ":");
        for (Veiculo veiculo : cliente1.getVeiculos()) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }
    }
}
