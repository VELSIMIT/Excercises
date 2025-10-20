/**
 * @author V.Vlasiuk
 */
public class LoopTest {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments");
      return;
    }

    if (args.length != 2) {
      System.out.println("Invalid arguments");
      return;
    }

    int parameterInt = Integer.parseInt(args[1]);

    if (args[0].equals("-d")) {
      int y = parameterInt;
      do {
        System.out.println(y);
        y--;
        } while (y > 0);
      return;
    }

    if (args[0].equals("-w")) {
      int x = parameterInt;
      while (x > 0) {
        System.out.println(x);
        x--;
        }
      return;
    }

    System.out.println("Invalid arguments");   

  }
}

