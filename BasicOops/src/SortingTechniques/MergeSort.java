package SortingTechniques;

public class MergeSort {

	public static void merge(int arr[],int low,int mid,int high) {
		int n1=mid-low+1;
		int n2= high - mid;
		int left[]=new int[n1];
		int right[]= new int[n2];
		
		for(int i=0 ; i < n1; ++i) {
			left[i]=arr[low+i];
		}
		for(int j=0; j<n2;++j) {
			right[j] = arr[mid+1+j];
		}
		
		int i =0 , j=0;
		int k = low;
				while(i<n1&&j<n2) {
					if(left[i] <= right[j]) {
						arr[k] = left[i];
						i++;
					}
					else {
						arr[k] = right[j];
						j++;
					}
					k++;
				}
		while(i< n1) {
			arr[k]= left[i];
             i++;
             k++;
		}
		while(j< n2) {
			arr[k]= right[j];
             j++;
             k++;
		}
	}

	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;

			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int low = 0;
		int high = (arr.length-1);
		sort(arr, low, high);
		
		for(int i = 0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
