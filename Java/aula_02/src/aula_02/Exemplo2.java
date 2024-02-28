package aula_02;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		float quant, preco=0;
		String tipo = null;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a quantidade de litros: ");
		quant = ler.nextFloat();
		ler.nextLine();
		
		System.out.println("Informe o tipo: ");
		ler.nextLine();
		
		if (tipo.equals("A")) {
			preco = quant*1.7997f;
		} else if (tipo.equals("D")) {
			preco = quant*0.978f;
		} else if (tipo.equals("G")) {
			preco = quant*2.1007f;
		} else {
			System.out.println("Escolha incorreta");
		}
		System.out.printf("Preço total = %.2f", preco);

	}

}
