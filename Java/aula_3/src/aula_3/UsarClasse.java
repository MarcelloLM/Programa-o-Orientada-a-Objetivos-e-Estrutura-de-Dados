package aula_3;

public class UsarClasse {

	public static void main(String[] args) {
		// instaciar -> criar objeto
		Carro primeiro = new Carro();
		primeiro.Ano = 2015;
		primeiro.Marca = "Volkswagen";
		primeiro.Modelo = "Gol";
		
		
		Carro segundo = new Carro ();
		segundo.Ano = 2020;
		segundo.Marca = "Fiat";
		segundo.Modelo = "Mobi";
		
		
		System.out.println("Ano do primeiro carro: " +primeiro.Ano);
		System.out.println("Marca do primeiro carro: " + primeiro.Marca);
		System.out.println("Modelo do primeiro carro: " +primeiro.Modelo);
		
		System.out.println("\n");
	
		System.out.println("Ano do segundo carro: " +segundo.Ano);
		System.out.println("Marca do segundo carro: " + segundo.Marca);
		System.out.println("Modelo do segundo carro: " +segundo.Modelo);
		
		// Classe Pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.Idade = 18;
		pessoa.Nome = "Marcello";
		pessoa.Renda = "0.44";
	}

}
