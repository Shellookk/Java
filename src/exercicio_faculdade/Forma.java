package exercicio_faculdade;

// Classe base abstrata Forma
abstract class Forma {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}

// Classe Circulo que herda de Forma
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Classe Retangulo que herda de Forma
class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}