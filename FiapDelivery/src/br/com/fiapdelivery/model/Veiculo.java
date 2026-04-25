package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
		return this.placa;
	}

    private void setPlaca(String placa) {
        if (placa != null){
        this.placa = placa;
        }
        else{
            System.out.println("Erro: O espaço 'Placa' deve conter ao menos 1 caracter válido.");
        }
    }

    public double getCapacidade() {
		return this.capacidade;
	}

    private void setCapacidade(double valor) {
        if (valor >= 0){
            this.capacidade = valor;
        }
        else {
            System.out.println("Erro: Tentativa de definir capacidade negativa bloqueada!");
        }
    }
}
