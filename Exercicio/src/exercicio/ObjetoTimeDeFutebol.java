
package exercicio;


public class ObjetoTimeDeFutebol {
	
	String NomeDoTime;
	String PresidenteDoTime;
	String TecnicoDoTime;
	String TitulosDoTime;
	
	public ObjetoTimeDeFutebol() {
		
	}
	
	public ObjetoTimeDeFutebol(String name, String nomePres, String tecnico, String titulo) {
		this.NomeDoTime = name;
		this.PresidenteDoTime = nomePres;
		this.TecnicoDoTime = tecnico;
		this.TitulosDoTime = titulo;
	}
	
	public String getPresidenteDoTime() {
		return presidenteDoTime;
	}
	public void setPresidenteDoTime(String presidenteDoTime) {
		this.presidenteDoTime = presidenteDoTime;
	}
	public String getTecnicoDoTime() {
		return tecnicoDoTime;
	}
	public void setTecnicoDoTime(String tecnicoDoTime) {
		this.tecnicoDoTime = tecnicoDoTime;
	}
	public String getTitulosDoTime() {
		return titulosDoTime;
	}
	public void setTitulosDoTime(String titulosDoTime) {
		this.titulosDoTime = titulosDoTime;
	}
	public String getNomeDoTime() {
		return nomeDoTime;
	}
	public void setNomeDoTime(String nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}
	
	@Override
	public String toString() {
		return "O " + this.nomeDoTime + " Tem como o atual presidente o " + this.presidenteDoTime + " e o atual técnico do Brasil é o " + this.tecnicoDoTime + " e tem " + this.titulosDoTime +".";
	}

}
