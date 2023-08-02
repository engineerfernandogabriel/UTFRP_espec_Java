public final class Passeio extends Veiculo implements Calc{
    
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

    public void calcVel(){
        int x = (getVelocMax() * 1000);
        System.out.println("\nVelocidade de Passeio: " + x + "M/H");
    }

    public int calcular(){
        int somaLetras = 0;

        somaLetras += getPlaca().length();
        somaLetras += getMarca().length();
        somaLetras += getModelo().length();
        somaLetras += getCor().length();

        return somaLetras;
    }
}