import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        // Calculater.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your opretor(+,-,*,/)");
        String opretor=Sc.nextLine();
        int number = Sc.nextInt();
        
        int number1=Sc.nextInt();

        switch(opretor){
            case "+": System.out.println(number+number1);
                    break;
            case "-":System.out.println(number-number1);
                    break;
            case "*":System.out.println(number*number1);
                    break;
            case "/":System.out.println(number/number1);
                    break;
            default:System.out.println(number/number1);
        }
    }
}