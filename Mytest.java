import java.util.*;

import javax.print.DocFlavor.STRING;
public class Mytest {

    // public static void toweOfHanoi(int n,String src,String helper,String dest){
    //     if(n==1){
    //     System.out.println("Tranfer disk "+ n + " from "+src+" to "+dest);
    //         return;
    //     }
    //     toweOfHanoi(n-1, src, dest, helper);
    //     System.out.println("Tranfer disk "+ n + " from "+src+" to "+dest);
    //     toweOfHanoi(n-1, helper, src, dest);
    // }
    // public static void printRev(String str,int index){
    //     if(index==0){
    //         System.out.println(str.charAt(index));
    //         return;
    //     }
    //     System.out.println(str.charAt(index));
    //     printRev(str, index-1);
    // }
    // public static void moveAllX(String str,int index,int count,String newString){
    //     if(index==str.length()){
    //         for(int i=0;i<count;i++){
    //             newString+='x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currnet =str.charAt(index);
    //     if(currnet=='x'){

    //         count++;
    //         moveAllX(str, index+1, count, newString);
    //     }else{
    //         newString+=currnet;
    //         moveAllX(str, index+1, count, newString);
    //     }
    // }
    public static void main(String args[]){
        // Question_1-->TOWER OF HANOI
        // int n=2;
        // toweOfHanoi(n, "S","H", "D");
        // Question_2-->A String in rverse.
        // String str="abcd";
        // printRev(str,str.length()-1);
        // String str ="abaacdaefaah";
        // int first =-1;
        // int last =-1;
        // for(int i=0;i<=str.length();i++){
        //     if(str.charAt(i)=='a'){
        //         first+=1;

        //     }
        // }
        // Question-->3
        // String str="axbcxxxd";
        // moveAllX(str, 0, 0, "");    
        

    }
}
