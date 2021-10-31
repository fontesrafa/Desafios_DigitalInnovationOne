import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        int N = sc.nextInt();
        //System.out.println("N: " + N);
        sc.nextLine();
        int[] numbers = new int[N];
        
        for(int i = 0; i < N; i++) {
          numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
         
        
        for(int i = 0; i < N; i++) {
          if (numbers[i] % 2 == 0) {
            System.out.println(numbers[i]);
          }
        }
        
        for(int i = N - 1; i >= 0; i--) {
          if (numbers[i] % 2 != 0) {
            System.out.println(numbers[i]);
          }
        }      
        
    }
}//Resolvido