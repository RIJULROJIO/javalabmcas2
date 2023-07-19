import java.util.*;
interface Pbill
{
	void get();
	void calc();
}
class Product implements Pbill
{
	String productid;
	String name;
	int quantity;
	int unitprice;
	int total;
	//int net;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id:");
		productid=sc.next();
		System.out.println("Enter the product name:");
		name=sc.next();
		System.out.println("Enter the quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter the unitprice:");
		unitprice=sc.nextInt();
		//System.out.println("total:");
	}
	public void calc()
	{
		System.out.println("PRODUCT ID:"+productid);
		System.out.println("PRODUCT NAME:"+name);
		System.out.println("QUANTITY:"+quantity);
		System.out.println("UNIT PRICE:"+unitprice);
		total=quantity*unitprice;

		System.out.println("TOTAL:"+total);
		//float  net =unitprice.calc() * quantity.calc();
						//total+= net; 

				//System.out.println("NET.AMOUNT:"+net);

		
		
	}
}
public class Order
{
	public static void main(String args[])
	{
		int i=0;
		double t,amount=0;
		int ran;
		String date;
		t=Math.random()*1000000;
		ran = (int) t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Order no. #"+ran);
		System.out.println("Enter the date:");
		date = sc.nextLine();
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of products:");
		int n=sc.nextInt();
		Product p[]=new Product[n];
		for(i=0;i<n;i++)
		{
			p[i]=new Product();
		p[i].get();}
		for(i=0;i<n;i++){
		p[i].calc();

		}
		for(i=0;i<n;i++)
		{
			amount += p[i].total;
		}
		
		System.out.println("NET.AMOUNT:"+amount);
				System.out.println("Date:"+date);
		

	}
}




	