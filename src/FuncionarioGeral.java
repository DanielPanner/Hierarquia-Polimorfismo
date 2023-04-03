
public class FuncionarioGeral{

	public static void main(String[] args) {
 
		
		caixa c = new caixa();
		c.setNome("Daniel");
		c.setSaldo(123.50);
		c.setConta("001-2253");
		c.setFuncao("Funcao");
		
		
		Gerente g = new Gerente();
		g.setNome("Reinaldo");
		g.setConta("002-0003");
		g.setSaldo(1934.60);
		g.setFuncao("Funcao");
		
		
		
		
		System.out.println( g.getNome()+ "\n" + g.getConta()  + "\n"  + g.getSaldo() + "\n"  +  g.getFuncao() );
		
		System.out.println("\n" + c.getNome()+ "\n" + c.getConta()  + "\n"  + c.getSaldo() + "\n"  + c.getFuncao() );
		
	}

}
