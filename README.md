<h2>GOF_DesingnPattern</h2>
<h4>    Design Patterns GOT(Gang of four) 
        São soluções comuns para problemas de design de software que foram desenvolvidas, documentadas e testadas por especialistas em programação orientada a objetos;
        Os Design Patterns GOF (Gang of Four) são os padrões mais conhecidos e foram apresentados no livro "Design Patterns: Elements of Reusable Object-Oriented Software";
  <br>

         Singleton---> usado para garantir que uma classe tenha apenas uma instância ele é um padrão de criação que garante que uma classe tenha apenas uma instância e
        fornece um ponto de acesso global a essa instância;
        Isso é útil quando você quer controlar o acesso a uma única instância de uma classe em todo o sistema;
        A ideia é que a classe em questão tenha um construtor privado, para que não possa ser instanciada diretamente;
        É um método estático para recuperar a única instância disponível.

         Strategy---> usado para encapsular algoritmos e torná-los intercambiáveis; é um padrão comportamental que permite que você defina uma família de algoritmos;
         Encapsule cada um deles e os torne intercambiáveis;
         Isso permite que o algoritmo seja selecionado em tempo de execução, de acordo com a necessidade;
         O padrão Strategy é útil quando você tem uma classe que realiza uma determinada operação, mas precisa de diferentes implementações dessa operação;

         Facade---> usado para fornecer uma interface simplificada para um conjunto de interfaces mais complexas, é um padrão estrutural que fornece uma interface simplificada;
         Para um conjunto de interfaces mais complexas;
         Ele oculta a complexidade dos subsistemas e fornece uma interface simples e fácil de usar para o cliente;
         O padrão Facade é útil quando você tem um sistema complexo e deseja fornecer uma interface simples para o usuário.

