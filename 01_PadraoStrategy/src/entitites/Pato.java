package entitites;

import entitites.intef.ComportamentoQuack;

public abstract class Pato {
	
	ComportamentoQuack comportamentoQuack;
	
	public Pato(){		
	}
	
	public abstract void display();
	
	public void performaceQuack() {
		comportamentoQuack.quack();
	}
		
	public void setComportamentoQuack(ComportamentoQuack cp) {
		comportamentoQuack=cp;
	}

}
