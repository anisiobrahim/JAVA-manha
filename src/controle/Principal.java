package controle;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 int estoque;	
		 double preco;
		 String codigo;
		 int valorDaVenda;
		
		try (Scanner teclado = new Scanner(System.in)){
		System.out.println("Estoque do usu�rio do usu�rio: ");
		 estoque = teclado.nextInt();	
		 
		 System.out.println("Pre�o dos produtos � de: ");
		 preco = teclado.nextDouble();
		 
		 System.out.println("C�digo dos produtos �: ");
		 codigo = teclado.nextLine();
		 
		 System.out.println("O valor da venda dos produtos �: ");
		 valorDaVenda = teclado.nextInt();
		}
						 
	}

}
