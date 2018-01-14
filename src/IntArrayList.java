
public class IntArrayList {
	private int [] primaryArray; 
	private int numItemsAdded; 

	public IntArrayList() {
		this.primaryArray = new int [1]; 
	}
	public int getIntAt(int index) {
		return this.primaryArray[index]; 
	}
	public void add(int anInteger) {
		if (numItemsAdded == this.primaryArray.length) {
			int [] extendedArray = new int [(primaryArray.length +1)];
			for(int i =0; i < primaryArray.length; i++) {
				extendedArray[i] = primaryArray[i]; 
			}
			extendedArray[primaryArray.length] = anInteger; 
			this.primaryArray = extendedArray; 
		
		}
		else {
			this.primaryArray[numItemsAdded] = anInteger; 
			
		}
		numItemsAdded++;
	}
	
	public int size() {
		return numItemsAdded; 
		
	}
	
	public static void main(String[] args) {
		IntArrayList alist = new IntArrayList();
		alist.add(1);
		alist.add(2);
		System.out.println(alist.size());
		for (int i = 0; i<alist.size(); i++) {
			System.out.println(alist.getIntAt(i)); 
		}
		
	}
}
