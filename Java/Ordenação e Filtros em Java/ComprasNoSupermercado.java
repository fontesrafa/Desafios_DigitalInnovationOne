import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class NameComparator implements Comparator<String> {
  
    // override the compare() method
    public int compare(String s1, String s2)
    {
        return s1.compareTo(s2);
    }
}
public class ComprasNoSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        String[] frase;
        
        int N = sc.nextInt();
        //System.out.println("N: " + N);
        sc.nextLine();
        
        for(int i = 0; i < N; i++) {
          frase = sc.nextLine().split(" ");
          //System.out.println("Frase: " + frase);
          //sc.nextLine();
          lista.clear();
          
          for(String item : frase) {
            //System.out.println(item);
            if(!lista.contains(item)) {
              lista.add(item);
              //System.out.print(item);
            }
          }
          
          Collections.sort(lista, new NameComparator());
          
          for(String item:lista){
            System.out.print(item + " ");
          }
          //System.out.println("Frase: " + frase);
          System.out.println();
        }
    }
}//Resolvido