import java.util.*;
class Arrays{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int[] marks=new int[size];
        // input array
        // for(int i=0;i<size;i++){
        //     System.out.print("Enter "+i+ " number:- ");
        //     marks[i]=sc.nextInt();
        // }
        // QUESI+TION-->1❤️
        // Find the index value of array.
        // System.out.print("Which number find in array:- ");
        // int find=sc.nextInt();
        // for(int i=0;i<size;i++){
        //     if(marks[i]==find){
        //         System.out.println(i+" "+"index");
        //     }
        // }
        // ****************************************************************************************
        // QUESTION-->2❤️input name of arrays.
        // // input
        // String[] name= new String[size];
        // for(int i=0;i<size;i++){
        //     name[i]=sc.next();
        // }
        // // output
        // for(int i=0;i<name.length;i++){
        //     System.out.println("name "+ (i+1)+" is: "+name[i]);
        // }
         
        // ***********************************************************************************************
        // ****************************❤️MAX_VALUE/MIN_VALUE❤️************************************************
        // for(int i=0;i<size;i++){
        //     marks[i]=sc.nextInt();
        // }
        // int max=marks[0];
        // int min=marks[0];

        // for(int i=0;i<marks.length;i++){
        //     if(marks[i]<min){
        //         min=marks[i];
        //     }
        //     if(marks[i]>max){
        //         max=marks[i];
        //     }
        // }
        // System.out.println("Largest number is : "+max);
        // System.out.println("Smallest number is: "+min);
        // ***********************************************************************************************
        // ************************************❤️2D-Arrays❤️**************************************************
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int col=sc.nextInt();
            int[][] number=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    number[i][j]=sc.nextInt();
                }
            }
            System.out.println();
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();
            }
            

        
         
    }
}