import java.util.*;
public class test {
    public static void main(String args[]){
        Scanner sb =new Scanner(System.in);
        // get bit
        // set bit
        // clear bit
        // updated bit

        // GET BIT❤️❤️
        // questin--1.get the 3rd bit (position=2) of a number n. (n=0101)
        // int n=5;
        // int pos=2;
        // int bitMask = 1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("BitMask is Zero");
        // }else{
        //     System.out.println("BitMaks is one");
        // }
        // *****************❤️❤️**********************************
        // SET BIT❤️❤️0 ko 1 bnna
        // int n =5;
        // int pos =3;
        // int bitMarks =1<<pos;
        // int newMArks =bitMarks|n;
        // System.out.println(newMArks);
        // ******************❤️❤️*********************************
        // CLEAR BIT❤️❤️
        // solution-->bit mask :1<<i:-->1 first
        // operation : AND with NOt (NOT use First phir end main AND usse).
        // int n=5;
        // int pos =2;
        // int bitMarks =1<<2;
        // int notBitMaks = ~(bitMarks);
        // int newNumber = notBitMaks & n;
        // System.out.println(newNumber);
        // ******************❤️❤️*********************************
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 (set value) & Enter 0 (set value)");
        int oper =sc.nextInt();
        int n=5;
        int pos =1;
        if(oper==1){
            // set bitmask
            int bitMask =1<<pos;
            int newNumber = bitMask |n;
            System.out.println(newNumber);

        }else if(oper==0){
            // clear bit mask
            int BitMask =1<<pos;
            int notValue =~(BitMask);
            int Newnumber =notValue & n;
            System.out.println(Newnumber);
        }
    }
}
