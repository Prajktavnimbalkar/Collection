package collecton;

import java.util.TreeMap;

public class z {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<>();
		hm.put(1, "abc");
		hm.put(2, "chd");
		hm.put(1, "nsk");
		hm.put(3, "mkd");
		hm.put(4, "abc");
		for (int key : hm.keySet()) {
			System.out.println(key);
			System.out.println(key + "=" +hm.get(key));
		}

}}
