package Lista6;

import java.time.LocalDate;

public class Gato extends Mamifero implements Animal {
	
private String pelagem;
	
	public Gato() {
		super();
		this.pelagem ="";
		
	}
	
	public Gato(String nome, LocalDate nascimento, String pelagem) {
		super(nome, nascimento);
		this.pelagem = pelagem;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[Pelagem: " + this.pelagem + "]";

}

	@Override
	public String especie() {
		return "Felis Catus";
	}

	@Override
	public String somAnimal() {
		return "Miau";
	}

	@Override
	public Integer idade() {
		return LocalDate.now().getYear() - super.getNascimento().getYear();
	}
	
}
