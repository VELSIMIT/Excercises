/**
@author V.Vlasiuk
**/
public class Calculator {
  public static int sum(int[] numbers) {
      int i = 0;
      int sumOfNumbers = 0;
      do { 
        sumOfNumbers = sumOfNumbers + numbers[i];
        i++;
      } while (i < numbers.length);
      return sumOfNumbers;
  }

  public static int fact(int[] number) {
    int factorialSum = 1;
    int factorial = number[0];
    for (int k = 1; k <= factorial; k++){
      factorialSum = factorialSum * k;
    }
    return factorialSum;
  }

  public static int fib(int number) {
    int fibonacci = 0;
    int firstNum = 1;
    int secondNum = 0;
    int Arraycounter = 0;
    int[] fibArray = new int [number + 2]; // to avoid ArrayOutOfBoundException

    for (int counter = 0; fibonacci <= number; counter++) { 
      Arraycounter = counter;
      
      if (counter == 0) {
        fibonacci = 0;
        fibArray[counter] = fibonacci;
      // DEBUGGING: System.out.print(fibArray[counter] + ", "); //Check output
      }
 
      else {
      fibonacci = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = fibonacci;
      fibArray[counter] = fibonacci;
      // DEBUGGING: System.out.print(fibArray[counter] + ", "); //Check output
      }
    }
    
    if((number - fibArray[Arraycounter - 1]) < fibArray[Arraycounter] - number){
      return fibArray[Arraycounter-1];
    }
    else {
      return fibArray[Arraycounter];
    }
  }

  public static boolean toBoolean(int i) {
   return i == 1;
  }

  public static boolean xor(int[] numbers) {
    boolean result = false;

    for(int i = 0; i < numbers.length; i++){
      result = result ^ toBoolean(numbers[i]);
    }
    return result;
  }


  public static void main(String[] args) {
    if (args.length == 0) {
      // No instructions about giving output of certain errors
      System.exit(-1);
    }

    int[] localArray = new int [args.length - 1]; // changed args length to optimize array size

    if (!args[0].equals("sum") && !args[0].equals("fact") && !args[0].equals("fib") && !args[0].equals("XOR")) {
      // No instructions about giving output of certain errors
      System.exit(-2);
    }
  

    if (args[0].equals("sum")) {
      for(int i = 1; i < args.length; i++) {
        try {
          int testnum = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          //System.out.println("String detected");
          System.exit(-3);
        }

        localArray[i - 1] = Integer.parseInt(args[i]);
      }
      if (localArray.length <= 1) {
        //System.out.println("not enough operands");
        System.exit(-3);
      }
        System.out.println(Calculator.sum(localArray));
    }

    if (args[0].equals("fact")){
      for(int i = 1; i < args.length; i++) {
        try {
          int testnum = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          //System.out.println("String detected");
          System.exit(-3);
        }
        localArray[i - 1] = Integer.parseInt(args[i]);
      }
      if (localArray.length != 1) {
        //System.out.println("no operands or to much operands"); 
        System.exit(-3);
      }

      System.out.println(Calculator.fact(localArray));
    }
    
    if (args[0].equals("fib")){
      for(int i = 1; i < args.length; i++) {
        try {
          int testnum = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          //System.out.println("String detected");
          System.exit(-3);
        }
        localArray[i - 1] = Integer.parseInt(args[i]);
      }
      if (localArray.length != 1) {
        //System.out.println("no operands or to much operands"); 
        System.exit(-3);
      }
      
      System.out.println(Calculator.fib(localArray[0]));
    }

    if (args[0].equals("XOR")){
      for(int i = 1; i < args.length; i++) {
        try {
          int testnum = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          //System.out.println("String detected");
          System.exit(-3);
        }
        localArray[i - 1] = Integer.parseInt(args[i]);
      }
        if (localArray.length < 1){
        //System.out.println("not enough operands");  
        System.exit(-3);
      }

      System.out.println(Calculator.xor(localArray));
    }
  }
}  