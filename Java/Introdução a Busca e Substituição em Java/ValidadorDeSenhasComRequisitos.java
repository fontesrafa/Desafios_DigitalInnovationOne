import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;


public class ValidadorDeSenhasComRequisitos {
  

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
        
		//boolean hasUp = false, hasLow = false, hasNumb = false, hasEspecial = false, correctSize = false;
		 while(sc.hasNext()){
		    boolean hasUp = false, hasLow = false, hasNumb = false, hasEspecial = false, correctSize = false;
		    Pattern pHasUp = Pattern.compile("[A-Z]"), pHasLow = Pattern.compile("[a-z]"), pHasNumb = Pattern.compile("[0-9]"), pHasEspecial = Pattern.compile("[^a-zA-Z0-9]");
		   
		   String senha = sc.nextLine();
		   
		   Matcher mHasUp = pHasUp.matcher(senha);
           hasUp = mHasUp.find();
           
           Matcher mHasLow = pHasLow.matcher(senha);
           hasLow = mHasLow.find();
           
           Matcher mHasNumb = pHasNumb.matcher(senha);
           hasNumb = mHasNumb.find();
           
           Matcher mHasEspecial = pHasEspecial.matcher(senha);
           hasEspecial = mHasEspecial.find();
           
           if(senha.length() > 5 && senha.length() <33) correctSize = true;
		   /*
		   System.out.print(senha + " => ");
		   System.out.print(" hasUp: " + hasUp + " - ");
		   System.out.print(" hasLow: " + hasLow + " - ");
		   System.out.print(" hasNumb: " + hasNumb + " - ");
		   System.out.print(" hasEspecial: " + hasEspecial + " - ");
		   */
		   if(hasUp && hasLow && hasNumb && !hasEspecial && correctSize) System.out.println("Senha valida.");
		   else System.out.println("Senha invalida.");
		     
		   /*
		   for (String letter: senha) {
		     System.out.print(letter + "");
		     if(letter.equals(letter.toUpperCase())) hasUp = true;
		     if(letter.equals(letter.toLowerCase())) hasLow = true;
		     if(letter.matches())
		     System.out.println("hasUp: " + hasUp);
		     System.out.println("hasLow: " + hasLow);
		   }
		   */
		   
		   //System.out.println();
		   
		 }
			
		
	}
}//RESOLVIDO

