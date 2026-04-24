package br.com.fiapdelivery.model;

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
        // A linha 40 foi removida, pois não faz parte do código original que você forneceu, mas estava na numeração.
        // Se precisar de c.cap = -500.0; é só adicionar de volta.
        c.cap = -500.0; // Adicionada de volta caso fosse um erro de copia.


        pacote pac = new pacote();
        pac.cod =