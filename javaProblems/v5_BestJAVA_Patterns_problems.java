
public class v5_BestJAVA_Patterns_problems {
    public static void main(String[] args) {

    /*   question 1 print this pattern
        *****
        *****
        *****
        *****
        ***** 
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= 5 ; j++){
                System.out.print("*");
            }
               System.out.println("*");
        }
    */


    /*Question 2 Print the pattern
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square pattern (e.g., 4 for a 4x4 pattern):");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            //inner loop
            for (int j = 1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    */

    /* Question 3  Print the pattern
        *****
        *   *
        *   *
        *****
        int r = 4;
        int c = 5;
        for(int i = 1 ; i<=r ; i++){
            for (int j = 1 ; j<=c ; j++){
                if (i == 1 || j == 1 || i == r || j == c){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        } 
    */

    /*  Question 4  Print this pattern
        *
        **
        ***
        ****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    */


    /*   Question 5 print this pattern
        *****
        ****
        ***
        **
        *
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number.");
         int n = sc.nextInt();
         for (int i = n ; i >= 1 ; i--){
             for (int j = 1 ; j <= i ; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    */


    /*  Question 6 print this pattern
           *
          **
         ***
        ****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            // inner loop for space
            for (int s = 1 ; s<=n-i ; s++){
                System.out.print(" ");
            }
            // inner loop for star
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    */


    /*   Question 7  print this patter
        1
        12
        123
        1234
        12345
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    */

 //       Quation 8 print this patter
//        12345
//        1234
//        123
//        12
//        1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int n = sc.nextInt();
        for (int i = n ; i >=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/



        // Question 9 print this patter. Floyd's Triangle
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter n value.");
        int n = sc.nextInt();

        int number = 1;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        } */



        // Question 10 Print the butterfly pattern
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int n = sc.nextInt();
        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        //Question 11 Print the pattern. Solid Rhombus 
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            //spaces
            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }
            // stars
            for(int j= 1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/




        //Question 12 print the pattern. Number pyramid
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/



        //Question 13 print the pattern. Palindrom pattern
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++){
            //spaces
            for (int j = 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //first half
            for (int j = i ; j>=1 ; j--){
                System.out.print(j);
            }
            // second half
            for (int j = 2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/



    }
}
