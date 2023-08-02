import java.lang.NumberFormatException;

public class Teste{

    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();

    private static Passeio vetPasseio[] = new Passeio[5];
    private static Carga vetCarga[] = new Carga[5];

    private static Leitura leitura = new Leitura();

    public static void main(String[] args){
        boolean continua = true;
        int opcao = 0;

        while(continua){
            System.out.println("\n SISTEMA DE GESTAO DE VEICULOS - MENU INICIAL ");
            System.out.println("\t(1) Cadastrar veiculo de Passeio");
            System.out.println("\t(2) Cadastrar veiculo de Carga");
            System.out.println("\t(3) Imprimir todos os veiculos de Passeio");
            System.out.println("\t(4) Imprimir todos os veiculos de Carga");
            System.out.println("\t(5) Imprimir veiculo de Passeio pela placa");
            System.out.println("\t(6) Imprimir veiculo de Carga pela placa");
            System.out.println("\t(7) Sair do Sistema");

            try{
                opcao = Integer.parseInt(leitura.entDados("\n\tEscolha uma opcao: "));
            }catch(NumberFormatException e){
                System.out.println("Deve ser um valor inteiro - pressione <ENTER>");
                leitura.entDados("");

                continue;
            }

            switch(opcao){
                case 1: 
                        for(int i = achaVagoPasseio(); i < vetPasseio.length; i++){
                            if(i == -1){
                                leitura.entDados("\nVetor de Passeio esta cheio!! pressionae <ENTER>");
                                break;
                            }

                            passeio = new Passeio();

                            vetPasseio[i] = cadastroPasseio(passeio);

                            leitura.entDados("\nPasseio armazenado na poisicao " + i + " do vetor - pressione <ENTER>");

                            String respostaPasseio = leitura.entDados("\nDeseja cadastrar outro Passeio ? <s/n>");

                            if(respostaPasseio.equalsIgnoreCase("n")){
                                break;
                            }

                            if(achaVagoPasseio() == -1){
                                leitura.entDados("\nVetor de Passeio esta cheio!! presssione <ENTER>");
                                break;
                            }
                      }   
                        break;
                case 2:
                        for(int i = achaVagoCarga(); i < vetCarga.length; i++){
                            if(i == -1){
                                leitura.entDados("\nVetor de Carga esta cheio!! pressionae <ENTER>");
                                break;
                            }

                            carga = new Carga();

                            vetCarga[i] = cadastroCarga(carga);

                            leitura.entDados("\nCarga armazenado na poisicao " + i + " do vetor - pressione <ENTER>");

                            String respostaCarga = leitura.entDados("\nDeseja cadastrar outro Carga ? <s/n>");

                            if(respostaCarga.equalsIgnoreCase("n")){
                                break;
                            }

                            if(achaVagoCarga() == -1){
                                leitura.entDados("\nVetor de Carga esta cheio!! presssione <ENTER>");
                                break;
                            }
                        }   
                        break;
                case 3: 
                        System.out.println("\nPasseio - Impressao de todos veiculos");
                        System.out.println("==================================================");
                        for(int i = 0; i < vetPasseio.length; i++){
                            if(vetPasseio[i] == null){
                                imprimiPasseio(vetPasseio[i], i);
                            } else {
                                leitura.entDados("\nSem mais Veiculos Passeio para imprimir - pressione >ENTER>");
                            }
                        }
                        System.out.println("==================================================");
                        break;
                case 4:
                        System.out.println("\nCarga - Impressao de todos veiculos");
                        System.out.println("==================================================");
                        for(int i = 0; i < vetCarga.length; i++){
                            if(vetCarga[i] == null){
                                imprimiCarga(vetCarga[i], i);
                            } else {
                                leitura.entDados("\nSem mais Veiculos Carga para imprimir - pressione >ENTER>");
                            }
                        }
                        System.out.println("==================================================");
                        break;
                case 5:
                        System.out.println("\nConsulta de Placa - Veiculos de Passeio");
                        System.out.println("==================================================");

                        passeio = new Passeio();

                        boolean existePlacaPasseio = false;

                        String placaPasseio = leitura.entDados("\nInforme a placa para pesquisa: ");

                        passeio.setPlaca(placaPasseio);

                        for(int i = 0; i < vetPasseio.length; i++){
                            if(vetPasseio[i].getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                                imprimiPasseio(vetPasseio[i], i);
                                existePlacaPasseio = true;
                            }
                        }

                        if(!existePlacaPasseio){
                            leitura.entDados("\n\n\t\t\t======== NAO existe veiculo de placa cadastrado com esta placa - presssiona <ENTER>");
                        }
                        System.out.println("==================================================");
                        break;
                case 6:
                        System.out.println("\nConsulta de Placa - Veiculos de Carga");
                        System.out.println("==================================================");

                        carga = new Carga();

                        boolean existePlacaCarga = false;

                        String placaCarga = leitura.entDados("\nInforme a placa para pesquisa: ");

                        passeio.setPlaca(placaCarga);

                        for(int i = 0; i < vetPasseio.length; i++){
                            if(vetCarga[i].getPlaca().equalsIgnoreCase(carga.getPlaca())){
                                imprimiPasseio(vetPasseio[i], i);
                                existePlacaCarga = true;
                            }
                        }

                        if(!existePlacaCarga){
                            leitura.entDados("\n\n\t\t\t======== NAO existe veiculo de placa cadastrado com esta placa - presssiona <ENTER>");
                        }
                        System.out.println("==================================================");
                        break;
                case 7:
                    continua = false;
                    break;
                default:
                    leitura.entDados("\nO valor deve ser >= 1 e <= 7 pressione <ENTER> ");
                    break;

            }
        }
    }

