
package sort;

class IterativeMergeSort {

    // Merge two sorted subarrays arr[l..m] and arr[m+1..r]
    static void merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;   // size of left subarray
        int n2 = r - m;       // size of right subarray

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;   // index for merged array

        // Merge the temp arrays back into arr
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {   // ensures stability
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Iterative (Bottom-Up) Merge Sort
    static void iterativeMergeSort(int[] arr, int n) {

        // currSize indicates size of subarrays to be merged
        for (int currSize = 1; currSize < n; currSize = 2 * currSize) {

            // Pick starting point of different subarrays
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {

                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Merge only if there are two subarrays
                if (mid < rightEnd)
                    merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    // Driver method
    public static void main(String[] args) {

        int[] arr = {15, 5, 24, 8, 1, 3, 16, 10};
        int n = arr.length;

        iterativeMergeSort(arr, n);

        System.out.println("Sorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

