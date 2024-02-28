package aula_01;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float qtdlitros,preco;
		String opcao;
		
		System.out.println("Informe a quantidade de litros: ");
		qtdlitros = ler.nextFloat();
		
		System.out.println("Escolha a opção A: Alcool \n G: Gasolina \n D: Diesel");
		ler.nextLine();
		opcao = ler.nextLine();
		switch (opcao) {
		case "A" :
			preco = qtdlitros * 1.9777f;
			System.out.println("Preço = "+preco);
			break;
		case "G" :
			preco = qtdlitros * 2.8877f;
			System.out.println("Preço = "+preco);
			break;
		}

	}

}
