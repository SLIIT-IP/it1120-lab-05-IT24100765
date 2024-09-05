import java.util.Scanner;

public class IT24100765Lab5Q2{

public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

System.out.print("Enter number of new members are introduced: ");
int mem_number = scanner.nextInt();


switch(mem_number)
{

case 0 : System.out.print("No Prize");

break;
case 1 :System.out.print("Price is a: Pen");
break;
case 2 :System.out.print("Price is a: Umbrella");
break;
case 3 :System.out.print("Price is a: Bag");
break;
case 4 : System.out.print("Price is a: Travalling Chair");
break;

default: 
if(mem_number>=5){System.out.print("Price is a: Headphone");}

else

{System.out.print("Input must be a number 0 or greater");}

break;
}

scanner.close();


















}

}