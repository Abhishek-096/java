
// // Question-1***********************************************************************

// public class Dog {
//     private String name;
//     private String breed;

//     public Dog(String name, String breed) {
//         this.name = name;
//         this.breed = breed;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setBreed(String breed) {
//         this.breed = breed;
//     }

//     public void printDetails() {
//         System.out.println("Dog's name: " + name + ", Breed: " + breed);
//     }

//     public static void main(String[] args) {
//         Dog dog1 = new Dog("Buddy", "Golden Retriever");
//         Dog dog2 = new Dog("Max", "German Shepherd");

//         dog1.setName("Charlie");
//         dog1.setBreed("Labrador Retriever");

//         dog2.setName("Rocky");
//         dog2.setBreed("Bulldog");

//         dog1.printDetails();
//         dog2.printDetails();
//     }
// }

// //
// ********************************************************************************************
// import java.util.Scanner;

// public class GlaAbhishek {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();

// int[] array = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// array[i] = scanner.nextInt();
// }

// System.out.println("The elements of the array are:");
// for (int i = 0; i < n; i++) {
// System.out.print(array[i] + " ");
// }
// }
// }
// // *******************************************************************
// import java.util.Scanner;

// public class NegativeElements {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();

// int[] array = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// array[i] = scanner.nextInt();
// }

// System.out.println("The negative elements in the array are:");
// for (int i = 0; i < n; i++) {
// if (array[i] < 0) {
// System.out.print(array[i] + " ");
// }
// }
// }
// }
// //
// **********************************************************************************
// import java.util.Scanner;

// public class ArraySum {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();

// int[] array = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// array[i] = scanner.nextInt();
// }

// int sum = 0;
// for (int i = 0; i < n; i++) {
// sum += array[i];
// }

// System.out.println("The sum of all array elements is: " + sum);
// }
// }
// //
// ************************************************************************************
// import java.util.Scanner;

// public class MaxMinArray {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();

// int[] array = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// array[i] = scanner.nextInt();
// }

// int max = array[0];
// int min = array[0];

// for (int i = 1; i < n; i++) {
// if (array[i] > max) {
// max = array[i];
// }
// if (array[i] < min) {
// min = array[i];
// }
// }

// System.out.println("Maximum element in the array is: " + max);
// System.out.println("Minimum element in the array is: " + min);
// }
// }
// //
// ************************************************************************************************
// import java.util.Scanner;

// public class EvenOddCount {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();

// int[] array = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// array[i] = scanner.nextInt();
// }

// int evenCount = 0;
// int oddCount = 0;

// for (int i = 0; i < n; i++) {
// if (array[i] % 2 == 0) {
// evenCount++;
// } else {
// oddCount++;
// }
// }

// System.out.println("Total even numbers: " + evenCount);
// System.out.println("Total odd numbers: " + oddCount);
// }
// }
// //
// ***********************************************************************************************
// import java.util.*;
// public class GlaAbhishek{
// public static void main(String[] args){
// Scanner sc=neww.Scanner(System.in);
// Strnig name=sc.nextline();
// System.out.println(name);
// }
// }
// import java.util.*;
// public class GlaAbhishek{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int c=0;
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }