package backend.aula7.modificadores.modificador_exemplo;

import java.util.Scanner;

public class Objeto_PessoaAutomovel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		String cor, nome;
		int velocidade;

		System.out.print("Informe a cor do carro: ");
		cor = scanner.next();

		System.out.print("Informe o nome do carro: ");
		nome = scanner.next();

		System.out.print("Informe a velocaidade do carro: ");
		velocidade = scanner.nextInt();

		pessoa.comprarCarro(velocidade, cor, nome);

		Automovel carro = pessoa.getAutomovel();

		System.out.println("\nO carro comprado foi: " + carro.getNome() + " de cor " + carro.getCor()
				+ " que atinge sua velocidade máxima de " + carro.getVelocidade() + "Km/H");

		scanner.close();
	}

}
