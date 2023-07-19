import java.util.*;

class Employee
{
String empid;
String name;
int salary;
String address;

Employee(String id,String ename,int sal,String addr)
{
empid =id;
name=ename;
salary=sal;
address=addr;
}


Employee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee id:");
	empid=sc.next();
	System.out.println("Enter the employee name:");
	name=sc.next();
	System.out.println("Enter the employee salary:");
	salary=sc.nextInt();
	System.out.println("Enter the employee address:");
	address=sc.next();
	
}}
	


class Teacher extends Employee
{
String department;
String subject;

Teacher(String id,String ename,int sal,String addr,String deptment,String sub){

super(id,ename,sal,addr);
department=deptment;
subject=sub;
}

Teacher()
{
		Scanner sc=new Scanner(System.in);

	System.out.println("Enter the employee department:");
	department=sc.next();
	System.out.println("Enter the employee subject:");
	subject=sc.next();
}

void display()
{
	System.out.println("Employee id:"+empid);
	System.out.println("Employee name:"+name);
	System.out.println("Employee slary:"+salary);
	System.out.println("Employee address:"+address);
	System.out.println("Department:"+department);
	System.out.println("subject:"+subject);
}
}






	








public class Main{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employess:");
		int n=sc.nextInt();
		Teacher e[]=new Teacher[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Teacher();
			
		}
		for(i=0;i<n;i++){
			e[i].display();
		}
		
	}
}




