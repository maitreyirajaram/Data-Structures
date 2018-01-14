
public class HashMap {
	
	private String [] hashMap = new String [100]; 
	
	private int getIndexForKey(String key) {
		return hashFunction(key)%100;
	}
	
	public void put(String key, String value) {
		int index = getIndexForKey(key); 
		//assuming number of items stored in array will not surpass 100
		hashMap[index] = value; 
	}
	
	public String get(String key) {
		int index = getIndexForKey(key);
		return hashMap[index]; 
	}
	
	private int hashFunction(String key) {
		if(key.length() == 0) {
			return 0; 
		}
		return key.charAt(0) * (int)(Math.pow(31, key.length()-1)) + hashFunction(key.substring(1)); 
	}
	
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("EdSheeran", "+");
		System.out.println(map1.get("EdSheeran"));
	}
}
