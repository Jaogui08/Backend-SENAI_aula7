package backend.aula7.modificadores.exercicio1;

import java.util.Scanner;

public class Objeto_animal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Animal animal = new Animal();

		animal.setRaca("Cachorro");

		System.out.print("Informe o nome do animal " + animal.getRaca() + ": ");
		String name = scanner.next();

		animal.setNome(name);

		System.out.print("Informe o peso do animal " + animal.getRaca() + ": ");
		String peso = scanner.next();

		animal.setPeso(peso);

		System.out.println("\nAnimal de raça " + animal.getRaca() + " possui o nome " + animal.getNome() + " pesando "
				+ animal.getPeso() + "kg");

		scanner.close();
	}

}
