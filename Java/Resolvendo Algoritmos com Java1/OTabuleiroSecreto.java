import java.util.*;
import java.lang.*;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		while (sc.hasNextLine()) {
        
            int N = sc.nextInt();
            int Q = sc.nextInt();
            
            int[][] tab = new int[N][N];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tab[i][j] = 0;
                    //System.out.print(tab[i][j] + " ");
                }
                //System.out.println();
            }
            
            for (int i = 0; i < Q; i++) {
                //System.out.println("Q: " + i);
                int op = sc.nextInt();
                int X = sc.nextInt();
                int R = 0;
                
                if (op == 1 || op == 2) R = sc.nextInt();
                
                switch(op) {
                    case 1:
                        //System.out.println("Op 1");
                        for (int j = 0; j < N; j++) {
                            tab[X-1][j] = R;
                                //System.out.print(tab[i][j] + " ");
                        }
                        break;
                    
                    case 2:
                        //System.out.println("Op 2");
                        for (int j = 0; j < N; j++) {
                            tab[j][X-1] = R;
                                //System.out.print(tab[i][j] + " ");
                        }
                        break;
                    
                    case 3:
                        int[] line = new int[N];
                        for (int j = 0; j < N; j++) {
                            line[j] = tab[X-1][j];
                                //System.out.print(tab[i][j] + " ");
                        }
                        System.out.println(mostFrequent(line));
                        break;
                    
                    case 4:
                        int[] column = new int[N];
                        for (int j = 0; j < N; j++) {
                            column[j] = tab[j][X-1];
                                //System.out.print(tab[i][j] + " ");
                        }
                        System.out.println(mostFrequent(column));
                        break;
                }
    		}sc.nextLine();
		}
	}
	
	public static int mostFrequent(int[] lineOrColumn) {
	    
	    Map<Integer, Integer> frequencyValues = new HashMap<>();
	    
	    for(int i=0; i<lineOrColumn.length; i++) {
	        frequencyValues.putIfAbsent(lineOrColumn[i], 0);
	        //System.out.println("lineOrColumn[i]: " + lineOrColumn[i] + " frequencyValues.get(lineOrColumn[i]): " + frequencyValues.get(lineOrColumn[i]));
          frequencyValues.put(lineOrColumn[i], frequencyValues.get(lineOrColumn[i]) + 1);
      }
        
        List<Integer> numbers = new ArrayList<>(frequencyValues.keySet());
        List<Integer> mostFrequents = new ArrayList<>();
        
        int greaterFrequency = Collections.max(frequencyValues.values());
        
        for (int number : numbers) {
            if (frequencyValues.get(number) == greaterFrequency)
                mostFrequents.add(number);
      }
        
        Collections.sort(mostFrequents, Collections.reverseOrder());
        return mostFrequents.get(0);
	}

}//RESOLVIDO
