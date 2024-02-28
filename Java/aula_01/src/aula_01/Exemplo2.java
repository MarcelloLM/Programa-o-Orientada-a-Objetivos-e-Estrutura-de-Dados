package aula_01;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int num;
		String nome;
		
		System.out.println("Digite um nome: ");
		nome = ler.nextLine();
		ler.nextLine();
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		System.out.println("Nome:" +nome);
		System.out.println("Numero:" +num);
		
	}

}
