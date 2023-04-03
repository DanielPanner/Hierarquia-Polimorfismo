
public class Gerente extends Conta2 implements Funcao {
	
	public void setFuncao (String Funcao) {
		super.setFuncao("Gerente");
	}
	
	@Override
	public boolean funcao(String Funcao) {
		return false;
	}

	
	
}


