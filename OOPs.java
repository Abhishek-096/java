import java.util.*;


class Pen {
    String color;
    String type; // ballpoint;gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void StudentDetail() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
// non-prameter
    // Student() {
    //     System.out.println("Constructor called");
    // }
    // prameter
    // Student(String x,int y){
    //     this.name=x;
    //     this.age=y;
    // }
    Student(Student S2){
        this.name=S2.name;
        this.age=S2.age;
    }
    Student(){

    }
}
class CarShowRoom{
    String name;
    String colour;
    int price;

    public void Show_car_Detail(){
        System.out.println(this.name);
        System.out.println(this.colour);
        System.out.println(this.price);
    }
    // CarShowRoom(String name,String colour,int price){
    //     this.name=name;
    //     this.colour=colour;
    //     this.price=price;
    // }
}
// POLYMORPHISM❤️❤️❤️
class Family{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class OOPs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "baal";
        // pen1.printcolor();
        // pen2.printcolor();

        // Student stu = new Student("Rahul",12);
        // stu.name = sc.next();
        // stu.age = sc.nextInt();

        Student stu=new Student();
        stu.name="Esha";
        stu.age=24;

        Student S2=new Student(stu);

        CarShowRoom csr=new CarShowRoom();
        // csr.name=sc.nextLine();
        // csr.colour=sc.nextLine();
        // csr.price=sc.nextInt();

        // csr.Show_car_Detail();

        // S2.StudentDetail();
        Family fm=new Family();
        fm.name="abhsihek";
        fm.age=34;
        fm.printinfo(fm.name,fm.age);
    }
}
