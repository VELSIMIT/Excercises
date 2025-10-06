/**
 * @author V.Vlasiuk
 */
public class Factorial {
  public static void main(String [] args) {
    
    int x = 10; // border
    int t = 1; // Final_nubler
    int i = 1; //Loop_variable

    while (i <= x ) {
      t *= i;
      i++;
    }

    System.out.println(t);
  }
}