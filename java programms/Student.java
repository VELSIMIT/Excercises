/**
@vitalii.vlasiuk
*/
public class Student {

    String name;
    String firstname;
    int studentId;
    //String mail;

    public Student(){
    }

    public Student(String name, String firstname, int id) {
        this.name = name;
        this.firstname = firstname;
        this.studentId = id;
    }

    public void sleep() {
        System.out.println("zZz");
    }

    public void talk(String message) {
        System.out.println(message);
    }

    public void saySomething(Student s, String message) {
        //s.sleep();
        s.talk(message);
    }

}