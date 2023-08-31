package ex1;

public class Student {
    private String idStu;
    private String fullName;
    private String address;
    private String email;
    private float age;
    private float avg;

    public Student(String idStu, String fullName, String address, String email, float age, float avg) {
        this.idStu = idStu;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.avg = avg;
    }

    public String getIdStu() {
        return idStu;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public float getAge() {
        return age;
    }

    public float getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStu='" + idStu + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", avg=" + avg +
                '}';
    }
}
