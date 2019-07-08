package learning;

public class Algo {
	private int[] array;
	private int[] tempArr;
	private int len;

	public static void main(String[] args) {
		int[] inArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };

		Algo al = new Algo();
		al.sort(inArr);
		for (int i : inArr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	public void sort(int inArr[]) {
		this.array = inArr;
		this.len = inArr.length;
		this.tempArr = new int[len];
		doMergeSort(0, len - 1);
	}

	public void doMergeSort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			doMergeSort(low, mid);
			doMergeSort(mid + 1, high);
			mergeParts(low, mid, high);
		}
	}

	public void mergeParts(int low, int mid, int high) {
		int i = low, h = low, j = mid + 1, k;
		while (h <= mid && j <= high) {
			if (array[h] <= array[j]) {
				tempArr[i] = array[h];
				h++;
			} else {
				tempArr[i] = array[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k < high; k++) {
				tempArr[i] = array[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				tempArr[i] = array[k];
				i++;
			}
		}
		for(k= low;k<=high;k++) {
			array[k] = tempArr[k];
		}
	}
}
