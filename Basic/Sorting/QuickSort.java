public class QuickSort {

    public static void main(String[] args){
        
        int[] arr = {5, 3, 2, 2, 6, 1};
        quickSort(arr);
        System.out.print("[ ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.print("]");
    }


    public static int[] quickSort(int arr[]){
        int start = 0;
        int end = arr.length-1;
        sort(arr, start, end);
        return arr;
    }

    private static void sort(int[] arr, int start, int end){
        if(start >= end){return;}
        int pivot = partition(arr, start, end);
        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }
}

