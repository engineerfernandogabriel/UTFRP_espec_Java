public abstract class Veiculo{
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
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
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        motor = new Motor();
    }

    //construtor instanciando a classe Motor com os paâmetros (atributos da classe motor);
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
    }

    abstract float calcVel(float VelocMax);

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

    public float getVelocMax(){
        return this.velocMax;
    }

    public int getQtdRodas(){
        return this.qtdRodas;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    public void setVelocMax(float velocMax){
        this.velocMax = velocMax;
    }

    public void setQtdRodas (int qtdRodas){
        this.qtdRodas = qtdRodas;
    }

    @Override
    public String toString(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("VelocMax: " + this.velocMax);
        System.out.println("QtdeRodas: " + this.qtdRodas);
        System.out.println("QtdPist: " + this.motor.getQtdPist());
        System.out.println("Potencia: " + this.motor.getPotencia());
        System.out.println("============================================");
        return null;
    }
}