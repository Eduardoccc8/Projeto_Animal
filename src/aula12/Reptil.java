package aula12;

public class Reptil extends Animal {
	
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("rastejando");
		
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo vegetais");
		

	}

	@Override
	public void emitirsom() {
		System.out.println("som reptil");
		
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
