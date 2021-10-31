import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class UniformesDeFinalDeAno{

//    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String owner, l, color, size, colorSize;
        String[] details;
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;
        boolean firstCase = true;
        
        N = in.nextInt();
        in.nextLine();
        
        
        while (N > 0) {
            
            tshirts = new Tshirt[N];
            
            for (int i = 0; i < N; i++) {
                owner = in.nextLine();
                colorSize = in.nextLine();
                color = colorSize.split(" ")[0];
                size = colorSize.split(" ")[1];
                tshirts[i] = new Tshirt(size, color, owner);
            }
            
            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                @Override
                public int compare(Tshirt t1, Tshirt t2) {
                    String color1 = t1.getColor();
                    String color2 = t2.getColor();
                    int diff = color1.compareTo(color2);
                    if (diff != 0) {
                        return diff;
                    }
                    else {
                      String size1 = t1.getSize();
                      String size2 = t2.getSize();
                      diff = size2.compareTo(size1);
                      if (diff != 0) {
                        return diff;
                      }
                      else {
                        String owner1 = t1.getOwner();
                        String owner2 = t2.getOwner();
                        diff = owner1.compareTo(owner2);
                        if (diff != 0) {
                          return diff;
                        } 
                        else return -1;
                      }
                        
                    }
                }
            });
            for (Tshirt t : tshirts) {
                System.out.println(t.toString());
            }
            
            
            N = in.nextInt();
                in.nextLine();

        }
        in.close();
    }

//    private static String read() throws IOException {
//        return in.readLine();
//    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor().toLowerCase().trim() + " " + this.getSize().toUpperCase().trim() + " " + this.getOwner().trim();
    }
}
//Resolvido

