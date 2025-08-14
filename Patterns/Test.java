class Test{

    public static void p1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n; j++){
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
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void p5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= (n+1 - i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= (n+1 - i); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p7(int n){
        int space = n-1;

        for(int i = 1; i <= n; i++){

            //Space
            for(int j1 = 1; j1 <= space; j1++){
                System.out.print(" ");
            }

            //Alphabet
            for(int j2 = 1; j2 <= (2 * i )-1; j2++){
                System.out.print("*");
            }

            //Space
            for(int j3 = 1; j3 <= space; j3++){
                System.out.print(" ");
            }

            space--;
            System.out.println();
        }
    }

    public static void p8(int n){
        for (int i = 1; i <= n; i++){
            //for space
            for(int j = 1; j<= (i-1); j++){
                System.out.print(" ");
            }

            //for star
            for(int star = 1; star <= (2*n + 1 - 2*i); star++){
                System.out.print("*");
            }
            

            //for space
            for(int j = 1; j<= (i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        
    }

    public static void p9(int n){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p10(int n){
        for(int i = 5; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void p11(int n){
        int start = 1;
        for(int i = 0; i < n; i++){
            start = i%2 == 0 ? 1:0;
            
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();        


        }
    }

    public static void p12(int n){

        // int space = 2*(n-1);

        for(int i = 1; i <= n; i++){
            //Number 
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            
            //space 
            for(int s = 1; s <= 2*(n-i); s++){
                System.out.print(" ");
            }

            //Number 
            for(int j = i; j >= 1 ; j--){
                System.out.print(j);
            }

            System.out.println();
            // space -= 2;
        }
    }

    public static void p13(int n){
        int num = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void p14(int n){
        for(int i = 1; i <= n; i++){
            
            char alphabet = 'A';

            for(int j = 1; j <= i; j++){
                System.out.print(alphabet + " ");
                alphabet++;
            }

            System.out.println();
        }
    }

    public static void p15(int n){
        for(int i = 1; i <= n; i++){
            
            char alphabet = 'A';

            for(int j = n; j >= i; j--){
                System.out.print(alphabet + " ");
                alphabet++;
            }

            System.out.println("");
        }
    }

    public static void p16(int n){
        
        char alphabet = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(alphabet + " ");
            }

            alphabet++;
            System.out.println();
        }
    }

    public static void p17(int n){
        
        int space = n-1;

        for(int i = 1; i <= n; i++){

            //Space
            for(int j1 = 1; j1 <= space; j1++){
                System.out.print(" ");
            }

            //Alphabet
            char aplhabet = 'A';
            int breakpoint = (2*i + 1) / 2;
            
            for(int j2 = 1; j2 <= 2*i - 1; j2++){
                System.out.print(aplhabet);
                aplhabet = j2 < breakpoint ? ++aplhabet : --aplhabet;
            }

            //Space
            for(int j3 = 1; j3 <= space; j3++){
                System.out.print(" ");
            }

            space--;
            System.out.println();
        }
    }

    public static void p18(int n){
        for(int i = 1; i <= n; i++){
            
            int aplhabet_end = 65 + n;
            int alphabet_begin = (65 + n) - i;

            for(int j = 1; j <= i ; j++){
                System.out.print((char)alphabet_begin + " ");
                
                alphabet_begin++;
            }

            System.out.println();
        }
    }

    public static void p19(int n){
        //Symmetric Pattern
        // Top Half
        for(int i = 1; i <= n; i++){
            
            //for Star
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print("*");
            }

            //for Space
            for(int s = 1; s <= 2*(i - 1); s++){
                System.out.print(" ");                
            }

            //for Star
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom Half
        for(int i = 1; i <= n; i++){
            //for Star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //for Space
            for(int s = 1; s <= 2*(n-i); s++){
                System.out.print(" ");
            }

            //for Star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void p20(int n){
        //Symmetric Pattern
        
        // Top Half
        for(int i = 1; i <= n; i++){

            //for Star
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }

            //for Space
            for(int s =1; s <= 2*(n-i); s++){
                System.out.print(" ");
            }

            //for Star
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom half
        for(int i2 = 1; i2 <= (n-1); i2++){
            //for Star
            for(int j2 = 1; j2 <= ((n-1)+1-i2); j2++){
                System.out.print("*");
            }
            //for Space
            for(int s2 = 1; s2 <= 2*i2; s2++){
                System.out.print(" ");
            }

            //for Star
            for(int j2 = 1; j2 <= ((n-1)+1-i2); j2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p21(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j ==1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void p22(int n){
        for(int i = 0; i < (2*n-1); i++){
            for(int j = 0; j < (2*n-1); j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) - i;
                System.out.print(n - Math.min(Math.min(top, left), Math.min(right, bottom)));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        System.out.println("Pattern 1:");
        p1(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 2:");
        p2(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 3:");
        p3(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 4:");
        p4(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 5:");
        p5(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 6:");
        p6(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 7:");
        p7(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 8:");
        p8(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 9:");
        p9(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 10:");
        p10(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 11:");
        p11(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 12:");
        p12(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 13:");
        p13(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 14:");
        p14(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 15:");
        p15(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 16:");
        p16(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 17:");
        p17(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 18:");
        p18(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 19:");
        p19(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 20:");
        p20(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 21:");
        p21(5);
        System.out.println();
        System.out.println();
        System.out.println("Pattern 22:");
        p22(5);
        System.out.println();
        System.out.println();
    }

    

}
