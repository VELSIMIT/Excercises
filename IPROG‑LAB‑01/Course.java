/**
*@author Vitalii Vlasiuk
*/
public class Course {
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    Student s5;
    Student s6;
    Student s7;
    Student s8;
    Student s9;
    Student s10;

    public void addStudents(Student student1,
                            Student student2, 
                            Student student3,
                            Student student4,
                            Student student5,
                            Student student6,
                            Student student7,
                            Student student8,
                            Student student9,
                            Student student10){
        this.s1 = student1;
        this.s2 = student2;
        this.s3 = student3;
        this.s4 = student4;
        this.s5 = student5;
        this.s6 = student6;
        this.s7 = student7;
        this.s8 = student8;
        this.s9 = student9;
        this.s10 = student10;
    }

    String name;
    public Course(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    } 
}