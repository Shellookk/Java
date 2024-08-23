package lista_exercicios_faculdade;

class Motor{
    //Atributos Motor
    private double potencia;

    //Constructor Motor
    public Motor(double potencia){ //o contructor é um metodo que recebe o mesmo nome da classe e ele inicializa as mesmas
        this.potencia = potencia;
    }

    //Get e Setters
    public double getPotencia(){
        return potencia;
    }
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

}


class Veiculo {
    //Atributos Veiculo
    private String modelo;
    private int ano;
    private String cor;
    private double quilometragem;
    private Motor motor;

    //Constructor Veiculo
    public Veiculo(String modelo, int ano, String cor, Motor motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.quilometragem = 0.0;
        this.motor = motor;
    };

    //Getters and Setters
    public String getModelo() {
        return modelo;
    };
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //método acelerar
    public void acelerar(double aumentarQuilometragem) {
        this.quilometragem += aumentarQuilometragem;
    }

    // Sobrecarga do método acelerar com valor padrão
    public void acelerar() {
        this.quilometragem += 10.0;
    }

    //método frear
    public void frear(double diminuirQuilometragem) {
        if (this.quilometragem - diminuirQuilometragem >= 0){
            this.quilometragem -= diminuirQuilometragem;
        }else {
            System.out.println("A quilometragem não pode ser negativa!");
        }
    }

    //método estático
    public static String verificarCombustivel(double quantidadeCombustivelRestante){
        if(quantidadeCombustivelRestante < 5){
            return "Atenção: O veículo precisa abastecer!";
        }else {
            return "O combustível está em nível adequado.";
        }
    }
}