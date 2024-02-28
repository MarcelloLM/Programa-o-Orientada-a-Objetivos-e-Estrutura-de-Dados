package aula_02;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero,quant=0,cont=1;
		
		while(cont<=10) {
			System.out.println("Digite: ");
			numero = ler.nextInt();
			cont++;
			if(numero >= 30 && numero <= 90) {
				quant++;
			}
		}
		System.out.println("Quantidade" +quant);

	}

}
