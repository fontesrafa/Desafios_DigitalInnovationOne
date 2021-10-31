import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoEDivisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		leitor.nextLine();
		
		//System.out.println("N: " + N);
		//String[] lines = new String[N];
		//System.out.println("lines:" + lines);
		BigDecimal value;
		BigDecimal result = BigDecimal.ONE;
		String op = "";
		
		while (N > 0 && N < 100000) {
		  //leitor.nextLine();
		  String input = leitor.nextLine();
		  //System.out.println("lines["+i+"] :" + lines[i]);
		  //String[] op = lines[i].split(" ");
		  //System.out.println("op[0]:" + op[0]);
		  //System.out.println("op[1]:" + op[1]);
		  //String[] number = op[0].split("");
		  if(input.split(" ")[0].length() > 1) break;
		  value = new BigDecimal(input.split(" ")[0]);
		  op = input.split(" ")[1];
		  
		  if (op.equals("*")) {
		    result = result.multiply(value);
		  }
		  if (op.equals("/")) {
		      //if(value.compateTo(BigDecimal.ZERO) == 0) continue;
		      result = result.divide(value, 3, RoundingMode.CEILING);
		  }
		  N--;
		}
		leitor.close();
		
		BigDecimal maxInt = new BigDecimal(Integer.MAX_VALUE);
		if(result.compareTo(maxInt) > 0) {
		  System.out.println(result);
		} else {
		  System.out.println(result.intValue());
		}
	/*	  if (op[1] == "*") {
		    result /= Double.parseDouble(op[0]);
		    result *= 23.0;
		  } 
		  else if (op[1] == "/") {
		    result /= Double.parseDouble(op[0]);
		  }
	*/
		
		
	} //RESOLVIDO
}
