package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String statusEntrega;

    public Pacote(String codigo, double peso, String statusEntrega) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setStatusEntrega(statusEntrega);
    }

    public String getCodigo() {
		return this.codigo;
	}

    private void setCodigo(String codigo) {
        if (codigo != null){
        this.codigo = codigo;
        }
        else{
            System.out.println("Erro: O espaço 'Código' deve conter ao menos 1 caracter válido.");
        }
    }

    public double getPeso() {
		return this.peso;
	}

    private void setPeso(double peso) {
        if (peso >= 0){
            this.peso = peso;
        }
        else {
            System.out.println("Erro: Tentativa de definir 'Peso' negativo bloqueada!");
        }
    }

    public String getStatusEntrega() {
		return this.statusEntrega;
	}

    private void setStatusEntrega(String statusAtual) {
        if (statusAtual != null){
        this.statusEntrega = statusAtual;
        }
        else{
            System.out.println("Erro: O espaço 'Status' deve conter ao menos 1 caracter válido.");
        }
    }


    public void alterarStatus(String statusAtual) {
        statusEntrega = statusAtual;
    }
}
