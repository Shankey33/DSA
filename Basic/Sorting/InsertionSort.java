class InsertionSort{
    
    public static int[] sort(int arr[]){
        int n = arr.length;

        for(int i = 1; i <= n-1; i++){
            int j = i - 1;
            int key = arr[i];

            while(j>=0 && (arr[j] > key)) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    
    
    
    
    public static void main(String[] args) {
        
        int[] arr = {6, 5, 3, 4, 1, 2};
        
        sort(arr);

        for(int x: arr){
            System.out.print(x +" ");
        }


    }
}