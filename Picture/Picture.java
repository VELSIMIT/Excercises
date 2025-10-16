/**
 * @author V.Vlasiuk
 */
public class Picture {
  public static void main(String[] args) {
    // Excercise 3.1
    int linescounter = 0;
    int colums = 6;
    int a = 0;

    while(linescounter <= 5) {
        while(a < linescounter) {
          System.out.print(". ");
          a++;
        }

        while (a < colums) {
          System.out.print("* ");
          a++;
        }

        System.out.println();
        a = 0;
        linescounter++;
    }
    System.out.println();

    // Excercise 3.2
    int rows = 6;
    int cols = 6;
    int rowscounter = 0;
    int colscounter = 0;
    
    while (rowscounter <= rows) {
      while (colscounter <= cols) {
        if (rowscounter == colscounter || cols - rowscounter == colscounter) {
          System.out.print("* ");
        }

        else {
        System.out.print(". ");
        }

        colscounter++;
      }
      System.out.println();
      colscounter = 0;
      rowscounter++;
    }
  }   
}

    