import java.util.*;

public class HashMagico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		leitor.nextLine();
		String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		for (int i = 0; i < N; i++) {
		  int element = 0;
		  int L = leitor.nextInt();
		  leitor.nextLine();
		  String[] lines = new String[L];
		  int sum = 0;
		  for (int x = 0; x < L; x++) {
		    lines[x] = leitor.nextLine();
		    String[] lineChars = lines[x].split("");
		    
		    for (int y = 0; y < lineChars.length; y++){
		        sum += alfa.indexOf(lineChars[y]) + x + y; 
		    }
		  }
		  System.out.println(sum);
		}
	}
}
//RESOLVIDO