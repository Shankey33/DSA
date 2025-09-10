import java.util.ArrayList;

class MergeSort{

    public static void main(String[] args){

        int[] arr = {5, 4, 3, 2, 1};
        
        mergeSort(arr);
        System.out.print("[ ");
        for(int x: arr){
            System.out.print(+x+" ");
        }
        System.out.print("]");
    }

    public static void mergeSort(int[] arr){
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int low, int high){
        if(low == high) {return;}
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}