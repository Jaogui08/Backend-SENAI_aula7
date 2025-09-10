package backend.aula7.modificadores.modificador_exemplo;

public class Pessoa extends Automovel{
	private String nome;
	private int idade;
	private String profissao;
	private Automovel automovel;
	
	public void comprarCarro(int velocidade, String cor, String nome) {
		automovel = new Automovel();
		automovel.setVelocidade(velocidade);
		automovel.setCor(cor);
		automovel.setNome(nome);
	}
	
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
