package entitites;

import entitites.intef.ComportamentoQuack;

public class Quack implements ComportamentoQuack {

	@Override
	public void quack() {
		System.out.println("Esse pato faz quack!!!");
		
	}

}
