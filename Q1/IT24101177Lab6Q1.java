import java.util.Scanner;
 public class IT24101177Lab6Q1{

public static void main(String[]args){

 Scanner input=new Scanner(System.in);

double number;
double square;
double squareRoot;

System.out.print("Enter a number:");
number=input.nextDouble();

square=number*number;
squareRoot=Math.sqrt(number);

System.out.println("The square of "+number+" is:"+square);
System.out.println("The squareRoot of "+number+" is:"+squareRoot);
   }
}



