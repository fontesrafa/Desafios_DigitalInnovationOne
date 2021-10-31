import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EntrevistaEmbaracosa {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    

    public static void main(String[] args) throws IOException {
        String  str="", min=""; 
        while (( str = in.readLine()) != null) {
            boolean cond = false;
            //System.out.println("word: " + str);
            for (int i = 0; i <= str.length()-1; i++) { 
                //System.out.println("(0,0):" + str.substring(0, 0));
                //System.out.println("str.substring("+(i-1)+"): " + str.substring(i-1));
                
                if (str.substring(0,i).endsWith(str.substring(i))) {
                    System.out.println(str.substring(0, i));
                    cond = true;
                } 
            }
            if (!cond) System.out.println(str);
        }
            
    }
}