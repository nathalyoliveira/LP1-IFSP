package Lista6;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements Animal {
	
	private String cor;
	
	public Cachorro() {
		super();
		this.cor ="";
		
	}
	
	public Cachorro(String nome, LocalDate nascimento, String cor) {
		super(nome, nascimento);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[Cor: " + this.cor + "]";
	}

	@Override
	public String especie() {
		return "C.lupus";
	}

	@Override
	public String somAnimal() {
		return "Auau";
	}

	@Override
	public Integer idade() {
		return LocalDate.now().getYear() - super.getNascimento().getYear();
	}

}
