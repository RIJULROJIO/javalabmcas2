import java.util.Scanner;
class MulTable extends Thread{
public void run(){
int num=5;
System.out.println("__Multiplication Table of 5 \n");
for(int i=1;i<=10;i++)
{
System.out.printf("%d * %d=%d \n",num,i,num*i);
}
}
}
class PrimeNo extends Thread{
public void run(){
int i,j,flag;
Scanner sc=new Scanner(System.in);
System.out.println("\n To generate first N prime numbers ");
System.out.println("Enter the limit(N):");
int N=sc.nextInt();
System.out.println("prime numbers between 1 and" + N +" are:");
for(i=1;i<=N;i++)
{
if(i==1||i==0)
continue;
flag=1;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag=0;
break;
}
}
if(flag==1)
System.out.print(i + " ");
}
}
}

public class MulPrime {
public static void main(String arg[]) throws InterruptedException
{
MulTable obj1=new MulTable();
obj1.start();
obj1.sleep(2000);
PrimeNo obj2=new PrimeNo();
obj2.start();
obj2.sleep(1000);
}
}
