package usa;

import java.util.Random;

import pistoleiro.Pistoleiro;

class Forasteiro implements Pistoleiro{
	/**
	 * Armazena em tempo de execução o nome do pistoleiro
	 */
	private String nome;
	/**
	 * Armazena em tempo de execução o quantidade de vida que o pistoleiro ainda
	 * tem, todo pistoleiro começa com a vida em 100%
	 */
	private float vida = 80;

	/**
	 * Construtor para criação de um pistoleiro novo, sendo necessário informar
	 * um nome para o mesmo
	 * 
	 * @param nome
	 */
	protected Forasteiro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Faz o disparo do pistoleiro, o disparo é baseado na força que um tiro
	 * pode ter, sendo de 0 .. 100
	 * 
	 * @return força que o tira tem
	 */
	public Float atirar() {
		// Para atirar utiliza um Random para gerar a força do disparo, porém
		// quando se utilizar nextFloat é gerado um número entre 0.0 a 1.0, por
		// isso é necessário multiplicar por 100 para termos um potência maior
		// no tiro. Exemplo, se o random gerar 0.9 após a multiplicação teremos
		// um tiro com 90 de força
		return new Random().nextFloat() * 70;
	}

	/**
	 * Utilizado pelo pistoleiro para defender um tiro disparado pelo outro, a
	 * força do tiro é subtraida da vida do pistoleiro
	 * 
	 * @param tiro
	 */
	public Forasteiro defenderTiro(Float tiro) {
		// O codigo abaixo é o mesmo que vida = vida - tiro;
		vida -= tiro;
		return this;
	}

	/**
	 * Informa se o pistoleiro esta vivo
	 * 
	 * @return true para vivo e false para morto
	 */
	public Boolean estaVivo() {
		// Código vida > 0 é igual ao código abaixo, porém de forma mais
		// reduzida, é retornado direto um boolean para vida maior que zero, o
		// retorno é boolean devido a definição no método
		// if (vida > 0) {
		// 	  return true;
		// } else {
		//    return false;
		// }
		return vida > 0;
	}

}
