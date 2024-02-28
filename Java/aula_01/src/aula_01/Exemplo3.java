package aula_01;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base,altura,area;
		
		System.out.println("Informe a altura: ");
		altura = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Informe a base: ");
		base = ler.nextInt();
		
		area = (base*altura)/2;
		System.out.println("A area é:" +area);

	}

}
