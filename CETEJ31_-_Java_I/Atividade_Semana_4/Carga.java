public final class Carga extends Veiculo implements Calc{
    
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

    public void calcVel(){
        int x = (getVelocMax() * 10000);
        System.out.println("\nVelocidade Maxima de Carga" + x + "CM/H");
    }

    public int calcular(){
        int somaNumeros = 0;

        somaNumeros += getMotor().getQtdPist();
        somaNumeros += getMotor().getPotencia();
        somaNumeros += getQtdRodas();
        somaNumeros += getVelocMax();
        somaNumeros += getTara();
        somaNumeros += getCargaMax(); 

        return somaNumeros;
    }
}