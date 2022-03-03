package ArrayStructure;

public class main {

	public static void main(String[] args) {
		ArrayS newArray = new ArrayS();
		 
		int[] arr= {1,5,3,78,34,56};
		ArrayS newArray2 = new ArrayS(arr,arr.length);
		newArray2.printArray();
		newArray2.bubbleSort();
		newArray2.printArray();
		

	}

}
