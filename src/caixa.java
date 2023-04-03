
public class caixa extends Conta2 implements Funcao {

	public void setFuncao(String funcao) {
		super.setFuncao("Caixa");
	}
	
	@Override
	public boolean funcao(String funcao) {
		return false;
	}

}
