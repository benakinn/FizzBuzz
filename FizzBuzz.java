import java.util.Scanner;

public class FizzBuzz{

 public static void main(String[] args) {
  Scanner num = new Scanner(System.in);
  System.out.println("Enter a Number:");
  int num1 = num.nextInt();
     
  
  for (int i=1; i<= num1;i++) {
   boolean fizz = i%3 == 0;
      boolean buzz = i%5 == 0;
   if (fizz == true && buzz == false) {
    System.out.println("Fizz");
   }
   else if (fizz == false  && buzz == true) {
    System.out.println("Buzz");
   }
   else if (fizz == true && buzz == true) {
     System.out.println("FizzBuzz");
   }
   else {
    System.out.println(i);
   }
   }
  }
 }
