    import java.util.Iterator;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
Vector<String> vector = new Vector<>();
vector.add("APPLE");
vector.add("GRAPES");
vector.add("BANANA");

System.out.println("WITH FOR EACH LOOP");
for (String fruit : vector)
{
System.out.println(fruit);
}

System.out.println("WITH ITERATOR");
Iterator<String> it =vector.iterator();
while(it.hasNext())
System.out.println(it.next());

}
}