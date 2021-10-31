import java.util.Scanner;


public class GincanaNoAcampamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        while(N != 0) {
          DoubleCircularLinkedList list = new DoubleCircularLinkedList();
          String name;
          int number, n;
          for(int i = 0; i < N; i++) {
            String[] nameNumber = sc.nextLine().split(" ");
            name = nameNumber[0];
            number = Integer.parseInt(nameNumber[1]);
            list.add(name, number);
          }
          //System.out.println(list);
          n = list.curr.data;
          
          while(list.size != 1) {
              //System.out.println("Actual number: " + n);
              //System.out.println(list);
              n = list.delete(n);
              
          }
          //System.out.println(list);
          System.out.println("Vencedor(a): " + list.curr.name);
          
          N = sc.nextInt();
          sc.nextLine();
        }
  }
}
  
class DoubleCircularLinkedList {
    Node last;
    int size;
    Node curr;

    public DoubleCircularLinkedList() {
        this.last = null;
        this.size = 0;
    }

    public DoubleCircularLinkedList(Node last) {
        this.last = last;
        this.curr = last;
        if (this.last != null) {
            this.last.next = last;
            this.last.previous = last;
            this.size = 1;
        }
    }

    void add(String name,int data) {
        Node n = new Node(name,data);
        if (last == null) {
            n.next = n;
            n.previous = n;
            last = n;
            curr = last;
        } else {
            n.next = last.next;
            n.previous = last;
            last.next.previous = n;
            last.next = n;
        }
        //last.next = n;
        this.size += 1;
    }

    int delete(int data) {
        int count = 0;
        if (data % 2 == 0) {
            while (count != data) {
                curr = curr.next;
                //System.out.println(curr);
                count++;
                //System.out.println("- Count: " + count + " - Curr.name: " + curr.name + " - Curr.previous: " + curr.previous + " - Curr.next: " + curr.next);
            }
        }
        else {
            while (count != data) {
                curr = curr.previous;
                //System.out.println(curr);
                count++;
                //System.out.println("- Count: " + count + " - Curr.name: " + curr.name + " - Curr.previous: " + curr.previous + " - Curr.next: " + curr.next);
            }
        }
        //if (data == 1) curr = curr.previous;
        if (curr == last) last = curr.previous;
        curr.previous.next = curr.next;
        curr.next.previous = curr.previous;
        int dataToReturn = curr.data;
        //System.out.println("Sai => " + curr);
        
        if (curr.data % 2 == 0) {
            curr = curr.previous;
        }
        else {
            curr = curr.next;
        }
        //System.out.println(curr);
        this.size -= 1;
        return dataToReturn;
    }
    
    @Override
    public String toString() {
        if(last == null) return "List NULL";
        Node node = last.next;
        if(this.size == 1) return "START ---> " + "[name: " + curr.name + ", numero: " + curr.data + "] ---> END";
        String out = "START ---> ";
        while(node != last) {
            out = out + "[name: " + node.name + ", numero: " + node.data + "] ---> ";
            node = node.next;
        }
        out = out + "[name: " + node.name + ", numero: " + node.data + "] ---> END";
        return out;
    }
}

class Node {
    String name;
    int data;
    Node next;
    Node previous;
    
    public Node(String name, int data) {
        this.name = name;
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    @Override
    public String toString() {
        return "[name: " + this.name + ", numero: " + this.data + "]";
        
    }
}