package entitites;

public class PatoTipoQuack extends Pato {

	public  PatoTipoQuack() {
		comportamentoQuack= new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Display");
		
	}

}
