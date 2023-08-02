public class Motor{
    
    private int qtdPist;
    private int potencia;

    //construtor Default (sem parametros);
    public Motor(){
        this.qtdPist = 0;
        this.potencia = 0;
    }

    //construtor recebendo parâmetros (valores para os atributos);
    public Motor(int qtdPist, int potencia){
        this.qtdPist = qtdPist;
        this.potencia  = potencia;
    }

    public int getQtdPist(){
        return this.qtdPist;
    }

    public int getPotencia(){
        return this.potencia;        
    }

    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

}