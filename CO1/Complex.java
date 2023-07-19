import java.util.Scanner;
public class Complex
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the real part of fist complex number:");
	int num1=sc.nextInt();
	System.out.println("Enter the imaginary part of the first complex number:");
	int num2=sc.nextInt();
	System.out.println("The first complex number is:"+num1+"+"+num2+"i");
	
	System.out.println("Enter the real part of second  complex number:");
	int num3=sc.nextInt();
	System.out.println("Enter the imaginary part of the second  complex number:");
	int num4=sc.nextInt();
	System.out.println("The second complex number is:"+num3+"+"+num4+"i");
	System.out.println("The sum of the two complex numbers is:");
	int a=num1+num2;
	int b=num3+num4;
	System.out.println(a+"+"+b+"i");


		
	}
}	
