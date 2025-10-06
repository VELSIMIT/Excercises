/**
* @author V.Vlasiuk
*/
public class Program {

    public static void main (String [] args) {
        Car c1 = new Car ();
        Car c2 = new Car (Porsche);

        System.out.println(c2.type);
    }

}