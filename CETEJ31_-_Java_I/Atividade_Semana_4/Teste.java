import java.util.ArrayList;
import java.util.List;

public class Teste {

	private static final List<Passeio> passeioList = new ArrayList<>();
	private static final List<Carga> cargaList = new ArrayList<>();
	private static Leitura leitura = new Leitura();

	public static void main(String[] args) {

		int opcao = 0;

		do {
			try {

				System.out.println("\n\n================ Sistema de Gestao de Veiculos - Menu Inicial ================");
				System.out.println("\n");
				System.out.println("1 - Cadastrar Veiculo de Passeio");
				System.out.println("2 - Cadastrar Veiculo de Carga");
				System.out.println("3 - Imprimir Todos os Veiculos de Passeio");
				System.out.println("4 - Imprimir Todos os Veiculos de Carga");
				System.out.println("5 - Imprimir Veiculo de Passeio pela Placa");
				System.out.println("6 - Imprimir Veiculo de Carga pela Placa");
				System.out.println("7 - Sair do Sistema");

				opcao = Integer.parseInt(leitura.entDados("\nSelecione uma opcao: "));

				switch (opcao) {
				case 1:
					for (int i = 0; i < 5; i++) {
						if (passeioList.size() == 5) {
							leitura.entDados("\nLimite maximo de 5 Veiculos de Passeio atingido - Pressione <Enter>");
							break;
						} 
						
						System.out.println("===== Cadastrado Veiculo de Passeio ======");
						if (!cadastrarVeiculoPasseio()) {
							leitura.entDados("\nPlaca ja cadastrada em um veiculo de Passeio - Pressione <Enter>");
							break;
						} else {
							String sair = "";

							while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
								sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)ao>");
							}

							if (sair.equalsIgnoreCase("n"))
								break;
						}
					}
					break;
				case 2:
					for (int i = 0; i < 5; i++) {						
						if (cargaList.size() == 5) {
							leitura.entDados("\nLimite maximo de 5 Veiculos de Carga atingido - Pressione <Enter>");
							break;
						}
						
						System.out.println("===== Cadastrado Veiculo de Carga ======");
						if (!cadastrarVeiculoCarga()) {
							leitura.entDados("\nPlaca ja cadastrada em um veiculo de Carga - Pressione <Enter>");
							break;
						}
						
						String sair = "";

						while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
							sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)ao>");
						}

						if (sair.equalsIgnoreCase("n")) break;
					}
					break;
				case 3:
					System.out.println("\n");
					System.out.println("Lista com todos os veiculos de Passeio : ");
					listarTodosVeiculosPasseio();
					System.out.println("\n");
					break;
				case 4:
					System.out.println("\n");
					System.out.println("Lista com todos os veiculos de Carga");
					listarTodosVeiculosCarga();
					System.out.println("\n");
					break;
				case 5:
					System.out.println("\n===== Procurar veiculo de passeio pela placa =====");
					procurarVeiculosPasseioPorPlaca(leitura.entDados("\nDigite a placa para realizar a busca: "));
					break;
				case 6:
					System.out.println("\n===== Procurar veiculo de carga pela placa =====");
					procurarVeiculosCargaPorPlaca(leitura.entDados("\nDigite a placa para realizar a busca: "));
					break;
				case 7:
					System.out.println("Fim");
					break;
				default:
					System.out.println("Opçao nao encontrada");
					break;
				}

			} catch (Exception e) {
				System.out.println("Opçao invalida, tente novamente - Pressione Enter");
				leitura.entDados("");
				System.out.println("\n");
			}

		} while (opcao != 7);
	}

	public static boolean cadastrarVeiculoPasseio() throws Exception {

		Passeio newPasseio = new Passeio();

		newPasseio.setModelo(leitura.entDados("\nModelo do Veiculo: "));
		newPasseio.setMarca(leitura.entDados("\nMarca do Veiculo: "));
		newPasseio.setCor(leitura.entDados("\nCor do Veiculo: "));
		newPasseio.setPlaca(leitura.entDados("\nPlaca do Veiculo: "));
		newPasseio.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Maxima do Veiculo: ")));
		newPasseio.setQtdeRodas(Integer.parseInt(leitura.entDados("\nQuantidade de rodas do Veiculo: ")));
		newPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotencia do Veiculo: ")));
		newPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de pistao do Veiculo: ")));
		newPasseio.setQtdePassageiro(Integer.parseInt(leitura.entDados("\nQuantidade de passageiros do Veiculo: ")));

		if (passeioList.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newPasseio.getPlaca())).findAny()
				.isPresent()) {
			return false;
		}

		return passeioList.add(newPasseio);
	}

	public static boolean cadastrarVeiculoCarga() {

		Carga newCarga = new Carga();

		newCarga.setModelo(leitura.entDados("\nModelo do Veiculo: "));
		newCarga.setMarca(leitura.entDados("\nMarca do Veiculo: "));
		newCarga.setCor(leitura.entDados("\nCor do Veiculo: "));
		newCarga.setPlaca(leitura.entDados("\nPlaca do Veiculo: "));
		newCarga.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Maxima do Veiculo: ")));
		newCarga.setQtdeRodas(Integer.parseInt(leitura.entDados("\nQuantidade de Rodas do Veiculo: ")));
		newCarga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotencia do Veiculo: ")));
		newCarga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de Pistao do Veiculo: ")));
		newCarga.setCargaMax(Integer.parseInt(leitura.entDados("\nCarga Maxima do Veiculo: ")));
		newCarga.setTara(Integer.parseInt(leitura.entDados("\nTara do Veiculo: ")));

		if (cargaList.stream().filter(i -> i.getPlaca().equalsIgnoreCase(newCarga.getPlaca())).findAny().isPresent()) {
			return false;
		}

		return cargaList.add(newCarga);
	}

	public static void listarTodosVeiculosCarga() {

		for (Carga carga : cargaList) {
			System.out.println("\n===== Veiculo de Carga numero: " + (cargaList.indexOf(carga) + 1) + " ======");
			System.out.println(carga.toString());
			System.out.println("\nSoma de todos os valores de atributos numericos: " + carga.calcular());
			System.out.println("\nVelocidade do Veiculo de Carga: " + carga.calcVelocMax(carga.getVelocMax()) + "CM/H");
		}
	}

	public static void listarTodosVeiculosPasseio() {

		for (Passeio passeio : passeioList) {
			System.out.println("\n===== Veiculo de Passeio nº: " + (passeioList.indexOf(passeio) + 1) + " ======");
			System.out.println(passeio.toString());
			System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: " + passeio.calcular());
			System.out.println("\nVelocidade do Veiculo de Passeio: " + passeio.calcVelocMax(passeio.getVelocMax()) + "M/H");
		}
	}

	public static void procurarVeiculosCargaPorPlaca(String placa) {

		System.out.println("\n===== Placa Procurada na lista de Veiculos de Carga: " + placa + " ======");
		
		for (Carga carga : cargaList) {
			if (carga.getPlaca().equals(placa)) {
				System.out.println(carga.toString());
				System.out.println("\nSoma de todos os valores de atributos numericos: " + carga.calcular());
				System.out.println("\nVelocidade do Veiculo de Carga: " + carga.calcVelocMax(carga.getVelocMax()) + "CM/H");
			}
		}
	}

	public static void procurarVeiculosPasseioPorPlaca(String placa) {
		
		System.out.println("\n===== Placa Procurada na lista de Veiculos de Passeio: " + placa + " ======");
				
		for (Passeio passeio : passeioList) {

			if (passeio.getPlaca().equals(placa)) {

				System.out.println("\n===== Veiculo de Passeio numero: " + passeioList.indexOf(passeio) + " ======");
				System.out.println(passeio.toString());
				System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: " + passeio.calcular());
				System.out.println("\nVelocidade do Veiculo de Passeio: " + passeio.calcVelocMax(passeio.getVelocMax()) + "M/H");
			}
}
	}
}