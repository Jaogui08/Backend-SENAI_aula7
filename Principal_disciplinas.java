package backend.aula7;

public class Principal_disciplinas {

	public static void main(String[] args) {
		
		for(Disciplinas_enum disciplinas : Disciplinas_enum.values()) {
			System.out.println(disciplinas);
		}
	}

}
