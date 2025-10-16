/**
 * @author V.Vlasiuk
 */
public class Course {
    Student[] student = new Student [10]; 
    String name;


    public Course(String name) {
        this.name = name;
    }

    public void addStudents(Student[] student) {
        int i = 0;
        while (i < student.length) {
            this.student[i] = student[i];
            i++;
        }
    }

    public void printStudents() {
        int i = 0;
        while (i < student.length) {
            System.out.println(student[i].getFirstName() + " " + student[i].getName() + ", " + student[i].getStudentId()+ ";");
            i++;
        }
    }

    public String getName() {
        return this.name;
    } 
}