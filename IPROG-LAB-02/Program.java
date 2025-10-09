/**
 * @author V.Vlasiuk
 */
public class Program {
    public static void main(String []args) {
        Course course = new Course("SWE2025");
        Student s1 = new Student ("Doe", "John", 123456);
        Student s2 = new Student ("Doe", "John", 234567);

        Student[] student = new Student[10];
        student[0] = new Student ("Doe", "John", 12345);
        student[1] = new Student ("Doe", "Jane", 23456);
        student[2] = new Student ("Doe", "Jacob", 34567);
        student[3] = new Student ("Doe", "Jade", 45678);
        student[4] = new Student ("Doe", "James", 56789);
        student[5] = new Student ("Doe", "Julian", 67890);
        student[6] = new Student ("Doe", "Jack", 78910);
        student[7] = new Student ("Doe", "Joel", 89101);
        student[8] = new Student ("Doe", "Jabbar", 91011);
        student[9] = new Student ("Wick", "John", 11111);

        
        course.addStudents(student);

        int i = 0;
        while (i < student.length) {
            System.out.println(student[i].getFirstName() + " " + student[i].getName() + ", " + student[i].getStudentId()+ ";");
            i++;
        }
        
        /* 

        Student s1 = new Student ("Doe", "John", 123456);
        Student s2 = new Student ("Doe", "John", 234567);

        if (s1.hasSameName(s2)) {
            System.out.println("Students " + s1.getFirstName() + " " +
            s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() + 
            " have the same name.");
        }

        if (!s1.hasSameName(s2)) {
            System.out.println("Students " + s1.getFirstName() + " " +
            s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() + 
            " have NOT the same name.");
        }

        */


        if (Student.haveSameNames(s1, s2)) {
            System.out.println("Students " + s1.getFirstName() + " " +
            s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() + 
            " have the same name.");
        }

        if (!Student.haveSameNames(s1, s2)) {
            System.out.println("Students " + s1.getFirstName() + " " +
            s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() + 
            " have NOT the same name.");
        }
    }
}