package controle;

public class Produto {

private int estoque;	
private double preco;
private String codigo;
private int valorDaVenda;	

public Produto() {
	
	
	}

public Produto(int estoque, double preco, String codigo, int valorDaVenda) {
	this.estoque = estoque;
	this.preco = preco;
	this.codigo = codigo;
	this.valorDaVenda = valorDaVenda;
	
	}

public int getEstoque() {
	return estoque;
	}

public void setEstoque(int estoque) {
	this.estoque = estoque;
	}

public double getPreco() {
	return preco;
	}

public void setPreco(double preco) {
	this.preco = preco;
	}

public String getCodigo() {
	return codigo;
	}

public void setCodigo(String codigo) {
	this.codigo = codigo;
	}

public int getValorDaVenda() {
	return valorDaVenda;
	}

public void setValorDaVenda(int valorDaVenda) {
	this.valorDaVenda = valorDaVenda;
	}	

}