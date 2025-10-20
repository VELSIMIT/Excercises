/**
 * @author V.Vlasiuk
 */
public class LoopTest {
  public static void main(String[] args) {
    int parameterInt;
    if (args.length == 0) {
      System.out.println("No arguments");
      return;
    }

    if (args.length != 2) {
      System.out.println("Invalid arguments");
      return;
    }

    try {
      parameterInt = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
        System.out.println("Invalid arguments");
        return;
      }

    if (args[0].equals("-d")) {
      do {
        System.out.println(parameterInt);
        parameterInt--;
      } while (parameterInt > 0);
      return;
    }

    if (args[0].equals("-w")) {
      while (parameterInt > 0) {
        System.out.println(parameterInt);
        parameterInt--;
      }
      return;
    }
    System.out.println("Invalid arguments");   
  }
}

