import java.util.Scanner;
 public class IT24101177Lab6Q3{

public static void main(String[]args){

 Scanner input=new Scanner(System.in);

System.out.println("Please enter positive integers(terminal input with -99)");
int count=0;
double RMS;
int numOfNum=0;
int total=0;

while(count>=0){ //checking positive 

   System.out.print("Enter a number:");
   count=input.nextInt();

if(count==(-99)) //terminated by -99
  {  break; }

  else if(count<0) // checking negative
{System.out.println("Invalid Input.Please enter a positive integer or -99 to terminate");}
   else
{total+=count*count; // update summation of count 
numOfNum=numOfNum+1; // update number of numbers
    }
 }
RMS=Math.sqrt(total/numOfNum); // root mean squre
System.out.println("The Root mean Squre (RMS) is:"+RMS);

 
  }
}