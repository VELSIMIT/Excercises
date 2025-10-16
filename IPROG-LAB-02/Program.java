/**
 * @author V.Vlasiuk
 */
public class Program {
    public static void main(String []args) {
        Course course = new Course("SWE2025");

        // Initial two students for name comparison. They are not part of the course or the print functionality.
        Student s1 = new Student ("Doe", "John", 123456);
        Student s2 = new Student ("Doe", "John", 234567);

        // Fixed Live Coding part with arrays and loop, instructions are not very clear. 
        // Example: "students[0] = new Student(Wick”, John”, 11111);"
        // The ID "11111" is originally 5 digits but was changed to 6 digits to exercise the checksum
        // functionality and produce the expected terminal output.
        String[] studentFirstNames = {"John", "Jane", "Jacob", "Jade", "James", "Julian", "Jack", "Joel", "Jabbar", "John"}; 
        String[] studentNames = {"Doe", "Doe", "Doe", "Doe", "Doe", "Doe", "Doe", "Doe", "Doe", "Wick"};
        int[] studentIds = {123456, 112211, 345678, 456789, 567890, 678901, 789102, 891013, 910114, 111115};
        
        Student[] student = new Student[10];
        int m = 0;
        while (m < student.length) {
            student[m] = new Student (studentNames[m], studentFirstNames[m], studentIds[m]);
            m++;
        }
        
        // Original hardcoded part commented out
        /*
        Student[] student = new Student[10];
        student[0] = new Student ("Doe", "John", 123456);
        student[1] = new Student ("Doe", "Jane", 112211);
        student[2] = new Student ("Doe", "Jacob", 345678);
        student[3] = new Student ("Doe", "Jade", 456789);
        student[4] = new Student ("Doe", "James", 567890);
        student[5] = new Student ("Doe", "Julian", 678901);
        student[6] = new Student ("Doe", "Jack", 789102);
        student[7] = new Student ("Doe", "Joel", 891013);
        student[8] = new Student ("Doe", "Jabbar", 910114);
        student[9] = new Student ("Wick", "John", 111115);
        */
        
        course.addStudents(student);
        course.printStudents();
        
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