package ArrayStructure;

public class ArrayS {
private static int[] theArray = new int[50];
	
	private int arraySize=10;
	public ArrayS() {
		
	}
	public ArrayS(int[]arr,int size) {
		this.theArray=arr;
		this.arraySize=size;
	}
	
	public void generateRandomArray() {
		for(int i=0; i<arraySize; i++) {
			theArray[i]=(int)(Math.random()*10)+10;
			
		}
	}
	
	public void printArray() {
		
		System.out.println("---------");
		for(int i=0; i<arraySize; i++) {
			System.out.print("| "+i+" |");
			System.out.println(theArray[i]+ " |");
			System.out.println("---------");
		}
		
	}
	
	public int  getValueAtIndex(int index) {
		if(index<arraySize) {
			return theArray[index];
		}
		return -1;
		
	}
	
	public boolean Contains(int searchValue) {
		boolean valueInArray = false; 
		for(int i=0; i<arraySize; i++) {
			if(theArray[i]==searchValue) {
				valueInArray=true;
			}
		}
		return valueInArray;
	}
	
	public void deleteIndex(int index) {
		
		if(index<arraySize) {
			
			for(int i=index; i<(arraySize-1); i++) {
				theArray[i]=theArray[i+1];
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value) {
		
		if(arraySize<50) {
			theArray[arraySize]=value;
			arraySize++;
		}
	}
	
	//// Search Algorithms
	public String LinearSearchForValue(int value) {
		
		boolean valueInArray = false;
		String indexWithValue="";
	
		System.out.println("The Value was found in the Following Indecies:");
		
		for(int i=0; i<arraySize; i++) {
			if(theArray[i]==value) {
				valueInArray=true;
				indexWithValue+= i+" ";
			}
		}
		
		if(!valueInArray) {
			indexWithValue ="None";
			
		}
		System.out.println(indexWithValue);
		return indexWithValue;
		
	}

	
	public void binarySearchforValue(int value) {
		int lowIndex=0;
		int highIndex=arraySize-1;
		
		while(lowIndex<=highIndex) {
			int middleIndex=(highIndex+lowIndex)/2;
			
			if(theArray[middleIndex]<value) lowIndex=middleIndex+1;
			else if(theArray[middleIndex]>value) highIndex=middleIndex-1;
				
			else { ///found
				System.out.println("\nFound a Match for "+value+" at Index: "+middleIndex);
				break;
			}
			
		}
			
	}
	
	
	
	///Sort Algorithms
	
	
	
	
	public void MergeSort(int[]arr) {
		int n = arr.length;
		if(n<2) return;
		
		int mid=n/2;
		int[] left = new int[mid];
		int[] right= new int[n-mid];
		
		for(int i=0; i<mid; i++) {
			left[i]=arr[i];
		}
		for(int i=mid; i<n; i++) {
			right[i-mid]=arr[i];
		}
			
		MergeSort(left);
		MergeSort(right);
		Merge(left,right,arr);
		
		
	}
	public void Merge(int[]L , int[]R, int[]A){
		int l=L.length;
		int r=R.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<l && j<r) {
			if(L[i]<=R[j]) {
				A[k++]=L[i++];
			}else {
				A[k++]=R[j++];
			}
		}
		while(i<l) {
			A[k++]=L[i++];
		}
		while(j<r) {
			A[k++]=R[j++];
		}
		
	}
	
	public void InsertionSort() {
		
		for(int i=0; i<arraySize-1; i++) 
		{
			int min=i;
			
		for(int j=i+1; j<arraySize; j++) 
		{	
			if(theArray[j]<theArray[min]) 
			{
					min=j;
			}
				swap(i,min);	
		}	
		}
	}
	
	
	
	public void selectionSort() {
		for(int x=0; x<arraySize; x++) {
			int minimum=x;
			
			for(int y=x; y<arraySize; y++) {
				
				if(theArray[minimum]>theArray[y])  minimum=y;
			}
			swap(x,minimum);
		}
		
	}
	
	
	
	
	
	
	
	public void bubbleSort() {
		
		for(int i= arraySize-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(theArray[j]>theArray[j+1]) {
					swap(j,j+1);
				}
				
			}
		}
	}
	
	
	
	public void swap(int index1, int index2) {
		int temp=theArray[index1];
		theArray[index1]=theArray[index2];
		theArray[index2]=temp;
		
	}

	public static int[] getTheArray() {
		return theArray;
	}

	public static void setTheArray(int[] theArray) {
		ArrayS.theArray = theArray;
	}
	
}
