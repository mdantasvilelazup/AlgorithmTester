package src;

public class MergeAndSort {

	public static int[] merge(int[] array, int l, int m, int r) {
		int firstHalf = m - l + 1;
		int secondHalf = r - m;
		int[] left;
		left = new int[firstHalf];
		int[] right;
		right = new int[secondHalf];

		for (int i = 0; i < firstHalf; i++) {
			left[i] = array[(l + i)];

			for (int j = 0; j < secondHalf; j++) {
				right[j] = array[(m + 1 + j)];
			}

		}

		int i, j, k;
		i = 0;
		j = 0;
		k = l;

		while (i < firstHalf && j < secondHalf) {

			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}

			k++;

		}

		while (i < firstHalf) {
			array[k] = left[i];
			i++;
			k++;
		}

		while (j < secondHalf) {
			array[k] = right[j];
			j++;
			k++;
		}
		return array;
	}

	public static int[] sort(int array[], int l, int r) {

		if (l < r) {
			int m = (l + r) / 2;

			sort(array, l, m);
			sort(array, m + 1, r);
			merge(array, l, m, r);
		}

		return array;
	}
}
