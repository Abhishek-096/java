import java.util.*;

public class Soted {
    public static void printArry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // 1---> // buule sort.
        // int arr[]={7,8,3,1,2};

        // for(int i=0;i<arr.length-1;i++){
        // for(int j=0;j<arr.length-i-1;j++){
        // if(arr[j]>arr[j+1]){
        // int temp = arr[j];
        // arr[j]=arr[j+1];
        // arr[j+1]=temp;
        // }
        // }
        // }
        // printArry(arr);
        // 2---> SELECTION sort.
        // int arr[] = { 7, 9, 3, 1, 2 };

        // for (int i = 0; i < arr.length - 1; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // printArry(arr);
        // ************************************************Revesion sorted********************************************
        // bubble sort
        int[] array={7,8,3,1,2};
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }                                   
            }
        }
        printArry(array);
        

    }
}
