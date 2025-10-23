/**
 * @author V.Vlasiuk
 */
public class AlphabetTriangle_prototype {

  public static String createLine(int count) {
    String output = "Penis";
    int rowscounter = 1;

    for (int i = 0; i <= count && i <= 26; i++) {
      i = 0;
      for (int k = 0; k < rowscounter; k++) {
        if(i >= count){
          System.exit(1);
        }

        else {
        int c = 65 + k;
        char A = (char) c;
        System.out.print(A + " ");
        i++;
        }
      }
      System.out.println();
      rowscounter++;
    }
  return output;
  }

  public static void main(String[] args) {
      AlphabetTriangle_prototype.createLine(Integer.parseInt(args[0]));
  }
}


