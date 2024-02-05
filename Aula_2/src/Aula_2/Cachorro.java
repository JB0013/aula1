package Aula_2;

public class Cachorro {
	public String nome;
	public String raca;
	public String cor;
	public int idade;
	
	
	public void latir()  {
		System.out.println("O cachorro: " + nome + "latiu");
	}
	
	public void GetCachorro() {
		System.out.println(
			"Nome: " + nome +
			"\nRaça: " + raca +
			"\nIdade: " + idade +
			"\nCor: " + cor
			);
	}
}