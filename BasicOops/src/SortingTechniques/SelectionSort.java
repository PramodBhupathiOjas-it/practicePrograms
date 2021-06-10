package SortingTechniques;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		int min_index;
		
		for(int i = 0 ; i<arr.length;i++) {
			min_index = i;
			for(int j = i+1;j<arr.length;j++ ) {
				if(arr[min_index]>arr[j]) {
					min_index =j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min_index];
			arr[min_index]= temp;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int  arr[]={100,20,15,30,5,75};
        int res[] = selectionSort(arr);
        
        for (int i = 0; i <res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
	}
	

}
