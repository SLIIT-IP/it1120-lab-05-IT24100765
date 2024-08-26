import java.util.Scanner;
public class IT24100765Lab5Q3 {
  public static void main(String[] args){

Scanner scanner= new Scanner(System.in);



System.out.print("Enter Start Date (1-31):");
int start_date = scanner.nextInt();



System.out.print("Enter End Date (1-31):");
int end_date = scanner.nextInt();


if (start_date > end_date){
System.out.println("Error: start date must be less than End Date");

return;
}

 if (1 > start_date && 1 > end_date){
System.out.println("Error: Days must be between 1 an 31");



return;
}



 if (31< start_date && end_date >31){
System.out.println("Error: Days must be between 1 an 31");



return;
}



double perday= 48000.0;
System.out.println("Room Charge per Day:" + perday);


System.out.print("Number of Days Reserved:");
int num_days = scanner.nextInt();

double total= perday * num_days;

System.out.printf("Total Amount to be Paid: %.2f%n", total);



scanner.close();




}





}