import java.util.*;

class Function {
    public static int printTheSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num=sc.nextInt();
        System.out.print("Enter the second number;- ");
        int num1=sc.nextInt();
        System.out.println("The sum of 2 number is:- "+printTheSum(num,num1));
    }
}
 