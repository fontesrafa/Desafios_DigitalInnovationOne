import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VogaisExtraterrestres {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           while(sc.hasNextLine()) {
             String vogals = sc.nextLine();
             //sc.nextLine();
             String sent = sc.nextLine();
             
             int count = 0;
             //System.out.println(vogals);
             //System.out.println(sent);
             
             for (char c1 : sent.toCharArray()) {
                //System.out.println(c1);
               for (char c2 : vogals.toCharArray()) {
                 if (c1 == c2) count++;
               }
             }
             System.out.println(count);
           }
    }
}