import java.io.IOException;
import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int positivos = 0;
        
        double num = 0.0;
        
        for(int i=0; i < 6; i++) {
          num = leitor.nextDouble();
          if (num > 0) {
            positivos++;
          }
        }
        
        System.out.println(positivos + " valores positivos");
        leitor.close();
    }
	
}