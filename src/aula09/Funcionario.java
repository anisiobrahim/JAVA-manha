package aula09;

public  class Funcionario extends Pessoa {
	
	private Double salario;
	private String setor;
	private Cargo cargo;
	
	public Funcionario() {
		
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String Setor) {
		this.setor = setor;
	}
	
	public Cargo setCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public enum Cargo {
		SECRETARIA, ANALISTA, DIRETOR, GERENTE;
	}

}
