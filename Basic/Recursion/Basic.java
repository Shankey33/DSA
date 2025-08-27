class Basic{

    public static void q1(int i){
        
        //Print from 1 to N using backtracking
        if(i < 1){
            return;
        }

        q1(i-1);
        System.out.println(i);


    }

    public static void q2(int i){
        
        //Print from N to 1 using backtracking
        if(i < 1) return;
        System.out.println(i);
        q2(i-1);   
    }

    public static int q3(int n){
        //Functional Recursion
        if(n == 0) return 0;
        return n + q3(n-1);
    }

    public static int q4(int n){
        // Factorial of N using Functional Recursion
        if(n == 0) return 1;
        return n * q4(n-1);

        //Time Complexity - O(n)
        //Space Complexity - O(n) since n functions are called
    }

    private static int i = 0;
    public static void q5(int[] array, int n){
        
        //Reverse the Array
        if(i >= n/2) return;

        int temp = array[i];
        array[i] = array[n-1-i];
        array[n-i-1] = temp;
        i++;
        q5(array, n);
        i--;
    }
    private static int j = 0;
    public static boolean q6(String word){
        
        //Check for paliandrom for a String 
        if(j >= word.length()/2) return true;
        if(Character.toLowerCase(word.charAt(j)) != Character.toLowerCase(word.charAt(word.length() - 1 - j)))return false;
        j++;
        return q6(word);

        //Time Complexity - O(n/2)
        //Space Complexity - O(n/2)
    }

    public static int q7(int n){
        if(n == 0) return 0;
        if(n == 1)return 1;
        return q7(n-1) + q7(n-2);
    }


    public static void main(String[] args){

        System.out.println("Print from 1 to N: ");
        q1(5);
        System.out.println();

        System.out.println("Print from N to 1: ");
        q2(5);
        System.out.println();

        System.out.println("Print Sumation from 1 till N (Functional Recursion): ");
        System.out.println(q3(5));
        System.out.println();

        System.out.println("Print factorial of N: ");
        System.out.println(q4(4));
        System.out.println();
        
        System.out.println("Reverse the array: ");
        
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }  

        q5(array, array.length);
        System.out.print("[ ");
        for(int arr: array) System.out.print(arr + " ");
        System.out.print("]");
        System.out.println();

        System.out.println();
        System.out.println("Is Palindrom (String): ");
        System.out.println(q6("mAdaMji"));
        System.out.println();


        System.out.println("Fibonnaci Number");
        System.out.println(q7(10));
        System.out.println();

    }

}