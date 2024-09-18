package avaliação_poo_2.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Veiculo> veiculos;

    public Cliente(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    // Métodos para associar veículos ao cliente
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}