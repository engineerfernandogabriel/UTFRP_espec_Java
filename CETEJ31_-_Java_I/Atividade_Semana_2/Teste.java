public class Teste{

	public static void main(String[] args){
		Pai p = new Pai();

		p.nome = "Peter Parker";
		p.idade = 18;
		p.salario = 5000.00;

		p.cadPai("Barry Allen", 25, 5000);
		p.calcSalario();
		p.impPai();
	
	}
}