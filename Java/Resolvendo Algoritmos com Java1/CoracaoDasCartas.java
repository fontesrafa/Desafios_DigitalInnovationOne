import java.util.*;
import java.io.*;

//Solução não passou em todos os testes
public class CoracaoDasCartas {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
           sc.nextLine();
           
           while(N != 0) {
               boolean isPossible = false;
               int count = N;

               Stack<Integer> stack1 = new Stack<>();
               Stack<Integer> stack2 = new Stack<>();
               Stack<Integer> stack3 = new Stack<>();
               
               List<String[]> list = new ArrayList<>(); 
               while(count > 0) {
                   String[] line = sc.nextLine().split(" ");
                   list.add(line);
                   count--;
               }
                
                for (int i = list.size() - 1; i >= 0; i--) {
                    int a = Integer.parseInt(list.get(i)[0]);
                    int b = Integer.parseInt(list.get(i)[1]);
                    int c = Integer.parseInt(list.get(i)[2]);
                   if(a % 3 != 0) stack1.push(a);
                   if(b % 3 != 0) stack2.push(b);
                   if(c % 3 != 0) stack3.push(c);
                }

               System.out.println(isGamePossible(stack1, stack2, stack3) ? "1" : "0");
               N = sc.nextInt();
               sc.nextLine();
           }
           
	}
	static boolean isGamePossible(Stack stack1, Stack stack2, Stack stack3) {
       int a, b, c;
       boolean isPossible = false; 
       if(stack1.empty() && stack2.empty() && stack3.empty()) {
           isPossible = true;
            return isPossible;
       }
       if(!stack1.empty() && !stack2.empty()) {
            a = (Integer)stack1.peek();
            b = (Integer)stack2.peek();
       
         if(!isPossible && stack1.size() > 0 && stack2.size() > 0 && (a + b) % 3 == 0){
             Stack<Integer> stack1_1 = stack1;
             Stack<Integer> stack2_1 = stack2;
             Stack<Integer> stack3_1 = stack3;
             stack1_1.pop();
             stack2_1.pop();
             isPossible |= isGamePossible(stack1_1, stack2_1, stack3_1);
          }
         
       }
       
       if(!stack1.empty() && !stack3.empty()) {
            a = (Integer)stack1.peek();
            c = (Integer)stack3.peek();

         if(!isPossible && stack1.size() > 0 && stack3.size() > 0 && (a + c) % 3 == 0){
             
             Stack<Integer> stack1_2 = stack1;
             Stack<Integer> stack2_2 = stack2;
             Stack<Integer> stack3_2 = stack3;
             stack1_2.pop();
             stack3_2.pop();
             isPossible |= isGamePossible(stack1_2, stack2_2, stack3_2);
          }  
         
       }
       
       if(!stack2.empty() && !stack3.empty()) {
            b = (Integer)stack2.peek();
            c = (Integer)stack3.peek();

         if(!isPossible && stack3.size() > 0 && stack2.size() > 0 && (c + b) % 3 == 0){
             Stack<Integer> stack1_3 = stack1;
             Stack<Integer> stack2_3 = stack2;
             Stack<Integer> stack3_3 = stack3;
             stack2_3.pop();
             stack3_3.pop();
             isPossible |= isGamePossible(stack1_3, stack2_3, stack3_3);
         }
       }
       
       if(!stack1.empty() && !stack2.empty() && !stack3.empty()) {
            a = (Integer)stack1.peek();
            b = (Integer)stack2.peek();
            c = (Integer)stack3.peek();

         if(!isPossible && stack1.size() > 0 && stack2.size() > 0  && stack3.size() > 0 && (a + b + c) % 3 == 0){
             Stack<Integer> stack1_4 = stack1;
             Stack<Integer> stack2_4 = stack2;
             Stack<Integer> stack3_4 = stack3;
             stack1_4.pop();
             stack2_4.pop();
             stack3_4.pop();
             isPossible |= isGamePossible(stack1_4, stack2_4, stack3_4);
          }
       }
       return isPossible;
    }
}
    
