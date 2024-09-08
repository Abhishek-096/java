import java.util.*;

class New {
    public static void main(String args[]) {
        System.out.println("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        // 1-->HOLLOW Rectangle.
        // for(int i=1;i<=4;i++){
        // for(int j=1;j<=5;j++){
        // // cell->(i,j)
        // if(i==1 || j==1 || i==4 || j==5){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        int number =sc.nextInt();
        // int num=1;
        // for(int i=1;i<=number;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(num+" ");
        // num++;
        // }
        // System.out.println();
        // }
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // for (int i = 1; i <= number; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         int sum = i + j;
        //         if(sum%2==0){
        //            System.out.print("1 ");
        //         }else{
        //            System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        
// Butterfly Pattern.
            // for(int i=1;i<=number;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     // int spaces=2*(number-i);
            //     for(int j=1;j<=2*(number-i);j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i=number;i>=1;i--){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     // int spaces=2*(number-i);
            //     for(int j=1;j<=2*(number-i);j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }  
// Solid Rhombus
            // for(int i=1;i<=number;i++){
            //     for(int j=1;j<=number-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=number;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // }
// Number Pyramid
            // for(int i=1;i<=number;i++){
            //     for(int j=1;j<=number-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }
                // for(int i=1;i<=number;i++){
                //     for(int j=1;j<=number-i;j++){
                //         System.out.print(" ");
                //     }
                //     for(int j=i;j>=1;j--){
                //         System.out.print(j);
                //     }
                //     for(int j=2;j<=i;j++){
                //         System.out.print(j);
                //     }
                //     System.out.println();
                // }
// Diamond Pattern
            for(int i=1;i<=number;i++){
                for(int j=1;j<=number-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                } 
                System.out.println();                   
            }  
            for(int i=number;i>=1;i--){
                for(int j=1;j<=number-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                } 
                System.out.println();                   
            }  
    }
}