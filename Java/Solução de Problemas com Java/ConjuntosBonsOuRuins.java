import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConjuntosBonsOuRuins {

	public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
           int N = Integer.valueOf(br.readLine());
           //sc.nextLine();
           
           
           while (N != 0) {
             List<String> list = new ArrayList<>();
             
             String cond = "Conjunto Bom";
             
             for (int i = 0; i < N; i++) {
               list.add(br.readLine());
             }
             
             list = list.stream().sorted().collect(Collectors.toList()); 
             
             for (int i = 0; i < N - 1; i++) {
                if (list.get(i + 1).startsWith(list.get(i))) {
                    cond = "Conjunto Ruim";
                    break;
                }
              }
             
             System.out.println(cond);
             
             N = Integer.valueOf(br.readLine());
             //sc.nextLine();
             //System.out.println("N: " + N);
             
           }
           
           
    }
}//RESOLVIDO