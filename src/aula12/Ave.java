package aula12;

public class Ave extends Animal {
	
	private String corpena;

	@Override
	public void locomover() {
		System.out.println("voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
		
	}

	@Override
	public void emitirsom() {
		System.out.println(" som de ave");
		
	}
	public void fazendoNinho() {
		System.out.println(" contruindo ninho !!!");
	}

	public String getCorpena() {
		return corpena;
	}

	public void setCorpena(String corpena) {
		this.corpena = corpena;
	}
	

}
