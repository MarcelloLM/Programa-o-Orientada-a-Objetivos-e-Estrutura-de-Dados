package aula_01;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		if(idade<16) {
			System.out.println("Nao eleitor");
		} else if(idade>=18 && idade <= 65) {
			System.out.println("Eleitor optativo");
		}
		
		
	}

}
