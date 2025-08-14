class Patterns{
    
    public static void p1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void p2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j>= (n+1 - i); j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=(n+1 - i); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void p6(int n){
        for(int i = 1; i <= n; i++){
            
            //for space
            for(int j = 1; j <= (n-i) ;j++)
            System.out.print(" ");

            //for star
            for(int star = 1; star <= (2*i-1); star++){
                System.out.print("*");
            }

            //for space
            for(int j = 1; j<= (n-i) ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void p7(int n){
        for(int i = 1; i <= n; i++){
            //for space
            for(int j = 1; j <= (i-1); j++){
                System.out.print(" ");
            }

            //for star
            for(int star = 1; star <= (2*n + 1 - 2*i); star++){
                System.out.print("*");
            }

            //for space
            for(int j = 1; j <= (i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p9(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p10(int n){
        
        int flip = 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(flip+" ");
                flip = flip == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void p11(int n){
        for(int i = 1; i <= n; i++){
            
            //for digit
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }

            //for space
            for(int space = 1; space <= 2*(n-i); space++){
                System.out.print(" ");
            }
            
            //for digit

            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void p12(int n){
        int c = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void p13(int n){
        for(int i = 1; i<= n; i++){
            char a = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void p14(int n){
        for(int i = 1; i<= n; i++){
            
            char a = 'A';

            for(int j = 5; j >= i; j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public static void p15(int n){
        char a = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
    }

    public static void p16(int n){
        for(int i = 1; i<= n; i++){
            //for space
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            
            //for alphabet
            int a = 65;
            for(int alpha = 1; alpha <= (2*i-1); alpha++){
                System.out.print((char)a);
                if(alpha <= (2*i+1)/2){
                    ++a;
                } else{
                    --a;
                }
            }

            //for space
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void p17(int n){
        for(int i = 1; i <= n; i++){
            int a = 65 + n - i;

            for(int j = 1; j <= i; j++){
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public static void p18(int n){

        //Upper Half
        for(int i = 1; i<= n; i++){

            //for star
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print("*");
            }

            //for space
            for(int s = 1; s <= 2*(i-1); s++){
                System.out.print(" ");
            }

            //for star
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //for Bottom Half
        for(int i2 = 1; i2 <= n; i2++){
            
            //for star
            for(int j2 = 1; j2 <= i2; j2++){
                System.out.print("*");
            }

            //for space
            for(int s2 = 1; s2 <= 2*(n-i2); s2++){
                System.out.print(" ");
            }

            //for star
            for(int j2 = 1; j2 <= i2; j2++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void p19(int n){
        
        //for Bottom Half
        for(int i2 = 1; i2 <= n; i2++){
            
            //for star
            for(int j2 = 1; j2 <= i2; j2++){
                System.out.print("*");
            }

            //for space
            for(int s2 = 1; s2 <= 2*(n-i2); s2++){
                System.out.print(" ");
            }

            //for star
            for(int j2 = 1; j2 <= i2; j2++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        //Bottom Half
        for(int i = 1; i<= n-1; i++){

            //for star
            for(int j = 1; j <= (n-i); j++){
                System.out.print("*");
            }

            //for space
            for(int s = 1; s <= 2*(i); s++){
                System.out.print(" ");
            }

            //for star
            for(int j = 1; j <= (n-i); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void p20(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void p21(int n){
        for(int i = 0; i < 2*n -1; i++){
            for(int j = 0; j < 2*n -1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) - i;
                int value = n - (Math.min(Math.min(top, left), Math.min(right, bottom))); 
                System.out.print(value);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        // p16(5);
    
    }
}
