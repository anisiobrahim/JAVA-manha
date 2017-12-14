package controle;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 int estoque;	
		 double preco;
		 String codigo;
		 int valorDaVenda;
		
		try (Scanner teclado = new Scanner(System.in)){
		System.out.println("Estoque do usuário do usuário: ");
		 estoque = teclado.nextInt();	
		 
		 System.out.println("Preço dos produtos é de: ");
		 preco = teclado.nextDouble();
		 
		 System.out.println("Código dos produtos é: ");
		 codigo = teclado.nextLine();
		 
		 System.out.println("O valor da venda dos produtos é: ");
		 valorDaVenda = teclado.nextInt();
		}
						 
	}

}
