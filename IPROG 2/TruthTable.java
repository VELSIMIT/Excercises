/**
* @author V.Vlasiuk
*/
public class TruthTable {

  public static void main(String [] args) {
    
    boolean a = true;
    boolean b = true;
    System.out.println("\n|\tA\t|\tB\t|\tNOT A\t|\tA AND B\t|\tA OR B\t|\tA XOR B\t|");
    System.out.println("=================================================================================================");
    System.out.println("|\t" + a + "\t|\t" + b + "\t|\t" + !a + "\t|\t" + (a & b) + "\t|\t" + (a | b) + "\t|\t" + (a ^ b) + "\t|");
    
    a = true;
    b = false;
    System.out.println("|\t" + a + "\t|\t" + b + "\t|\t" + !a + "\t|\t" + (a & b) + "\t|\t" + (a | b) + "\t|\t" + (a ^ b) + "\t|");

    a = false;
    b = true;
    System.out.println("|\t" + a + "\t|\t" + b + "\t|\t" + !a + "\t|\t" + (a & b) + "\t|\t" + (a | b) + "\t|\t" + (a ^ b) + "\t|");

    a = false;
    b = false;
    System.out.println("|\t" + a + "\t|\t" + b + "\t|\t" + !a + "\t|\t" + (a & b) + "\t|\t" + (a | b) + "\t|\t" + (a ^ b) + "\t|");
  }
}