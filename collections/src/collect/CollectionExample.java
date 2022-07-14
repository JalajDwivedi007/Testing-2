package collect;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		Map mp =  new HashMap();
		//Key cannot be duplicated but value can be.Keys are unique
		mp.put(1, "Jalaj");
		mp.put(2, "Arun");
//		mp.put(2, "Arun"); //Stores this value into key 2
		mp.put(3, "Arun");
		System.out.println(mp);
		
		//For using iterator we can convert map into list or set
		Set s = mp.entrySet();
		
		Iterator it = s.iterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//If we want only key or value
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next(); //Entry is a sub interface of map
			// Type casting the next entry into our need
			System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
