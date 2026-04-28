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
// ARQUIVO caminhao.java:
public class caminhao {
public String pl;
public double cap;
public int eixos;
}

// ARQUIVO moto.java:
public class moto {
public String pl;
public double cap;
public boolean bau;
}

// ARQUIVO pacote.java:
public class pacote {
public String cod;
public double p;
public String s;

public void muda(String x) {
s = x;
}
}
// ARQUIVO Rota.java:
public class Rota {
public pacote p1;
public caminhao c1;

public void vai() {
System.out.println("Levando pacote " + p1.cod + " no veiculo " + c1.pl);
}
}
// ARQUIVO Principal.java:
public class Principal {
public static void main(String[] args) {
caminhao c = new caminhao();
c.pl = "ABC1234";
c.cap = -500.0;

pacote pac = new pacote();
pac.cod = "BR999";
pac.p = 10.5;
pac.s = "Pendente";

Rota r = new Rota();
r.p1 = pac;
r.c1 = c;
r.vai();
}
}
// ARQUIVO caminhao.java:
public class caminhao {
public String pl;
public double cap;
public int eixos;
}

// ARQUIVO moto.java:
public class moto {
public String pl;
public double cap;
public boolean bau;
}

// ARQUIVO pacote.java:
public class pacote {
public String cod;
public double p;
public String s;

public void muda(String x) {
s = x;
}
}
// ARQUIVO Rota.java:
public class Rota {
public pacote p1;
public caminhao c1;

public void vai() {
System.out.println("Levando pacote " + p1.cod + " no veiculo " + c1.pl);
}
}
// ARQUIVO Principal.java:
public class Principal {
public static void main(String[] args) {
caminhao c = new caminhao();
c.pl = "ABC1234";
c.cap = -500.0;

pacote pac = new pacote();
pac.cod = "BR999";
pac.p = 10.5;
pac.s = "Pendente";

Rota r = new Rota();
r.p1 = pac;
r.c1 = c;
r.vai();
}
}
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
  <li>Ajuste de nomeclatura de atributos e métodos --> Nomes devem ser significativos, ou seja, fornecer informações claras sobre do que se trata aquele atributo e/ou método.
  <table>
  <tr>
    <th>Dessa forma:</th>
    <th></th>
    <th></th>
  </tr>
  <tr>
    <td>pl</td>
    <td>➜</td>
    <td>placa</td>
  </tr>
  <tr>
    <td>cap</td>
    <td>➜</td>
    <td>capacidade</td>
  </tr>
    <tr>
    <td>cod</td>
    <td>➜</td>
    <td>codigo</td>
  </tr>
    <tr>
    <td>p</td>
    <td>➜</td>
    <td>peso</td>
  </tr>
    <tr>
    <td>s</td>
    <td>➜</td>
    <td>statusEntrega</td>
  </tr>
    <tr>
    <td>eixos</td>
    <td>➜</td>
    <td>quantidadeEixos</td>
  </tr>
    <tr>
    <td>bau</td>
    <td>➜</td>
    <td>possuiBau</td>
  </tr>
    <tr>
    <td>muda</td>
    <td>➜</td>
    <td>alterarStatus</td>
  </tr>
    <tr>
    <td>vai</td>
    <td>➜</td>
    <td>realizarEntrega</td>
  </tr>
    <tr>
    <td>p1</td>
    <td>➜</td>
    <td>produtoEntrega</td>
  </tr>
    <tr>
    <td>c1</td>
    <td>➜</td>
    <td>veiculoUtilizado</td>
  </tr>
</table>
</table>
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

## Vivendo e aprendendo - correções do professor
Faltam unidades de medida em variáveis numéricas: peso e capacidade não indicam a unidade.
<br>Getter boolean fora do padrão: getPossuiBau() não segue a convenção Java.