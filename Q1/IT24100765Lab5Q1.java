import java.util.Scanner;

 public class IT24100765Lab5Q1 {
  public static void main(String[] args){

Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the first integer:");
         int number1=scanner.nextInt();


         System.out.print("Enter the second integer:");
           int number2=scanner.nextInt();


         System.out.print("Enter the third integer:");
          int number3=scanner.nextInt();


System.out.println("User entered numbers are:" + number1 + " " + number2 + " " + number3);
        
 if (number1 < number2 && number1 < number3) {
            System.out.println("The Smallest number is: " + number1);
    } else if (number2 < number1 && number2 < number3) {
            System.out.println("The Smallest number is: " + number2);
        } else {
            System.out.println("The Smallest number is: " + number3);
        }

     
   if (number1 > number2 && number1 > number3) {
            System.out.println("The Largest number is: " + number1);
      } else if (number2 > number1 && number2 > number3) {
            System.out.println("The Largest number is: " + number2);
        } else {
            System.out.println("The Largest number is: " + number3);
       }



scanner.close();


} 


}