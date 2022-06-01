package aula12;

public  abstract class Animal { //classe abstract animal
	// atributos de animal
	protected float peso;
	protected int idade;
	protected int membros;
	
	//atributos metodos animal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirsom();
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}	
	
}

