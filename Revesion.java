import java.util.*;

public class Revesion {

    public static void main(String args[]) {
        // System.out.println("Enter the number :-");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows number:-");
        int row = scanner.nextInt();
        System.out.print("Enter the colume number:-");
        int colume=scanner.nextInt();
        int[][]names = new int[row][colume];
        // intput
        // Row.
        for(int i=0;i<row;i++){
            // Colums
            for(int j=0;j<colume;j++){
                System.out.print("Enter "+j+" number :-");
                names[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter the search value in 2d array:-");
        int X=scanner.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<colume;j++){
                if(names[i][j]==X){
                    // System.out.print("X found at location(" + i +","+ j +")");
                    System.out.println("X found at location " + "("+ i+"," +j +")");

                }
            }

        }

        
        
    }
}


