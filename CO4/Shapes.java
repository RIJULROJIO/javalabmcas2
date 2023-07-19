package Graphics;

import java.util.*;

public class Shapes implements Area1
{
	double lr,lb,ra,th,tb,ta,saa,sa,cr,cc;
	public void getRect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		lr=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		lb=sc.nextInt();
	}
	public void Rectangle()
	{
		ra=lr*lb;
		System.out.println("The area of the rectangle is:"+ra);
	}
	public void getTri()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base of the triangle:");
		tb=sc.nextInt();
		System.out.println("enter the heigth of the triangle:");
		th=sc.nextInt();
	}
	public void Triangle()
	{
		ta=0.5*tb*th;
		System.out.println("The area of the triangle is:"+ta);
	}
	public void getSqr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of the square:");
		saa=sc.nextInt();
	}
	public void Square()
	{
		sa=saa*saa;
		System.out.println("The area of the square is:"+sa);
	}
	public void getCrl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		cr=sc.nextInt();
	}
	public void Circle()
	{
		cc=3.14*cr*cr;
		System.out.println("The area of the circle is:"+cc);
	}
	public static void main(String args[])
	{
		Shapes s=new Shapes();
		s.getRect();
		s.Rectangle();
		s.getTri();
		s.Triangle();
		s.getSqr();
		s.Square();
		s.getCrl();
		s.Circle();
	}
}