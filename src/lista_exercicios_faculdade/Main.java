package lista_exercicios_faculdade;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Motor
        Motor motor1 = new Motor(2.0);
        Motor motor2 = new Motor(3.5);

        // Criando instâncias de Veiculo
        Veiculo veiculo1 = new Veiculo("Civic", 2022, "Preto", motor1);
        Veiculo veiculo2 = new Veiculo("Corolla", 2021, "Branco", motor2);

        // Demonstrando o uso dos métodos
        veiculo1.acelerar(15.0);
        System.out.println(veiculo1.getModelo() + " - Quilometragem: " + veiculo1.getQuilometragem());

        veiculo2.acelerar();
        System.out.println(veiculo2.getModelo() + " - Quilometragem: " + veiculo2.getQuilometragem());

        veiculo1.frear(5.0);
        System.out.println(veiculo1.getModelo() + " - Quilometragem: " + veiculo1.getQuilometragem());

        System.out.println(Veiculo.verificarCombustivel(5.0));
        System.out.println(Veiculo.verificarCombustivel(15.0));

        // Criando lista de veículos usando ArrayList
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add(veiculo1);
        listaDeVeiculos.add(veiculo2);

        // Percorrendo a lista de veículos
        for (Veiculo veiculo : listaDeVeiculos) {
            System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor() + ", Potência do Motor: " + veiculo.getMotor().getPotencia() + "L");
        }
    }
}
