package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidade, int quantidadeEixos) {
        super(placa, capacidade);
        this.setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
		return this.quantidadeEixos;
	}

    private void setQuantidadeEixos(int quantidade) {
        if (quantidade >= 1){
            this.quantidadeEixos = quantidade;
        }
        else {
            System.out.println("Erro: Tentativa de definir quantidade de eixos menor que 2 bloqueada! Não temos nenhum caminhão de entrega com menos que isso.");
        }
    }

}
