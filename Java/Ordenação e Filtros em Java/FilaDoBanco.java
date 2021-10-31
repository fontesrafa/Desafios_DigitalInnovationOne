import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FilaDoBanco{

//    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
          int M = sc.nextInt();
          sc.nextLine();
          
          List<Integer> filaInic = new ArrayList<>();
          List<Integer> filaFin = new ArrayList<>();
          String[] fila = sc.nextLine().split(" ");
          
          for (String num : fila) {
            filaInic.add(Integer.parseInt(num));
          }

          
          filaFin.addAll(filaInic);
          
          Collections.sort(filaFin, Collections.reverseOrder());
          
          
          
          int count = 0;
          for (int j = 0; j < filaInic.size(); j++) {
              if(filaInic.get(j) == filaFin.get(j)) count++;
          }
          System.out.println(count);
        }
    
    
    
    }
}

