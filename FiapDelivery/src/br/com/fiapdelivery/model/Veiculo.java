package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidadeKg; // alterado para ter sua unidade explícita

    public Veiculo(String placa, double capacidadeKg) {
        this.setPlaca(placa);
        this.setCapacidade(capacidadeKg);
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
		return this.capacidadeKg;
	}

    private void setCapacidade(double valor) {
        if (valor >= 0){
            this.capacidadeKg = valor;
        }
        else {
            System.out.println("Erro: Tentativa de definir capacidade negativa bloqueada!");
        }
    }
}
