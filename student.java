package Student;
import java.util.Scanner;
class std {
	int rollNo, marks;
	String name;
	
	
	public std()
	{
		
	}


	public std(int rollNo, String name,int marks) {
		
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}


	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
}

public class student
{
	public static void main(String[] args) {
		
	int i =0;	
	int v = 0;
	do
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number: ");
		int r = sc.nextInt();
		System.out.println("Enter name: ");
		String n = sc.next();
		System.out.println("Enter marks: ");
		int m = sc.nextInt();
		
		// TODO Auto-generated method stub
		std[] s1 = {
		
		new std(r, n, m)
		
		};
		System.out.println("Student details:" + s1[v]);
		i++;
	}
	while( i < 5 );
		

	}
	
}
