package br.com.fiapdelivery.model;

public class Rota {
    private String destino;

    private Pacote produtoEntrega;
    private Veiculo veiculoUtilizado;

    public Rota(String destino, Pacote produtoEntrega, Veiculo veiculoUtilizado) {
        this.setDestino(destino);
        this.produtoEntrega = produtoEntrega;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public String getDestino() {
		return this.destino;
	}

    private void setDestino(String destino) {
        if (destino != null){
        this.destino = destino;
        }
        else{
            System.out.println("Erro: O espaço 'Destino' deve conter ao menos 1 caracter válido.");
        }
    }

    public Pacote getProdutoEntrega() {
		return this.produtoEntrega;
	}

    public Veiculo getVeiculoUtilizado() {
		return this.veiculoUtilizado;
	}

    public void exibirInformações() {
        System.out.println("\n>>> INFORMAÇÕES DE ENTREGA <<<");
        System.out.println("Destino: " + this.destino);
        System.out.println("Produto: " + this.produtoEntrega.getCodigo());
        System.out.println("Veículo: " + this.veiculoUtilizado.getPlaca());
    }

    public void realizarEntrega() {
        System.out.println("Levando pacote " + this.produtoEntrega.getCodigo() + " no veiculo " + this.veiculoUtilizado.getPlaca() + " para o(a) " + this.destino);
    }
}
