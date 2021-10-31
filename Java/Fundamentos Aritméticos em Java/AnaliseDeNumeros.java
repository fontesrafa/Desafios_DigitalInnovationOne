import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int x = 0;

//continue a solução
        for (int i=0; i<5; i++) {
        	x = leitor.nextInt();
        	if(x%2 == 0) {
        	  pares++;
        	} else {
        	  impares++;
        	}
        	if(x<0) {
        	  negativos++;
        	} else if (x>0){
        	  positivos++;
        	}
        }
//insira suas variaveis corretamente
        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }
	
}