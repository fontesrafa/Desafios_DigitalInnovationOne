import java.util.Scanner;

public class CombinacaoDeStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] words, word1, word2, min, max;
		//int N = sc.nextInt();
		sc.nextLine();
		
		
		
		while (sc.hasNextLine()) {
		    StringBuilder sb = new StringBuilder();
		    String resultado = "";
		    int count = 0;
			words= sc.nextLine().split(" ");
			word1 = words[0].split("");
			word2 = words[1].split("");
			
			/*for (String letter :  word1) {
			    System.out.print(letter);
			}
			System.out.println();
			
			for (String letter :  word2) {
			    System.out.print(letter);
			}
			System.out.println();
			*/
			if (word2.length > word1.length) {
			    max = word2;
			    min = word1;
			} else {
				  max = word1;
			    min = word2;
			}
			/*
			for (String letter :  max) {
			    System.out.print(letter);
			}
			System.out.println();
			for (String letter :  min) {
			    System.out.print(letter);
			}
			*/
			
			    
			for (int k=0; k < min.length ; k++) {
				    sb.append(word1[k]);
				    sb.append(word2[k]);
				    count = k + 1;
			}
			if (count < max.length) {
  			for (int j=count; j < max.length ; j++) {
  			    sb.append(max[j]);
  			}
			}
			
			//System.out.println();
			
			System.out.println(sb.toString());
		}
	}
}