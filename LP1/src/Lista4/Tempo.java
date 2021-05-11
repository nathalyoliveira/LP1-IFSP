package Lista4;

public class Tempo {
	
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tempo(Integer horas, Integer minutos, Integer segundos) {
		this.horas =  horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public Integer getHoras() {
		return horas;
	}
	
	public Integer getMinutos() {
		return minutos;
	}
	
	public Integer getSegundos(){
		return segundos;
	}
	
	public void setHoras (Integer horas) {
		this.horas = horas;
	}
	
	public void setMinutos (Integer minutos) {
		this.minutos = minutos;
	}
	
	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public String Imprimir (Integer horas, Integer minutos, Integer segundos) {
		
		return Integer.toString(horas) + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos);
	}
	
	public Integer Horasemsegundos() {
		if (horas > 0)
			return horas * 3600;
		else 
			return 0;
	}
	
	public Integer Minutosemsegundos() {
		if (minutos > 0)
			return minutos * 60;
		else 
			return 0;
	}
	
	
}
