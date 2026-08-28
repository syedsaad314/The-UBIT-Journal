import java.util.Scanner;

public class fileHandlingbasic {
         public static void main(String [] args){
                 try(Scanner read = new Scanner(System.in)){
                         System.out.print("Enter Your Name: ");
                         String name = read.next();
                         System.out.print("Enter Your Age: ");
                         Integer age = read.nextInt();
                         System.out.println("My Name is " + name + ". I am " + age + " Years Old.");
                 }
         }
 }  

