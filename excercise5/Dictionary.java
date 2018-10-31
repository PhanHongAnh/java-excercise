package excercise5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary<K1, K2, V> {
	private Map<K1, HashMap<K2, V>> map;
	
	public Dictionary() {
		map = new HashMap<K1, HashMap<K2,V>>();
	}
    
	public V get(K1 key1, K2 key2) {
		HashMap<K2, V> hashMap = map.get(key1);
		return hashMap.get(key2);
	}
	
	public void put(K1 key1, K2 key2, V value) {
		if (containKey(key1, key2) == false) {
			HashMap<K2, V> hashMap = new HashMap<K2, V>();
			hashMap.put(key2, value);
			map.put(key1, hashMap);
		}
	}
	
	public boolean containKey(K1 key1, K2 key2) {
		if (map.get(key1) != null) {
			HashMap<K2, V> hashMap = map.get(key1);
			if (hashMap.get(key2) != null) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Dictionary<Integer, Character, String> dic = new Dictionary<>();
		dic.put(1, 'm', "meomeo");
		dic.put(2, 'g' , "gaugau");
		dic.put(3, 'c', "chick chick");
		
		System.out.println(dic.get(3, 'c'));
		System.out.println(dic.get(1, 'g'));
		System.out.println(dic.containKey(1, 'c'));
		System.out.println(dic.containKey(2, 'g'));
		System.out.println(dic.containKey(4, 'm'));
	}
}
