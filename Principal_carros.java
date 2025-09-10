package backend.aula7;

public class Principal_carros {

	public static void main(String[] args) {
		
		for(Carros_enum carros : Carros_enum.values()) {
			System.out.println(carros);
		}
	}

}
