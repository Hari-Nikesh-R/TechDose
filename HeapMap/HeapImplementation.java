

final class Heap {
	int[] arr = null;
	int curr  = 0;
	Heap() {}
	Heap(int len) {
		this.arr = new int[len];
	}
	Heap(int[] arr) {
		this.arr = arr;
	}
	int getLeft(int ind) {
		if(this.arr.length > (ind+1))
			return arr[ind+1];
		return -1;
	}
	int getRight(int ind) {
		if(this.arr.length > ind)
			return arr[ind-1];
		return -1;
	}
	void insert(int data) {
		this.arr[this.curr++] = data;
	}
	public String toString() {
		return Arrays.toString(this.arr);
	}
} 


