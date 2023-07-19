import java.util.*;
public class PriorityQueueDemo {
public static void main(String args[])
{
PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of items into the PriorityQueue:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter the  the element:");
int item=sc.nextInt();
pQueue.add(item);
}
System.out.println("The items in the PriorityQueue are:");
System.out.println(pQueue);
//pQueue.add(10);
//pQueue.add(20);
//pQueue.add(30);
System.out.println("Printing the top element of PriorityQueue:");
System.out.println(pQueue.peek());
System.out.println("Printing the top element of PriorityQueue and removing it :");

System.out.println(pQueue.poll());
System.out.println("Printing the top element of PriorityQueue again after removal:");

System.out.println(pQueue.peek());
}
}


