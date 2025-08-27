class Basic {
    
    public static void q1(int n){
        // Problem Statement: Given an integer N, return the number of digits in N.
       
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);

        //Shorthand method - we can see the repeated divison of 10 in the loop above, by observing that we can use log10 to find the number of digits.

        /*
        int count2 = (int)(log10(n) + 1);
        System.out.println("Printed using shorthand method: " + count2);
        */

        //Time Complexity
        // O(log10(n)) - because we are dividing n by 10 in each iteration.
    
    }

    public static void q2(int n){
        
        //Problem Statement: Given an integer N return the reverse of the given number. (neglect 0 at the start)
        int reverse = 0;
        
        while(n > 0){
            int lastDigit = n%10;
            n = n/10;
            reverse = (reverse * 10 + lastDigit);
        }
        System.out.println(reverse);

        //Time Complexity
        // O(log10(n)) - because we are dividing n by 10 in each iteration.
    }

    public static void q3(int n){
        // Problem Statement: Given an integer N, return true if it is a palindrome else return false.

        //Step 1: generate reverse number
        int m = n;
        int reverse = 0;

        while(m > 0){
            int lastDigit = m % 10;
            m = m/10;
            reverse = (reverse * 10 + lastDigit);
        }

        //step 2: compare
        if(reverse == n){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //Time Complexity
        // O(log10(n)) - because we are dividing n by 10 in each iteration.
    }
    
    public static void q4(int n){
        //Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
        int m = n;
        int armstrong = 0;

        while(n > 0){
            
            int lastDigit = n % 10;
            n = n / 10;
            armstrong = armstrong + (lastDigit * lastDigit * lastDigit); 
        }

        if (armstrong == m){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //Time Complexity
        // O(log10(n)) - because we are dividing n by 10 in each iteration.
    }
    
    public static void q5(int n){
        // Problem Statement: Given an integer N, return all divisors of N.
        System.out.println("1st Approach: Higher Time Complexity");
        //Approach - 1: Higher Time Complexity
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }

        //Time Complexity
        // O(n) - because we are checking all numbers from 1 to n to see if they are divisors.
        System.out.println("2nd Approach: Lower Time Complexity");
        
        //Approach - 2: Lower Time Complexity  
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " ");
                System.out.print(n / i + " ");
            }
        }

        //Time Complexity
        // O(sqrt(n)) - because we are only checking up to the square root of n.
        
    }

    public static void q6(int n){
        
        
        // Problem Statement: Given an integer N, check whether it is prime or not
        
        //Higher Time complexity approach
        boolean isPrime = true;
        
        if(n < 2 && n > 0){
            isPrime = false;
        }

        for(int i = 2; i<=n-1; i++){
            if(n % i != 0){
                isPrime = true;
            }
            else{
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
        //Time Complexity
        // O(n) - because we are checking all numbers from 2 to n-1 to see if they divide n.

        //Lower Time complexity approach
        int count = 0;

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if(count  == 2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //Time Complexity
        // O(sqrt(n))


    }

    public static void q7(int n, int m){
        
        for(int i = Math.min(n, m); i >= 1; i--){
            if( n % i == 0 && m % i == 0){
                System.out.println("GCD/HCF of " + n + " and " + m + " is: " + i);
                break;
            }
        }
        //Time Complexity
        //O(min(n, m)) - because we are checking all numbers from min(n, m) to 1 to see if they divide both n and m.
    }
        
    public static void main(String[] args) {
        
        // Tests

        System.out.println("Question 1: Number of digits in N");
        q1(12345);
        System.out.println();

        System.out.println("Question 2: Reverse of N");
        q2(12345);
        System.out.println();

        System.out.println("Question 3: Is N a palindrome?");
        q3(1331);
        System.out.println();

        System.out.println("Question 4: Is N an Armstrong number?");
        q4(153);
        System.out.println();

        System.out.println("Question 5: Divisors of N");
        q5(12);
        System.out.println();
        System.out.println();

        System.out.println("Question 6: Is N a prime number?");
        q6(32);
        System.out.println();

        System.out.println("Question 7: GCD/HCF of N and M");
        q7(48, 18);
        System.out.println();


    }
}

