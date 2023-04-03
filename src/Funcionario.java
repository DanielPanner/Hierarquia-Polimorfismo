
public class Funcionario extends Conta2 implements Funcao{


	
	public void setFuncao(String funcao) {
		super.setFuncao(funcao);
	}
	
	@Override
	public boolean funcao(String funcao) {
		return true;
	}

}


