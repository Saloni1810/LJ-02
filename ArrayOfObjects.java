package p1;

class Student{
    private int roll_no;
    private String student_name;
    private int marks;

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", student_name=" + student_name + ", marks=" + marks + "]";
    }

    public Student(){
        
    }
    public Student(int roll_no, String student_name, int marks) {
        this.roll_no = roll_no;
        this.student_name = student_name;
        this.marks = marks;
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] batch_name = new Student[5];

        for(int i=0;i<5;i++){
            batch_name[i] = new Student();
            System.out.println(batch_name[i]);
        }

        Student[] batch2 = {
            new Student(),
            new Student(1,"X",55),
            new Student(2,"Y",88),
            new Student()
        };

        for(int i=0;i<batch2.length;i++){
            System.out.println(batch2[i]);
        }

    }
}
