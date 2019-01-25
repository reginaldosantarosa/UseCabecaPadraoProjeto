package entitites;

import entitites.intef.ComportamentoQuack;

public class Mudo implements ComportamentoQuack {

	@Override
	public void quack() {
		System.out.println("Esse pato é mudo!!");
	}

}
