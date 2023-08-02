import java.util.Set;

public class Teste{
    public static void main(String[] args){
        Passeio veiculoPasseio01 = new Passeio();
        Passeio veiculoPasseio02 = new Passeio();
        Passeio veiculoPasseio03 = new Passeio();
        Passeio veiculoPasseio04 = new Passeio();
        Passeio veiculoPasseio05 = new Passeio();

        veiculoPasseio01.setCor("Branco");
        veiculoPasseio01.setMarca("VolksWagen");
        veiculoPasseio01.setModelo("Jetta");
        veiculoPasseio01.setPlaca("GOD-1212");
        veiculoPasseio01.setQtdRodas(4);
        veiculoPasseio01.setVelocMax(200);
        veiculoPasseio01.getMotor().setQtdPist(4);
        veiculoPasseio01.getMotor().setPotencia(150);
        veiculoPasseio01.setQtdPassageiros(5);

        veiculoPasseio02.setCor("Chumbo");
        veiculoPasseio02.setMarca("Honda");
        veiculoPasseio02.setModelo("City Hatchback");
        veiculoPasseio02.setPlaca("FFF-1212");
        veiculoPasseio02.setQtdRodas(4);
        veiculoPasseio02.setVelocMax(175);
        veiculoPasseio02.getMotor().setQtdPist(4);
        veiculoPasseio02.getMotor().setPotencia(126);
        veiculoPasseio02.setQtdPassageiros(5);

        veiculoPasseio03.setCor("Preto");
        veiculoPasseio03.setMarca("Chevrolet");
        veiculoPasseio03.setModelo("Onix");
        veiculoPasseio03.setPlaca("GGG-1212");
        veiculoPasseio03.setQtdRodas(4);
        veiculoPasseio03.setVelocMax(187);
        veiculoPasseio03.getMotor().setQtdPist(3);
        veiculoPasseio03.getMotor().setPotencia(116);
        veiculoPasseio03.setQtdPassageiros(5);

        veiculoPasseio04.setCor("Preto");
        veiculoPasseio04.setMarca("Yamaha");
        veiculoPasseio04.setModelo("YZF-R1");
        veiculoPasseio04.setPlaca("SAM-1212");
        veiculoPasseio04.setQtdRodas(2);
        veiculoPasseio04.setVelocMax(300);
        veiculoPasseio04.getMotor().setQtdPist(4);
        veiculoPasseio04.getMotor().setPotencia(198);
        veiculoPasseio04.setQtdPassageiros(2);

        veiculoPasseio05.setCor("Preto");
        veiculoPasseio05.setMarca("Harley Davidson");
        veiculoPasseio05.setModelo("Fat Bob 114");
        veiculoPasseio05.setPlaca("TOP-1212");
        veiculoPasseio05.setQtdRodas(2);
        veiculoPasseio05.setVelocMax(396);
        veiculoPasseio05.getMotor().setQtdPist(2);
        veiculoPasseio05.getMotor().setPotencia(114);
        veiculoPasseio05.setQtdPassageiros(2);
                
        veiculoPasseio01.toString();
        veiculoPasseio02.toString();
        veiculoPasseio03.toString();
        veiculoPasseio04.toString();
        veiculoPasseio05.toString();

        Carga veiculoCarga01 = new Carga();
        Carga veiculoCarga02 = new Carga();
        Carga veiculoCarga03 = new Carga();
        Carga veiculoCarga04 = new Carga();
        Carga veiculoCarga05 = new Carga();
    
        veiculoCarga01.setCor("Branco");
        veiculoCarga01.setMarca("Fiat");
        veiculoCarga01.setModelo("Strada");
        veiculoCarga01.setPlaca("GIO-1212");
        veiculoCarga01.setQtdRodas(4);
        veiculoCarga01.setVelocMax(164);
        veiculoCarga01.getMotor().setQtdPist(7);
        veiculoCarga01.getMotor().setPotencia(88);
        veiculoCarga01.setCargaMax(705);
        veiculoCarga01.setTara(1084);

        veiculoCarga02.setCor("Preto");
        veiculoCarga02.setMarca("Chevrolet");
        veiculoCarga02.setModelo("S10");
        veiculoCarga02.setPlaca("FEF-1212");
        veiculoCarga02.setQtdRodas(4);
        veiculoCarga02.setVelocMax(180);
        veiculoCarga02.getMotor().setQtdPist(8);
        veiculoCarga02.getMotor().setPotencia(200);
        veiculoCarga02.setCargaMax(1061);
        veiculoCarga02.setTara(2750);

        veiculoCarga03.setCor("Vermelho");
        veiculoCarga03.setMarca("Ford");
        veiculoCarga03.setModelo("RANGER");
        veiculoCarga03.setPlaca("GRA-1212");
        veiculoCarga03.setQtdRodas(4);
        veiculoCarga03.setVelocMax(170);
        veiculoCarga03.getMotor().setQtdPist(8);
        veiculoCarga03.getMotor().setPotencia(173);
        veiculoCarga03.setCargaMax(1298);
        veiculoCarga03.setTara(3200);

        veiculoCarga04.setCor("Branco");
        veiculoCarga04.setMarca("Mitsubshi");
        veiculoCarga04.setModelo("L-200");
        veiculoCarga04.setPlaca("FER-1212");
        veiculoCarga04.setQtdRodas(4);
        veiculoCarga04.setVelocMax(190);
        veiculoCarga04.getMotor().setQtdPist(8);
        veiculoCarga04.getMotor().setPotencia(190);
        veiculoCarga04.setCargaMax(1046);
        veiculoCarga04.setTara(1940);

        veiculoCarga05.setCor("Branco");
        veiculoCarga05.setMarca("Volkswagen");
        veiculoCarga05.setModelo("Amarok");
        veiculoCarga05.setPlaca("ANA-1212");
        veiculoCarga05.setQtdRodas(4);
        veiculoCarga05.setVelocMax(190);
        veiculoCarga05.getMotor().setQtdPist(7);
        veiculoCarga05.getMotor().setPotencia(180);
        veiculoCarga05.setCargaMax(1280);
        veiculoCarga05.setTara(2185);
   
        veiculoCarga01.toString();
        veiculoCarga02.toString();
        veiculoCarga03.toString();
        veiculoCarga04.toString();
        veiculoCarga05.toString();

    }
}