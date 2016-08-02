package brasil;

import java.util.Objects;

import pistoleiro.Pistoleiro;
import pistoleiro.PistoleiroFactory;
import pistoleiro.TipoPistoleiro;

public class PistoleiroBRFact implements PistoleiroFactory {
	
	public Pistoleiro create(final TipoPistoleiro tipo, final String nome){
		Objects.requireNonNull(tipo, "Tipo cannot be null");
		switch (tipo) {
		case DENTRO_DA_LEI:
			return new Capitao(nome);
		case FORA_DA_LEI:
			return new Cangaceiro(nome);
		default:
			throw new RuntimeException("Tipo de pistoleiro não valido");
		}
	}

}
