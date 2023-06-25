import java.util.Set;

public class Teste{
    public static void main(String[] args){
        Veiculo veiculo01 = new Veiculo();
        Veiculo veiculo02 = new Veiculo();
        Veiculo veiculo03 = new Veiculo();
        Veiculo veiculo04 = new Veiculo();
        Veiculo veiculo05 = new Veiculo();

        veiculo01.setCor("Branco");
        veiculo01.setMarca("VolksWagen");
        veiculo01.setModelo("Jetta");
        veiculo01.setPlaca("GOD-1212");
        veiculo01.setQtdRodas(4);
        veiculo01.setVelocMax(203);
        veiculo01.getMotor().setQtdPist(4);
        veiculo01.getMotor().setPotencia(150);
        
        veiculo02.setCor("Chumbo");
        veiculo02.setMarca("Honda");
        veiculo02.setModelo("City Hatchback");
        veiculo02.setPlaca("FFF-1212");
        veiculo02.setQtdRodas(4);
        veiculo03.setVelocMax(175);
        veiculo02.getMotor().setQtdPist(4);
        veiculo02.getMotor().setPotencia(126);

        veiculo03.setCor("Preto");
        veiculo03.setMarca("Chevrolet");
        veiculo03.setModelo("Onix");
        veiculo03.setPlaca("GGG-1212");
        veiculo03.setQtdRodas(4);
        veiculo03.setVelocMax(187);
        veiculo03.getMotor().setQtdPist(3);
        veiculo03.getMotor().setPotencia(116);

        veiculo04.setCor("Preto");
        veiculo04.setMarca("Yamaha");
        veiculo04.setModelo("YZF-R1");
        veiculo04.setPlaca("SAM-1212");
        veiculo04.setQtdRodas(2);
        veiculo04.setVelocMax(300);
        veiculo04.getMotor().setQtdPist(4);
        veiculo04.getMotor().setPotencia(198);

        veiculo05.setCor("Preto");
        veiculo05.setMarca("Harley Davidson");
        veiculo05.setModelo("Fat Bob 114");
        veiculo05.setPlaca("TOP-1212");
        veiculo05.setQtdRodas(2);
        veiculo05.setVelocMax(396);
        veiculo05.getMotor().setQtdPist(2);
        veiculo05.getMotor().setPotencia(114);

        veiculo01.toString();
        veiculo02.toString();
        veiculo03.toString();
        veiculo04.toString();
        veiculo05.toString();
    }
}