/** 
@vitalii.vlasiuk
*/
public class Program {

    public static void main(String [] args) {

        Student s1 = new Student("Vlasiuk", "Vitalii", 28915);
        Student hans = new Student("Bombo", "Clatt", 6969);
        Student s3 = new Student("Amna", "koy", 245);
        Student yapper = new Student("Hel", "Wota", 38475);

        /*
        Student s1;
        s1 = new Student ();
        */

        s1.sleep();
        hans.sleep();
        s3.sleep();
        yapper.talk("Bruda");
        s1.talk("Hallo");
        hans.talk("Tschuess");
        s3.talk("Tamam");

        s1.saySomething(s3, "Blablabla");


    }
}