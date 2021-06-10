package SortingTechniques;

public class BubbleSort {
	
	public static int[] bubblesort(int arr[]) {
		
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j =0 ; j < arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}	
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {6,3,9,67,4};
		
		int res [] = bubblesort(arr);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] +" ");
		
		}
	}

}
