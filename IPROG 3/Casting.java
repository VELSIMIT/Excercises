public class Casting {
  public static void main (String[] args) {
    double x = 1.6;
    int b = (int) x;  
    System.out.println("x: " + x + " y: " + b);
  

    System.out.println("Postfix Example");

    int i = 0;
    while (i < 5) {
      System.out.println(i++);
    }

    System.out.println("Prefix Example");

    int j = 0;
    while(j < 5) {
      System.out.println(++j);
    }
  }
}
 
