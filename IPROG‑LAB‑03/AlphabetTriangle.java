/**
@author V.Vlasiuk
**/
public class AlphabetTriangle {
  public static void main(String[] args){
    /*
    if(args.length == 0){
      System.out.println("Provide the number of lines as a command line argument.");
      System.exit(-3);
    }
    */
    for(int i = 1; i <= 26; i++){
      System.out.println(createLine(i));
    }
  }

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
}