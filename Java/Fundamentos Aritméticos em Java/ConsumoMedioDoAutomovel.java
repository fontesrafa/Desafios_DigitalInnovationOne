import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int km = leitor.nextInt();
        double litros = leitor.nextDouble();

        double media = km / litros;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media));   
    }
	
}