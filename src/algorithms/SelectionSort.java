package algorithms;

public class SelectionSort {
	

	
	void sort(int values[]) {
		//array length
		int n = values.length;
		
		//one by one move
		for (int i = 0; i < n-1; i++) {
			
			//initially the minimum is always the first id
			int min_id = i;
			
			//loop through the remaining values in the list after i, and if the value of j is less than the minimum, swap the minimum
			for (int j = i+1; j < n; j++) {
				if(values[j] < values[min_id]) {
					min_id = j;
				}
			}
			
			//get the value at index min_id
			int temp = values[min_id];
			
			//move the value at position i to the minimum position
			values[min_id] = values[i];
			
			//move the minimum position to position i
			values[i] = temp;
		}
		

	}
	
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

	public static void main(String[] args) {
		
		SelectionSort ss = new SelectionSort();
		
		int arr[] = {4, 23, 14, 202, 32, 31, 40, 1};
		ss.printArray(arr);
		ss.sort(arr);
		ss.printArray(arr);

	}

}
