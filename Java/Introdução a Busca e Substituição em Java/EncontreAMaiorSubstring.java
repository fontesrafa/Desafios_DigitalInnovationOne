import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EncontreAMaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String word1="", word2="" , max="", min=""; 
        while (( word1 = in.readLine()) != null) { 
            //word1 = in.readLine();
            word2 = in.readLine();
            if (word1.length() >= word2.length()) {  
               max = word1;
               min = word2;
            } else {
               max = word2;
               min = word1;
            }
            //System.out.println(max);
            //System.out.println(min);
            
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
    }
}
            