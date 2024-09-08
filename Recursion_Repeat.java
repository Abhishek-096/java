import java.util.*;
public class Recursion_Repeat {
    public static void printNumber(int n,int EndValue){
        if(n==EndValue){
            return;
        }
        System.out.println(n);
        printNumber(n+1,EndValue);
    }
    public static void printSum(int i,int end,int sum){
        if(i==end){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, end, sum);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num=sc.nextInt();
        System.out.println("Enter the ending value:- ");
        int EndValue=sc.nextInt();
        // printNumber(num,EndValue);
        printSum(num, EndValue,0);
        
    }
}
