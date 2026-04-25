# Checkpoint 02 POO - Progamação Orientada a Objeto

> **Professor:** Ygor Moraes Martins dos Anjos
---

## Atividade Prática de Refatoração

O objetivo final da atividade proposta consiste no diagnóstico de falhas arquitetônicas e de segurança em um código legado, aplicando princípios de Orientação a Objetos (encapsulamento, herança, associação) e Clean Code para refatorar e construir uma solução escalável e manutenível.

### Tecnologias Utilizadas
<p>
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=git,java" />
  </a>
</p>

### Tópicos Avaliados
<ul>
  <li>Encapsulamento</li>
  <li>Herança</li>
  <li>Associação</li>
  <li>Construtores</li>
  <li>Documentação</li>
  <li>Clean Code</li>
</ul>

### Material recebido para ajuste (código + arquivo asta UML)
```
```

### Etapas de ajuste do código legado
<ol>
  <li>Separando arquivos e ajustando suas nomeclaturas --> Classes devem ser nomeadas utilizando o padrão PascalCase (iniciais maiúsculas sem espaço) e sua divisão, quando aplicada corretamente, fornece clareza e organização ao código. Facilitando, assim, a manutenção a longo prazo. A classe Veiculo foi criada para possibilitar o uso de herança no projeto.
  <br>Nova divisão de arquivos:

```
  fiapdelivery/
  ├── main
  │   └── SistemaPrincipal.java
  └── model
      ├── Caminhao.java
      ├── Moto.java
      ├── Pacote.java
      ├── Rota.java
      └── Veiculo.java
```
  </li>
  <li>Ajuste de nomeclatura de atributos e métodos --> Nomes devem ser significativos, ou seja, fornecer informações claras sobre do que se trata aquele atributo e/ou método. Dessa forma:
  pl se torna placa
  cap se torna capacidade
  cod se torna codigo
  p se torna peso
  s se torna statusEntrega
  eixos se torna quantidadeEixos
  bau se torna possuiBau
  muda se torna alterarStatus
  vai se torna realizarEntrega
  p1 se torna produtoEntrega
  c1 se torna veiculoUtilizado
  </li>
  <li>Definindo parâmetros --> Enquanto ainda não aprendemos a aplicar padrões de projeto como o Builder para organizar objetos com uma grande quantidade de parâmetros, o ideal é seguir o limite de 3 parâmetros (definido no livro Clean Code, escrito por Robert C. Martin). Esta prática garante a legibilidade do código.
  </li>
  <li>Protegendo informações --> Dados privados não devem ser vistos ou alterados sem permissão ou necessidade. Por conta disso, os atributos expostos como public e tornam private.</li>
  <li>Utilizando Herança e Associação --> Definindo um "caminho" para que o objeto Rota pudesse utilizar informações dos objetos Pacote e Veiculo. Desse modo, viabilizando, por exemplo, a exibição de um resumo do trajeto, contendo informações essenciais como o veiculo que fará a entrega, seu destino e o que estará levando.
  </li>
  <li>Adicionando getters e setters conforme necessário --> O método get fornece acesso indireto à leitura dos valores dos atributos privados de um objeto, assim a classe tem controle sobre como e se um atributo pode ser lido. Já o set fornece acesso indireto para alteração dos valores dos atributos privados, possibilitando que uma validação seja implementada antes de permitir que um atributo seja alterado.
  </li>
  <li>Criando métodos para o serviço de entregas --> Para que o sistema funcione corretamente, diferentes "ações" devem ser executadas, todas protegidas com validações a fim de evitar "bugs" no sistema.
  </li>
  <li>Aplicando testes --> Com o intuito de descobrir se o código está devidamente construído, diferentes solicitações foram feitas ao sistema no arquivo SistemaPrincipal pata verificar se seus retornos seriam satisfatórios.
  </li>
</ol>