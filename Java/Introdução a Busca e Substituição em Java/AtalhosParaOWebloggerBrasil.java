import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuffer;


public class AtalhosParaOWebloggerBrasil {
  

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String regex1 = "[_]";
         String regex2 = "[*]";
         
         
		 while(sc.hasNext()){
		    boolean hasUnder = false, hasAster = false;
		    Pattern pHasUnder = Pattern.compile(regex1), pHasAster = Pattern.compile(regex2);
		   
		   String phrase = sc.nextLine();
		   Matcher under = pHasUnder.matcher(phrase);
		   
           StringBuffer sb = new StringBuffer();
           
           while(under.find()) {
               if(hasUnder) {
                   under.appendReplacement(sb, "</i>");
                   hasUnder = false;
               } else {
                   under.appendReplacement(sb, "<i>");
                   hasUnder = true;
               }
           }
           under.appendTail(sb);
           phrase = sb.toString();
           Matcher aster = pHasAster.matcher(phrase);
           
           sb = new StringBuffer();
           
           while(aster.find()) {
               if(hasAster) {
                   aster.appendReplacement(sb, "</b>");
                   hasAster = false;
               } else {
                   aster.appendReplacement(sb, "<b>");
                   hasAster = true;
               }
           }
           aster.appendTail(sb);
           phrase = sb.toString();
           
           System.out.println(phrase);
		 }
	}
}//RESOLVIDO

