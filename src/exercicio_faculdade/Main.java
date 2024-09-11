package exercicio_faculdade;
// Classe principal Main
public class Main {
    public static void main(String[] args) {
        // Criação do array de formas
        Forma[] lista = {
                new Circulo(5),
                new Retangulo(4, 6),
                new Circulo(3)
        };

        // Cálculo da área total
        double areaTotal = calcularAreaTotal(lista);
        System.out.println("Área total das formas: " + areaTotal);
    }

    // Método para calcular a área total das formas
    public static double calcularAreaTotal(Forma[] formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
