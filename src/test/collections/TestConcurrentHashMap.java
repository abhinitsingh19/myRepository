package test.collections;

import java.util.HashMap;
import java.util.Iterator;

public class TestConcurrentHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> chm = new HashMap<>();
		chm.put("java", "javac");
		chm.put("node.js", "npm");
		chm.put("aws", "lambbda");
		chm.put("docker", "dockerEngine");
		
		Iterator<String> iterator = chm.keySet().iterator();
		while (iterator.hasNext())
		{
			System.out.println(chm.get(iterator.next()));
			chm.put("gitlab", "gitlabRunner");
		}
				
		
	}
}
