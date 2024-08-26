import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
int sum = 0;
int number = 1; 
while (number != -1) {
sum = sum + number; 
 System.out.print("Enter a number (-1 to quit): ");
 number = console.nextInt();
}
System.out.println("The total is " + sum);

}
}