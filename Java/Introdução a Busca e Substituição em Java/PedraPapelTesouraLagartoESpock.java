import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class PedraPapelTesouraLagartoESpock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        String player1, player2, winner="";
        
        
        for(int i = 0; i < N; i++){
          
          String[] players = sc.nextLine().split(" ");
          player1 = players[0];
          player2 = players[1];
          
          switch(player1){
            case "spock":
              switch(player2){
                case "tesoura": winner = player1;
                  break;
                case "papel": winner = player2;
                  break;
                case "pedra": winner = player1;
                  break;
                case "lagarto": winner = player2;
                  break;
                default: winner = "empate";
              }
              break;
              
            case "lagarto":
              switch(player2){
                case "tesoura": winner = player2;
                  break;
                case "papel": winner = player1;
                  break;
                case "pedra": winner = player2;
                  break;
                case "spock": winner = player1;
                  break;
                default: winner = "empate";
              }
              break;
              
            case "pedra":
              switch(player2){
                case "tesoura": winner = player1;
                  break;
                case "papel": winner = player2;
                  break;
                case "spock": winner = player2;
                  break;
                case "lagarto": winner = player1;
                  break;
                default: winner = "empate";
              }
              break;
              
              
            case "papel":
              switch(player2){
                case "tesoura": winner = player2;
                  break;
                case "spock": winner = player1;
                  break;
                case "pedra": winner = player1;
                  break;
                case "lagarto": winner = player2;
                  break;
                default: winner = "empate";
              }
              break;
              
              
            case "tesoura":
              switch(player2){
                case "spock": winner = player2;
                  break;
                case "papel": winner = player1;
                  break;
                case "pedra": winner = player2;
                  break;
                case "lagarto": winner = player1;
                  break;
                default: winner = "empate";
              }
              break;
              
          }
          
          if(winner == player1) {
            System.out.println("fernanda");
          } else if (winner == player2) {
            System.out.println("marcia");
          } else {
            System.out.println(winner);
          }
        }
        
    }
}//Resolvido