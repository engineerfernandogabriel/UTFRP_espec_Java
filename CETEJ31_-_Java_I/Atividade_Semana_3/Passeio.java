public final class Passeio extends Veiculo{
    
    private int qtdPassgeiros;

    public Passeio(){
        this.qtdPassgeiros = 0;
    }

    public int getQtdPassageiros(){
        return this.qtdPassgeiros;
    }

    public void setQtdPassageiros(int qtdPassgeiros){
        this.qtdPassgeiros = qtdPassgeiros;
    }

    public float calcVel(float velocMax){
        float velocidade = (velocMax * 1000);

        return velocidade;
    }
    
    @Override
    public String toString(){
        System.out.println("============= VEICULO PASSEIO =============\n");
        System.out.println("Marca := " + this.getMarca());
        System.out.println("Modelo := " + this.getModelo());
        System.out.println("Placa := " + this.getPlaca());
        System.out.println("VelocMax := " + this.calcVel(this.getVelocMax()));
        System.out.println("Qtd Passageiros := " + this.getQtdPassageiros());
        System.out.println("Potencia do Motr := " + this.getMotor().getPotencia());
        System.out.println("Qtd Pistoes Motor := " + this.getMotor().getQtdPist());
        System.out.println("\n============================================\n");
        return null;
    }
}