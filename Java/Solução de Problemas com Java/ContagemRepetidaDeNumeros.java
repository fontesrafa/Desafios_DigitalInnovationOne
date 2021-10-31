import java.util.*;
import java.io.*;

public class ContagemRepetidaDeNumeros {

	public static void main(String[] args) {
           Scanner scr = new Scanner(System.in);
           int valores = scr.nextInt();
           Map<Integer, Integer> numeros = new HashMap<>();

    //declare as variaveis corretamente e continue a sua solução

        for (int i = 0; i < valores; i++) {
            int numero = scr.nextInt();
    
            if(numeros.containsKey(numero)) {
              numeros.put(numero, numeros.get(numero) + 1);
            } else {
              numeros.put(numero, 1);  
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println( e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}//RESOLVIDO