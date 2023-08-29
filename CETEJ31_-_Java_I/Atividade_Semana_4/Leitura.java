import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
    public String entDados(String prompt){

        System.out.println(prompt);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String ret = " ";

        try{
            ret = buff.readLine();
        }catch (IOException e){
            System.out.println("\n Erro de sistema" + e.getMessage());
        }

        return ret;
    }
}