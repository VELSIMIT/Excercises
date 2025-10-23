/**
 * @author V.Vlasiuk
 */
public class AlphabetTriangle {
  public static String createLine(int count) {
    if (count > 26){
      count = 26;
    }

    String line = "";

    for(int i = 0; i < count; i++){
      char letter = (char) (65 + i);
      line += letter + " ";
    }
    return line;
  } 

  public static void main(String[] args){
    for(int i = 1; i <= 26 && i <= Integer.parseInt(args[0]); i++){
      System.out.println(createLine(i));
    }
  }
}