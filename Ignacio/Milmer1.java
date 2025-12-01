
/**
 * Write a description of class Milmer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Milmer1
{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Enter a number between 1 to 100: ");
            num = scanner.nextInt();
        }
        while (num < 1 || num > 100);
        
        System.out.println("Valid number entered: " + num);
           
        }
}