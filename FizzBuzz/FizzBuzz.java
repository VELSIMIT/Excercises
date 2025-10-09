/**
 * @author V.Vlasiuk
 */
public class FizzBuzz {
  public static void main(String[] args ){
    int divident = 1;

    while (divident <= 100) {
        int fizz = divident % 3;
        int buzz = divident % 5;

        if (fizz == 0 && buzz == 0) {
            System.out.println("FizzBuzz");
        }

        else if (fizz == 0) {
            System.out.println("Fizz");
        }
            
        else if (buzz == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(divident);
        }
        divident++;
    }
  }
}