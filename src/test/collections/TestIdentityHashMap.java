package test.collections;

import java.util.TreeMap;

public class TestIdentityHashMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();

		map.put("zne", 1);
		map.put("Two", 2);
		
		
		map.forEach((k,v)->{System.out.println(k+","+v);});
	}

}
