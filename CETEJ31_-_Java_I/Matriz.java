import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Matriz {
	public static void main(String[] args){
		//preparar o ambiente para entrada de dados via teclado
		InputStreamReader keyboard = new InputStreamReader (System.in);
		BufferedReader buff = new BufferedReader(keyboard);
		String capt = "";
		
		//construir a matriz
		int qtdeLin;
		int qtdeCol;
		
		System.out.println("Digite a quantidade de linhas: ");
		try{
			capt = buff.readLine();
		}catch(IOException e){
			System.out.println("Erro no sistema");
		}
		int valueLine = Integer.parseInt(capt);
		qtdeLin = valueLine;
		
		System.out.println("Digite a quantidade de colunas: ");
		try{
			capt = buff.readLine();
		}catch(IOException e){
			System.out.println("Erro no sistema");
		}
		int valueColumn = Integer.parseInt(capt);
		qtdeCol = valueColumn;
		
		int matriz[][] = new int[qtdeLin][qtdeCol];
		
		for(int i = 0; i < qtdeLin; i++){
			for(int j = 0; j < qtdeCol; j++){
				System.out.println("Digite o valor da posicao [" + i + ", " + j + "]");
				try{
					capt = buff.readLine();
				}catch(IOException e){
					System.out.println("Erro no sistema");
				}
				
				int value = Integer.parseInt(capt);
				
				matriz[i][j] = value;
			}
		}
		
		System.out.println("\n\n ====== MATRIZ ======\n\n");
		for(int x = 0; x < qtdeLin; x++){
			for(int y = 0; y < qtdeCol; y++){
				System.out.println("matriz [" + x + ", " + y + "] :" + matriz[x][y]);
			}
		}
		
		int reverseLine = qtdeLin - 1;
		int reverseColumn = qtdeCol - 1;
		
		System.out.println("\n\n ====== MATRIZ com valores REVERSOS ======\n\n");
		for(int x = reverseLine; x >= 0; x--){
			for(int y = reverseColumn; y >= 0; y--){
				System.out.println("matriz [" + x + ", " + y + "] :" + matriz[x][y]);
			}
		}
	}
}