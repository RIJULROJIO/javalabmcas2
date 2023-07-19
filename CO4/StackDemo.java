import java.util.*;
public class StackDemo
{
public static void main(String args[])
{
Stack<String> stack = new Stack<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of items into the stack:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the item:");
String item=sc.next();
stack.add(item);
}
System.out.println("The items in the stack are:");
System.out.println(stack);
String rem_ele=stack.remove(1);
System.out.println("Removed element:"+rem_ele);
System.out.println("Final Stack:"+stack);


}
}

