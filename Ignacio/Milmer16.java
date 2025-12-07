
/**
 * Write a description of class Milmer16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Milmer16
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        
        
        int digits = String.valueOf(Math.abs(num)).length();
       
        System.out.println("The number " + originalNum + " has " + digits + " digits.");
    }
}