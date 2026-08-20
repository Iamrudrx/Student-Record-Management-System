public class Student {
    private int studentId;
    private String name;
    private int age;
    private int classNo;
    private double marks;

    public Student(int studentId, String name, int age, int classNo, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.classNo = classNo;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getClassNo() {
        return classNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student ID :" + studentId +
                "\nName    :" + name +
                "\nAge     :" + age +
                "\nClass   :" + classNo +
                "\nMarks   :" + marks;
    }
}