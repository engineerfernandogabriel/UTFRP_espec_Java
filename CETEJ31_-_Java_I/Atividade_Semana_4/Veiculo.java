public abstract class Veiculo{
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int velocMax;
    private int qtdRodas;
    private Motor motor;

    //construtor Default (sem parametros);
    public Veiculo(){
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.velocMax = 0;
        this.qtdRodas = 0;
        motor = new Motor();
    }

    //construtor recebendo parâmetros para a classe Veiculo e instanciando a classe Motor (sem parametros);
    public Veiculo(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        motor = new Motor();
    }

    //construtor instanciando a classe Motor com os paâmetros (atributos da classe motor);
    public Veiculo(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int qtdPist, int potencia){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
    }

    public abstract void calcVel();

    public String getPlaca(){
        return this.placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public int getVelocMax(){
        return this.velocMax;
    }

    public int getQtdRodas(){
        return this.qtdRodas;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public final void setPlaca(String placa){
        this.placa = placa;
    }

    public final void setMarca(String marca){
        this.marca = marca;
    }

    public final void setModelo(String modelo){
        this.modelo = modelo;
    }

    public final void setCor (String cor){
        this.cor = cor;
    }

    public final void setVelocMax(int velocMax){
        this.velocMax = velocMax;
    }

    public final void setQtdRodas (int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
}