
public class StringMap {
	private String [][]mainarray;
	private int numItemsAdded;
	public StringMap() {
		mainarray = new String [10][2];
	}
	
	public void put(String key, String value) {
		if(numItemsAdded == mainarray.length) {
			String [][] extendedArray = new String [mainarray.length+10][mainarray.length+10]; 
			extendedArray[mainarray.length][0] = key; 
			extendedArray[mainarray.length][1] = value; 
			this.mainarray = extendedArray; 
		}
		else {
			mainarray[numItemsAdded][0] = key;
			mainarray[numItemsAdded][1] = value;	
		}
		numItemsAdded++;
	}
	
	public String get(String key) {
		for (int i = 0; i < mainarray.length; i++) {
			if (mainarray[i][0].equals(key)) {
				return mainarray[i][1]; 
			}	
		}
		return null; 
	}
	
	public static void main(String[] args) {
		StringMap hitsongs = new StringMap();
		hitsongs.put("EdSheeran", "ShapeOfYou");
		hitsongs.put("Sia", "Chandelier");
		System.out.println(hitsongs.get("EdSheeran"));
	}
}
