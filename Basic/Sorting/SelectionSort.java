public class SelectionSort {


    public static int[] sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        sort(arr);
        for (int x : arr) {
            System.out.print(x);
        }
    }
}