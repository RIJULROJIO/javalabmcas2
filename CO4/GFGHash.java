import java.util.*;
public class GFGHash {
public static void main(String args[])
{
LinkedHashSet<Integer> hash_set =  new LinkedHashSet<Integer>();
hash_set.add(1);
hash_set.add(2);
hash_set.add(3);
hash_set.add(4);
System.out.println(hash_set);

LinkedHashSet<Integer> hash_set2 =  new LinkedHashSet<Integer>();
hash_set2.add(1);
hash_set2.add(5);
hash_set2.add(3);
hash_set2.add(7);
System.out.println(hash_set2);

LinkedHashSet<Integer> intersection =  new LinkedHashSet<Integer>(hash_set);

intersection.retainAll(hash_set2);
System.out.println("The intersection of the sets is:"+intersection);

LinkedHashSet<Integer> union =  new LinkedHashSet<Integer>(hash_set);

union.addAll(hash_set2);
System.out.println("The union of the sets is:"+union);

LinkedHashSet<Integer> difference =  new LinkedHashSet<Integer>(hash_set);

difference.removeAll(hash_set2);
System.out.println("The difference of the sets is:"+difference);




}
}


