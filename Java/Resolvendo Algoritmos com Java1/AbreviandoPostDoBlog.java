
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AbreviandoPostDoBlog {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words;
		
		while (!".".equals((words = br.readLine()))) {
		    Map<String, String> dictionary = new TreeMap<>();
		    String saida = "";
            
            List<String> letters = new ArrayList<>();
            
            for (String word : words.split(" ")) {
                if (!letters.contains(word.split("")[0]) && word.length() > 2) {
                    letters.add(word.split("")[0]);
                    //System.out.println(word.split("")[0]);
                }
            }
		    Map<String, Integer> countList = new HashMap<>();
		    Map<String, Integer> sizeList = new HashMap<>();
		    List<String> list = new ArrayList<>();
		    
		        for (String word: words.split(" ")) {
    		        if (word.length() > 2){
    		            list.add(word);
    		        }
    		    }
		    
    		    for (String word: list) {
    		        countList.putIfAbsent(word, 0);
    		        countList.put(word, countList.get(word) + 1);
    		    }
		    
    		    
    		    countList.forEach((k,v)-> sizeList.put(k, (k.length() - 2) * v));
                
                //System.out.println(letters);
    		    for(String letter: letters) {
    		        int size = 0;
    		        String bigger = "";
        		    for(Entry<String, Integer> entry: sizeList.entrySet()) {
                        if (entry.getValue() > size && entry.getKey().split("")[0].equals(letter)) {
                            size = entry.getValue();
                            bigger = entry.getKey();
                            dictionary.put(entry.getKey().split("")[0], bigger);
                        } 
                    }
                }
                //System.out.println(dictionary);

    		for (String s : dictionary.keySet()) {
            String word = dictionary.get(s);
            words = words.replaceAll("\\b" + word + "\\b", " " + s + ". ");
            
            }

    		
    		System.out.println(words.trim());
    		System.out.println(dictionary.size());
    		dictionary.forEach((k,v) -> System.out.println(k+". = "+v.trim()));
    		
		}
	}
}//RESOLVIDO
