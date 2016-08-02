package pistoleiro;

public interface Pistoleiro {
	
	Float atirar();
	
	Pistoleiro defenderTiro(final Float tiro);
	
	Boolean estaVivo();
	
	String getNome();

}
