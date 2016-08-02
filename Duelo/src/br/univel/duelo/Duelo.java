package br.univel.duelo;

import pistoleiro.Pistoleiro;
import pistoleiro.PistoleiroFactory;
import pistoleiro.TipoPistoleiro;
import usa.PistoleiroUSFact;

/**
 * Inicia um duelo entre os pistoleiros
 * 
 * @author Will
 *
 */
public class Duelo {

	public static void main(String[] args) {
		// Inst�ncia dois pistoleiro para duelar
		PistoleiroFactory factory = new PistoleiroUSFact();
		Pistoleiro tripaSeca = factory.create(TipoPistoleiro.DENTRO_DA_LEI, "Tripa seca");
		Pistoleiro rachaCuca = factory.create(TipoPistoleiro.DENTRO_DA_LEI, "Racha Cuca");

		// Enquando os dois estiverem vivos o duelo continua
		while (tripaSeca.estaVivo() && rachaCuca.estaVivo()) {
			// C�digo faz o pistoleiro rachaCuca defender o tiro de tripaSeca, e
			// a linha abaixo faz o contrario. Como nosso jogo � simplificado
			// n�o precisa definir quem atira primeiro
			rachaCuca.defenderTiro(tripaSeca.atirar());
			tripaSeca.defenderTiro(rachaCuca.atirar());
		}

		// Verifica qual pistoleiro esta vivo e imprime o nome deste como
		// vencedor do duelo
		if (tripaSeca.estaVivo() && !rachaCuca.estaVivo()) {
			System.out.println("Pistoleiro Tripa seca vence o duelo");
		} else if (!tripaSeca.estaVivo() && rachaCuca.estaVivo()) {
			System.out.println("Pistoleiro Racha Cuca vence o duelo");
		} else {
			// Se entrar no else � porque n�o houve ganhador
			System.out.println("N�o houve vencedor do duelo");
		}

	}
}
