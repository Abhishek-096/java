import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(sc.nextLine());
        // append Method.
        // sb.append("b");
        // System.out.println(sb);
        // System.out.println(sb);
        // charAt index 0.
        // System.out.println(sb.charAt(0));

        // set char at index.
        // sb.setCharAt(0,'p');
        // insert value side the index value.-->Tony-->Stony.
        // sb.insert(1,'S');
        // delete the extra 'n'.
        // sb.delete(2, 4);
        // System.out.println(sb);

        
        // System.out.println(sb);
        // for(int i=sb.length();i>=0;i--){
        //     System.out.println(sb.charAt(i));
        // }
            // String name ="Abhishek";
            // System.out.println(name.length());
            // for(int i=name.length()-1;i>=0;i--){
            //     System.out.println(name.charAt(i));
            // }
        // String name=sc.nextLine();
        // // String second_Name=sc.nextLine();
        // System.out.println(name.length());
        // for(int i=0;i<name.length();i++){g
        //     System.out.println(name.charAt(i));
        // }
        // StringBuilder sb=new StringBuilder(sc.nextLine());
        String name=sc.nextLine();
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
