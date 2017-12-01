package aplicativo;

import aula09.Cliente;
import aula09.Cliente.FormaPagamento;
import aula09.Cliente.Tipo;
import aula09.Funcionario;
import aula09.Funcionario.Cargo;
import util.Criptografia;

public class App {
	public static void main(String[] args) {
		
	
	
	Cliente cliente = new Cliente();
	Funcionario funcionario = new Funcionario();
	
	cliente.setNome("Fulano de Tal");
	cliente.setEmail("fulano@detal.com.br");
	cliente.setLogin("fulano");
	cliente.setSenha(Criptografia.geraMD5("123"));
	cliente.setTelefone("(21) 980630055");
	cliente.setFormaPagamento(FormaPagamento.CARTAO);
	cliente.setTipo(Tipo.PESSOA_FISICA);
	
	System.out.println(cliente.atentica("fulano" , "123") ? " Login efetuado" : "Falha ao efetuar login");
	
	funcionario.setNome("José da Silva");
	funcionario.setEmail("jsilva@gmail.com");
	funcionario.setLogin("jsilva");
	funcionario.setSenha(Criptografia.geraMD5("2222"));
	funcionario.setSetor("TI");
	funcionario.setCargo(Cargo.ANALISTA);
	
	System.out.println(funcionario.atentica("jsilva" , "222") ? " Login efetuado" : "Falha ao efetuar login");
	
	}
}
	
	