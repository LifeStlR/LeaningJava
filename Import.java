import java.util.Scanner;

class Arithmetic{
 int M;
 int A;
 int S;
 double D;
 public void Multiplication(int a, int b){
    M = a * b;
    System.out.println(a + " times " + b + " equals to " + M);
 } 
 public void Division(int a, int b){
    D = a / b;
    System.out.println(a + " divided by " + b + " equals to " + D);
 }
}

public class AddSub extends Arithmetic{
 public void Addition(int x, int y){
   A=x+y;
   System.out.println("The sum of the given numbers: "+A);
 }
 public void Substraction(int x,int y){  
   S=x-y;
   System.out.println("The difference between the given numbers: "+S);
 }
 public static void main(String args[]){  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number : ");
     int a = sc.nextInt();
     System.out.println("Enter second number : ");
     int b = sc.nextInt();
     AddSub demo = new AddSub();
     System.out.println("Executing Methods in Super Class");
     demo.Multiplication(a,b);
     demo.Division(a,b);
     System.out.println("Executing Methods in Sub Class");
     demo.Addition(a, b);  
     demo.Substraction(a, b);  
 }
}