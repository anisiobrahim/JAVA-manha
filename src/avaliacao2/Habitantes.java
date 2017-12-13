package avaliacao2;

import java.io.IOException;
import java.util.Scanner;

public class Habitantes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int IdadeMax=-35;
        int Idade;
        String Cor_cabelo;        
        String Cor_olho;          
        int Sexo;              
        int i;

        for(i=0; i<30; i++)
        {
            System.out.println("Sexo: ");

        try
        {
            Sexo = (int) System.in.read();
        }
        catch(IOException erro)
        {
            System.err.println(erro.getMessage());
        }
        System.out.println();



            System.out.println("sexo: ");      


            System.out.println("Cor dos olhos: ");   





            Cor_olho=teclado.next();
            





            System.out.println("Cor dos cabelos: ");



            Cor_cabelo=teclado.next();
            



            System.out.println("Idade: ");
            Idade=teclado.nextInt();
            if (Idade>IdadeMax)
            {
                IdadeMax=Idade;
            }


            if ((Sexo='M') == 0 ) && Cor_olho='V' && Cor_cabelo='L'){
            	
            }
            	
            
            {

           }

        }
    }





