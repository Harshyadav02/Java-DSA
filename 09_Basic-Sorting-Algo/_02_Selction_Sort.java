class SelectionSort {

    public static int[] sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minimum = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        // Sort the array
        sort(arr);

        // Print the sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
