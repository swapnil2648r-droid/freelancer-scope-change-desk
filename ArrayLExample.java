import java.util.Iterator;
import java.util.ArrayList;

public class ArrayLExample {
public static void main(String[] args) {
ArrayList<Double> al = new ArrayList<>();
al.add(5.4);
al.add(3.6);
al.add(6.9);

System.out.println("WITH FOR EACH LOOP");
for (Double n : al)
{
System.out.println(n);
}

System.out.println("WITH ITERATOR");
Iterator<Double> it =al.iterator();
while(it.hasNext())
System.out.println(it.next());

System.out.println(al);

}
}