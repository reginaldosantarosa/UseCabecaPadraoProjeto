package application;

import entitites.Pato;
import entitites.PatoTipoQuack;
import entitites.Mudo;

public class Program {

	public static void main(String[] args) {
	Pato patoTipoQuack= new PatoTipoQuack();
	patoTipoQuack.performaceQuack();
	patoTipoQuack.setComportamentoQuack(new Mudo());
	patoTipoQuack.performaceQuack();

	}

}
