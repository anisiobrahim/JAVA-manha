package aula03;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		
		Double preco;
		Double desconto;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o pre�o do produto: ");
		preco = scan.nextDouble();
		scan.close();
		
		desconto = preco * 0.09;
		
		System.out.println("O preco do produto com desconto �:" + (preco - desconto));
		
	}
	
}
