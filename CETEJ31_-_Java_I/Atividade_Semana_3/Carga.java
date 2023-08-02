public class Carga extends Veiculo{
    
    private int cargaMax;
    private int tara;


    public Carga(){
        this.cargaMax = 0;
        this.tara = 0;
    }

    public int getCargaMax(){
        return this.cargaMax;
    }

    public int getTara(){
        return this.tara;
    }

    public void setCargaMax(int cargaMax){
        this.cargaMax = cargaMax;
    }

    public void setTara(int tara){
        this.tara = tara;
    }

    public float calcVel(float velocMax){
        float velocidade = (velocMax * 100000);

        return velocidade;
    }

    @Override
    public String toString(){
        System.out.println("============= VEICULO CARGA =============\n");
        System.out.println("Marca := " + this.getMarca());
        System.out.println("Modelo := " + this.getModelo());
        System.out.println("Placa := " + this.getPlaca());
        System.out.println("VelocMax := " + this.calcVel(this.getVelocMax()));
        System.out.println("Tara := " + this.getTara());
        System.out.println("Carga Maxima := " + this.getCargaMax());
        System.out.println("Potencia do Motor := " + this.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := " + this.getMotor().getQtdPist());
        System.out.println("\n============================================\n");
        return null;
    }
}