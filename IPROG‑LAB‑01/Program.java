/**
*@vitalii.vlasiuk
*/
public class Program {
    public static void main(String []args){
        Course course;
        course = new Course();  

        Student s1 = new Student ("Doe", "John", 12345);
        Student s2 = new Student ("Doe", "Jane", 23456);
        Student s3 = new Student ("Doe", "Jacob", 34567);
        Student s4 = new Student ("Doe", "Jade", 45678);
        Student s5 = new Student ("Doe", "James", 56789);
        Student s6 = new Student ("Doe", "Julian", 67890);
        Student s7 = new Student ("Doe", "Jack", 78910);
        Student s8 = new Student ("Doe", "Joel", 89101);
        Student s9 = new Student ("Doe", "Jabbar", 91011);
        Student s10 = new Student ("Wick", "John", 11111);

        course.addStudents(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
    }
}