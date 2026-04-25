package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.setPossuiBau(possuiBau);
    }

    public boolean getPossuiBau() {
		return this.possuiBau;
	}

    private void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    public boolean adicionarBau() {
        if (!this.possuiBau) {
            this.setPossuiBau(true);
            System.out.println("Baú adicionado à moto " + this.getPlaca() + ".");
            return true;
        } else {
            System.out.println("A moto " + this.getPlaca() + " já possui um baú.");
            return false;
        }
    }

    public boolean removerBau() {
        if (this.possuiBau) {
            this.setPossuiBau(false);
            System.out.println("Baú removido da moto " + this.getPlaca() + ".");
            return true;
        } else {
            System.out.println("A moto " + this.getPlaca() + " não possui um baú para ser removido.");
            return false;
        }
    }

}