
class MaxHeap {

	public static void max_heapify(int[] arr, int i) {
		int left = 2*i + 1;
		int right = 2*i + 2;

		// System.out.println("parent : " + i + " left : " + left + " Right : " + right  );

		int largest = i;

		if(left < arr.length && arr[left] > arr[largest])
			largest = left;
		else if(right < arr.length && arr[right] > arr[largest])
			largest = right;

		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			max_heapify(arr, largest);
		}
	}

	

