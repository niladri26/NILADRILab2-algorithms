package com.gl.services.mergeSort;

public class MergeSort {											

	public void sort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub

		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			mergeSortt(arr, left, mid, right);

		}
	}

	private void mergeSortt(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1 = mid - left + 1;
		int n2 = right - mid;
		// dividing
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}
		// merging- conquering
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] >= rightArr[j]) { //--------------- change for descending
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

}
