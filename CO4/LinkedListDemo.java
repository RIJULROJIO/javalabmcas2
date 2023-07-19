import java.util.*;
public class LinkedListDemo {
public static void main(String args[])
{
LinkedList<String> list = new LinkedList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of items into the linked list :");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the item to the list:");
String item=sc.next();
list.add(item);
}
//System.out.println("The items in the list are:");
//list.add("car");
//list.add("bikes");
//list.add("10");
//list.add("20");
System.out.println("Orginal LinkedList:" +list);
list.clear();
System.out.println("After clearing  LinkedList:" +list);

}
}




