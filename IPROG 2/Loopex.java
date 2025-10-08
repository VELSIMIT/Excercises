/**
 * @author V.Vlasiuk
 */

public class Loopex {
  public static void main(String [] args) {
    int linescounter = 0;
    int colums = 6;
    int a = 0;

    while(linescounter <= 5) {
      
      if(linescounter == 0) {
        while (a < colums) {
          System.out.print("*");
          a++;
        }
        linescounter++;
        a = 0;
        System.out.println();
      }
      
      else if(linescounter > 0) {

        while(a < linescounter) {
          System.out.print(". ");
          a++;
        }

        while (a < colums) {
          System.out.print("* ");
          a++;
        }

        if (a <= 6){
          System.out.println();
        }
        
        a = 0;
        linescounter++;
      }
    }
  }
}