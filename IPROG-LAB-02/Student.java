/**
 * @author V.Vlasiuk
 */
public class Student {
    private String name;
    private String firstName;
    private int studentId;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;


    public Student (String name, String firstName, int studentId) {
        this.name = name;
        this.firstName = firstName;
        this.studentId = studentId;
    }

    public boolean hasSameName(Student student) {
        boolean answer;
        if (this.name.equals(student.name) && this.firstName.equals(student.firstName)) {
            answer = true;
        } 
        else {
            answer = false;
        }
        return answer;
    }

    public static boolean haveSameNames(Student s1, Student s2) {
        return s1.hasSameName(s2);
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
    return this.name;
    }

    public String getFirstName() {
    return this.firstName;
    }

    public int getStudentId() {
    return this.studentId;
    }

    public int getAge() {
    return this.age;
    }

    public String getAddress() {
    return this.address;
    }

    public String getPhoneNumber() {
    return this.phoneNumber;
    }

    public String getEmail() {
    return this.email;
    }
}


