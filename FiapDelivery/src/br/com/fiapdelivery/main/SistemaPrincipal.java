package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println(">>> Testes de Pacote <<<");
        Pacote pacote1 = new Pacote("P001", 2.5, "Em preparação");
        Pacote pacote2 = new Pacote("P002", 15.0, "Coletado");

        System.out.println("Pacote 1: Código = " + pacote1.getCodigo() + " | Peso = " + pacote1.getPeso() + " | Status = " + pacote1.getStatusEntrega());
        pacote1.alterarStatus("Em rota de entrega");
        System.out.println("Pacote 1: Status = " + pacote1.getStatusEntrega());
        System.out.println("Pacote 2: Código = " + pacote2.getCodigo() + " | Peso = " + pacote2.getPeso() + " | Status = " + pacote2.getStatusEntrega());
        System.out.println();

        System.out.println(">>> Testes de Erro em Pacote <<<");
        Pacote pacoteInvalido1 = new Pacote(null, 10.0, "Pendente");
        Pacote pacoteInvalido2 = new Pacote("P004", -5.0, "Em estoque");
        Pacote pacoteInvalido3 = new Pacote("P005", 20.0, null);

        System.out.println();

        System.out.println(">>> Testes de Veículo <<<");
        Moto moto1 = new Moto("ABC1234", 5.0, true);
        Moto moto2 = new Moto("DEF5678", 3.0, false);
        Caminhao caminhao1 = new Caminhao("GHI9012", 200.0, 3);
        Caminhao caminhao2 = new Caminhao("JKL3456", 50.0, 1);

        System.out.println("Moto 1: Placa = " + moto1.getPlaca() + " | Capacidade = " + moto1.getCapacidade() + " | Possui Baú = " + moto1.getPossuiBau());
        moto1.removerBau();
        System.out.println("Moto 1: Possui Baú = " + moto1.getPossuiBau());
        moto1.adicionarBau();
        moto1.adicionarBau();
        System.out.println();

        System.out.println("Moto 2: Placa = " + moto2.getPlaca() + " | Capacidade = " + moto2.getCapacidade() + " | Possui Baú = " + moto2.getPossuiBau());
        moto2.adicionarBau();
        System.out.println("Moto 2: Possui Baú = " + moto2.getPossuiBau());
        System.out.println();

        System.out.println("Caminhão 1: Placa = " + caminhao1.getPlaca() + " | Capacidade = " + caminhao1.getCapacidade() + " | Eixos = " + caminhao1.getQuantidadeEixos());
        System.out.println("Caminhão 2: Placa = " + caminhao2.getPlaca() + " | Capacidade = " + caminhao2.getCapacidade() + " | Eixos = " + caminhao2.getQuantidadeEixos());
        System.out.println();

        System.out.println(">>> Testes de Erro em Veículo <<<");
        Moto motoInvalida1 = new Moto(null, 10.0, true);
        Moto motoInvalida2 = new Moto("XYZ9876", -2.0, false);

        Caminhao caminhaoInvalido1 = new Caminhao(null, 300.0, 4);
        Caminhao caminhaoInvalido2 = new Caminhao("QWE1122", -10.0, 3);
        Caminhao caminhaoInvalido3 = new Caminhao("RTY3344", 150.0, 0);

        System.out.println();

        System.out.println(">>> Testes de Rota <<<");
        Rota rota1 = new Rota("Avenida Paulista, 1000", pacote1, moto1);
        Rota rota2 = new Rota("Rua Augusta, 500", pacote2, caminhao1);

        rota1.exibirInformações();
        rota1.realizarEntrega();
        System.out.println();

        rota2.exibirInformações();
        rota2.realizarEntrega();
        System.out.println();

        System.out.println("Status do Pacote 1 antes da entrega: " + pacote1.getStatusEntrega());
        System.out.println("Realizando entrega da Rota 1...");
        rota1.realizarEntrega();
        pacote1.alterarStatus("Entregue");
        System.out.println("Status do Pacote 1 após a entrega: " + pacote1.getStatusEntrega());
        System.out.println();

        System.out.println(">>> Testes de Erro em Rota <<<");
        Rota rotaInvalida1 = new Rota(null, pacote1, moto1);
    }
}