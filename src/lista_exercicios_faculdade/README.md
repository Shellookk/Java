Contexto: Você foi contratado para desenvolver um sistema de gerenciamento de uma pequena frota de veículos para uma empresa de logística. O sistema deve permitir o cadastro de veículos e realizar operações como acelerar, frear, verificar o combustível e calcular a distância percorrida.

Requisitos:
1. Classe Veiculo:
    - Crie uma classe Veiculo que tenha os seguintes atributos: modelo (String), ano (int), cor (String) e quilometragem (double).
    - Implemente os métodos getters e setters para os atributos acima, garantindo o encapsulamento.
    - Crie um método acelerar() que aumente a quilometragem do veículo em um valor específico passado como parâmetro.
    - Crie um método frear() que diminua a quilometragem em um valor específico, sem permitir que o valor seja negativo.

2. Métodos Estáticos:
    - Dentro da classe Veiculo, implemente um método estático verificarCombustivel() que receba como parâmetro a quantidade de combustível restante (em litros) e retorne uma mensagem indicando se o veículo precisa abastecer.

3. Construtor:
    - Adicione um construtor na classe Veiculo que inicialize os atributos modelo, ano e cor, deixando a quilometragem inicializada em zero.

4. Relacionamento entre Classes:
    - Crie uma classe Motor com o atributo potencia (double).
    - Modifique a classe Veiculo para incluir uma instância de Motor, estabelecendo uma relação de composição.

5. Modificadores de Acesso:
    - Atributos como modelo, ano e cor devem ter modificadores de acesso private.
    - O método acelerar() deve ser public.

6. Import:
    - Utilize a classe ArrayList do pacote java.util para criar uma lista de veículos cadastrados.

7. Encapsulamento:
    - Garanta que os atributos modelo, ano e cor só possam ser acessados ou modificados através de seus respectivos métodos get e set.

8. Sobrecarga de Métodos:
    - Na classe Veiculo, implemente a sobrecarga do método acelerar(), permitindo que ele seja chamado sem parâmetros, aumentando a quilometragem em um valor padrão de 10 km.

Perguntas:
1. Implemente a classe Veiculo e a classe Motor conforme os requisitos descritos.
2. Demonstre o uso de cada método criado, incluindo a sobrecarga de métodos, em um programa principal (main).
3. Crie uma lista de veículos usando ArrayList, adicione alguns veículos e mostre como percorrer essa lista para exibir os detalhes de cada veículo.
4. Explique como os conceitos de encapsulamento e sobrecarga de métodos foram aplicados na sua implementação.