package SortingTechniques;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		for(int i = 1;i < arr.length;i++) {
			int valueToSort = arr[i];
			int j;
			for(j = i ; j > 0 && arr[j -1] > valueToSort;j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = valueToSort;
		}
		return arr;
	}
	public static void main(String[] args) {
		int  arr[]={100,20,15,30,5,75};
        int res[] = insertionSort(arr);
        
        for (int i = 0; i <res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();

	}

}
