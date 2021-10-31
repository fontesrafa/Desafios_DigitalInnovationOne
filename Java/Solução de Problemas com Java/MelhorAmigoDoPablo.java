import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class MelhorAmigoDoPablo {

	public static void main(String[] args) {
	    
	    class SortList implements Comparator<String> {
        
          public int compare(String s1, String s2) {
              return s2.length() - s1.length();
          }
      }
           Scanner sc = new Scanner(System.in);
           
           String frase = sc.nextLine();
           List<String> listY = new ArrayList<>();
           List<String> listN = new ArrayList<>();
           List<String> listF = new ArrayList<>();
           
           while(!frase.equals("FIM")) {
             //System.out.println(frase);
             String name = frase.split(" ")[0];
             String opt = frase.split(" ")[1];
             
             if (!listY.contains(name)){
                if (opt.equals("SIM")) listY.add(name);
                else listN.add(name);
             }
             frase = sc.nextLine();
           }
           
           listF.addAll(listY);
           Collections.sort(listY);
           Collections.sort(listN);
           for (String s : listY) System.out.println(s);
           for (String s : listN) System.out.println(s);
           
           Collections.sort(listF, new SortList());
           System.out.println();
           System.out.println("Amigo do Pablo:");
           System.out.println(listF.get(0));
           //System.out.println();
           //for (String s : listY) System.out.println(s);
    }
}//RESOLVIDO