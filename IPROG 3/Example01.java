public class Example01 {
  public static void main (String[] args) {
    int x = 12;

    if (x % 5 == 0) {
      System.out.println("Can be dividen by 5");
    }

    else if ( x % 4 == 0){
      System.out.println("Can be divided by 4");
    }

    else {
      System.out.println("Cannot be divided by five");
    }

    System.out.println("Done!");

  }
}
