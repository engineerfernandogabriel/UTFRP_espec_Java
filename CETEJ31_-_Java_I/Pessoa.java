public class Pessoa{
	int rg;
	String nome;
	
	public void insereDados(){
		int id = 1;
		String apelido = "Jesus";
		rg = id;
		nome = apelido;
	}
	
	public void mostraDados(){
		System.out.println("\nRG: " + rg);
		System.out.println("\nNome: " + nome);
	}
	
	public static void main(String[] args){
		Pessoa p = new Pessoa();
		p.insereDados();
		p.mostraDados();
	}
}

