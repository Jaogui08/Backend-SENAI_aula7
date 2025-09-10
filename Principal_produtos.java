package backend.aula7;

public class Principal_produtos {

	public static void main(String[] args) {
		
		for(Produtos_enum produtos : Produtos_enum.values()) {
			System.out.println(produtos);
		}
	}

}
