

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		//showArray(array);
		quickSort(array);
		
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
        //showArray(array);
	}
	
	public static void quickSort(int[] array, int left, int right) {

		if(left >= right){
			//showArray(array);
			return;
		}

		int i = left;
		int j = right;
		int pivot = right;

		while(i <= j){
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

				i++;
				j--;
			}
		}

		if (left < j) {
			quickSort(array, left, j);
		}

		if (i < right) {
			quickSort(array, i, right);
		}
		
	}
}
