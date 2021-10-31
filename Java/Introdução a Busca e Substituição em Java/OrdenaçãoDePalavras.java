import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class CompareStrings implements Comparator<String>{
            @Override
            public int compare(String str1, String str2) {
              if (str1.length() == str2.length()){
                return str1.compareTo(str2);
              } else {
                  if(str1.length() > str2.length()) {
                      return -1;
                  } else {
                      return 1;
                  }
              }
            }
}

public class OrdenaçãoDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < N; i++){
          List<String> lista = new ArrayList<>();
          String[] words = sc.nextLine().split(" ");
          
          for(String word: words) {
            lista.add(word);
          }
          
          Collections.sort(lista, new CompareStrings());
          
          for (String word: lista) {
            System.out.print(word + " ");
          }
          System.out.println();
        }
        
    }
  //Resolvido
}