package Aula_2;

public class Carro {

		public String marca;
		public String modelo;
		public String cor;
		public int ano;
		public String estado;
		
		
		public void ligar()  {
			System.out.println("O carro: " + modelo + "ligou");
		}
		
		public void GetCarro() {
			System.out.println(
				"Marca: " + marca +
				"\nModelo: " + modelo +
				"\nAno: " + ano +
				"\nCor: " + cor +
				"\nEstado: " + estado 
				);
		}
	}
