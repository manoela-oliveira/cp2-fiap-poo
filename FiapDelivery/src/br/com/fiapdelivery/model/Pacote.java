package br.com.fiapdelivery.model;

public class Pacote {
    private String codigoRastreamento; // alterado para ficar mais completo

    private double pesoKg; // alterado para ter sua unidade explícita
    private String statusEntrega;

    public Pacote(String codigoRastreamento, double pesoKg, String statusEntrega) {
        this.setCodigo(codigoRastreamento);
        this.setPeso(pesoKg);
        this.setStatusEntrega(statusEntrega);
    }

    public String getCodigo() {
		return this.codigoRastreamento;
	}

    private void setCodigo(String codigoRastreamento) {
        if (codigoRastreamento != null){
        this.codigoRastreamento = codigoRastreamento;
        }
        else{
            System.out.println("Erro: O espaço 'Código' deve conter ao menos 1 caracter válido.");
        }
    }

    public double getPeso() {
		return this.pesoKg;
	}

    private void setPeso(double pesoKg) {
        if (pesoKg >= 0){
            this.pesoKg = pesoKg;
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
