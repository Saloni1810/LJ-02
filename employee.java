package employee;
import java.util.*;



public class employee {
	int emp;
	String name, position;
	static int count;
	 
	
	public employee(int emp, String name,String position) {
	
		this.emp = emp;
		this.name = name;
		this.position= position;
		count ++;
		
	}
	
	public static int show() {
		return count;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			
			System.out.println("enter emplyee id, name, position  "+(i+1));
			int id=sc.nextInt();
			String ename = sc.next();
			String pos = sc.next();
			
			employee empo=new employee(id,ename,pos);
		}
		System.out.println("number of employees = "+employee.show());
		
		
	}

}