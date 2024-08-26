import java.util.Scanner;

public class IT24100765Lab5Q2{

 public static void main(String[] args){


Scanner scanner= new Scanner(System.in);

System.out.print("Enter the number of new members introduced:");
int num_members = scanner.nextInt();


if (num_members==0){
System.out.println("No price");
}

else if (num_members==1){
System.out.println("Price is a: Pen");}

else if (num_members==2){
System.out.println("Price is a: Umbrella");}

else if (num_members==3){
System.out.println("Price is a: Bag");}

else if (num_members==4){
System.out.println("Price is a: Travelling Chair");}

else if (num_members>=5){
System.out.println("Price is a: Headphone");}

else {System.out.println("Input must be a Number 0 or greater");}

scanner.close();

}

}