    public static int achaVagoPasseio(){
        for(int i = 0; i < vetPasseio.length; i++){
            if(vetPasseio[i] == null){
                return i;
            }
        }
        return -1;
    }

    public static int achaVagoCarga(){
        for(int i = 0; i < vetCarga.length; i++){
            if(vetCarga[i] == null){
                return i;
            }
        }
        return -1;
    }

    public static Passeio cadastroPasseio(Passeio passeio){
        System.out.println("\n\n ========================================");
        System.out.println("Cadastro de Veiculos de Passeio");
        System.out.println(" ========================================");
        passeio.setQtdPassageiros(Integer.parseInt(leitura.entDados("Quantidade de Passageiros: ")));
        passeio.setPlaca(leitura.entDados("Placa: "));
        passeio.setMarca(leitura.entDados("Marca: "));
        passeio.setModelo(leitura.entDados("Modelo: "));
        passeio.setCor(leitura.entDados("Cor"));
        passeio.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de Rodas: ")));
        passeio.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade Maxima: ")));
        passeio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de Pistoes do motor: ")));
        passeio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potencia do motor: ")));

        return passeio;
    }

    public static void imprimiPasseio(Passeio passeio, int i){
        System.out.println("\nPasseio armazenado no endereco: " + i + " (do vetor Passeio)");
        System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros());
        System.out.println("Placa:" + passeio.getPlaca());
        System.out.println("Marca: " + passeio.getMarca());
        System.out.println("Modelo: " + passeio.getMarca());
        System.out.println("Cor: " + passeio.getCor());
        System.out.println("Quantidade de Rodas: " + passeio.getQtdRodas());
        System.out.println("Velocidade Maxima: " + passeio.getVelocMax());
        System.out.println("Quantidade de Pistoes: " + passeio.getMotor().getQtdPist());
        System.out.println("Potencia do motor: " + passeio.getMotor().getPotencia());
        System.out.println("Quantidade total de letras: " + passeio.calcular());
        passeio.calcVel();
    }

    public static Carga cadastroCarga(Carga carga){
        System.out.println("\n\n ========================================");
        System.out.println("Cadastro de Veiculos de Carga");
        System.out.println(" ========================================");
        carga.setTara(Integer.parseInt(leitura.entDados("Tara: ")));
        carga.setCargaMax(Integer.parseInt(leitura.entDados("Carga Maxima: ")));
        carga.setPlaca(leitura.entDados("Placa: "));
        carga.setMarca(leitura.entDados("Marca: "));
        carga.setModelo(leitura.entDados("Modelo: "));
        carga.setCor(leitura.entDados("Cor"));
        carga.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de Rodas: ")));
        carga.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade Maxima: ")));
        carga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de Pistoes do motor: ")));
        carga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potencia do motor: ")));

        return carga;
    }

    public static void imprimiCarga(Carga carga, int i){
        System.out.println("\nCarga armazenado no endereco: " + i + " (do vetor Carga)");
        System.out.println("Tara: " + carga.getTara());
        System.out.println("Carga Maxima: " + carga.getCargaMax());
        System.out.println("Placa:" + carga.getPlaca());
        System.out.println("Marca: " + carga.getMarca());
        System.out.println("Modelo: " + carga.getMarca());
        System.out.println("Cor: " + carga.getCor());
        System.out.println("Quantidade de Rodas: " + carga.getQtdRodas());
        System.out.println("Velocidade Maxima: " + carga.getVelocMax());
        System.out.println("Quantidade de Pistoes: " + carga.getMotor().getQtdPist());
        System.out.println("Potencia do motor: " + carga.getMotor().getPotencia());
        System.out.println("Quantidade total de letras: " + carga.calcular());
        carga.calcVel();
    }
}