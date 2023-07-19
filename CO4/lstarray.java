import java.util.*;
public class lstarray{
	
	public static void main(String args[]){
		ArrayList <String> list1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of items into the list:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			
		System.out.println("Enter the name of the item:");
		String item=sc.next();
		list1.add(item);
		}
		//list1.add("benz");
		//list1.add("audi");
		System.out.println("The list items are:");
		//for(int i=0;i<n;i++)
		//{
			System.out.println(list1);
		//}
		
		System.out.println("After sorting the list items:");
		Collections.sort(list1);
		for(String items:list1)
			System.out.println(items);
		
		int size=list1.size();
		System.out.println("The length of the array list is:"+size);
		System.out.println("Enter the name of the item to search:");
		String p=sc.next();
		
		int pos=list1.indexOf(p);
		System.out.println("Index of the item  is:"+pos);
		
	}
}

