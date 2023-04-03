## Hierarquia-Polimorfismo

>Este é um projeto em Java que implementa uma hierarquia de classes para contas bancárias. Ele possui uma classe abstrata Conta2 que define os atributos básicos de uma conta, como nome do titular, número da conta e saldo. Há também uma interface Funcao que define um método para definir a função de um funcionário.


> Existem três classes concretas que estendem Conta2 e implementam a interface Funcao: Funcionario, Gerente e Caixa. Cada uma dessas classes representa um tipo diferente de funcionário e define a função apropriada.

> A classe FuncionarioGeral possui um método main que cria uma instância de cada tipo de funcionário e configura seus atributos, exibindo-os no console.


### Como executar o projeto
```sh
Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema.
Clone este repositório em sua máquina local.
Abra um terminal na pasta do projeto.
Compile as classes com o comando javac *.java.
Execute o programa com o comando java FuncionarioGeral.
```

### Resultado da saída

![saida](https://user-images.githubusercontent.com/33014753/229588217-57b1b605-81f0-4e22-a3e1-1006bf714585.png)
